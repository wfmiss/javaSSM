package cn.wfmiss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @BelongsProject: SpringMVC
 * @BelongsPackage: cn.wfmiss.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-11  18:18
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 * 1、@RequestMapping注解标识的位置
 * @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求的请求路径的具体信息
 * 2、@RequestMapping注解value属性
 * value属性是数组类型，即当前浏览器发送请求的请求路径匹配value属性中的任何一个值
 * 则当前请求就会备注解标识的方法进行处理
 * 3、@RequestMapping注解method属性
 * 作用：通过请求的请求方式匹配请求
 * method属性是RequestMethod类型的数组，即当前浏览器所发送请求路径匹配value属性中的任何一种请求方式
 * 则当前请求就会备注解标识的方法进行处理
 * 若浏览器所发送的请求的请求路径和@RequestMapping注解的value属性匹配，但是请求方式不匹配
 * 此时页面报错：405 - Request method ‘GET’ not supported
 * 在@RequestMapping的基础上，结合请求方式的一些派生注解：
 * @GetMapping，@PostMapping，@DeleteMapping，@PutMapping
 * 4、@RequestMapping注解的params属性
 * 作用：通过请求的请求参数匹配请求，即浏览器发送的请求的请求参数必须满足params属性的设置
 * params可以使用四种表达式：
 * "params":表示当前请求的请求参数中 必须 携带param参数
 * "!params":表示当前请求的请求参数中 一定不能 携带param参数
 * "params=value":表示当前请求的请求参数中 必须 携带param参数且值必须为value
 * "params!=value":表示当前请求的请求参数中 可以不 携带param，若携带值一定不能是value
 * 若浏览器所发送的请求的请求路径和@RequestMapping注解value属性匹配，但是请求参数不匹配
 * 此时页面报错：400 - Parameter conditions "username" not met for actual request parameters:
 * 5、@RequestMapping注解的headers属性
 * 作用：通过请求的请求的参数匹配请求，即浏览器发送的请求的请求参数必须满足params属性到的设置
 * 若浏览器所发送的请求的请求路径和@RequestMapping注解value属性匹配，但是请求头信息不匹配
 * 此时页面报错：404
 * 6、SpringMVC支持ant风格的路径
 * 在@RequestMapping注解的value属性值中设置一些特殊字符
 * ?:任意的单个字符（不包括?）
 * *:表示任意个字符（不包括?和/）
 * **:表示层数的任意目录，注意：使用方式只能把**写在双斜线中，前后不能有任何的其他字符
 * 7、@RequestMapping注解使用路径中的占位符
 * 传统：/deleteUser?id=1
 * rest:user/delete/1
 * 需要在@RequestMapping注解中的所设置的路径中，使用{xxx}的方式表示路径中的数据
 * 在通过@PatchVariable注解，将占位符所标识的值和控制器方法的形参进行绑定
*/
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //此时控制器方法所匹配的请求的请求路径为/test/hello
    @RequestMapping(
            value = {"/hello","/abc"},
            method= {RequestMethod.POST,RequestMethod.GET},
            //params = {"username","!password","age=20","gender!=女"},
            headers = {"referer","",""}
    )
    public String hello(){
        return "success";
    }

    //@RequestMapping("/a?a/test/ant")
    //@RequestMapping("/a*a/test/ant")
    @RequestMapping("/**/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id="+id+",username="+username);
        return "success";
    }
}
