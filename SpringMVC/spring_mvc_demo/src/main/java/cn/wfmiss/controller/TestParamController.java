package cn.wfmiss.controller;

import cn.wfmiss.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @BelongsProject: SpringMVC
 * @BelongsPackage: cn.wfmiss.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-18  21:13
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 * 1、通过servletAPI获取
 * 只需要在控制器方法的形参位置设置HttpServletRequest 类型的形参
 * 就可以在控制器方法中使用request对象获取请求参数
 * 2、通过控制器方法的形参获取
 * 只需在控制器方法的形参位置，设置一个形参的名字和请求参数的名字一致即可
 * 3、@RequestParam：将请求参数和控制器参数的形参的绑定
 * @Request注解的三个属性：value、request、defaultValue
 * value：设置和形参绑定的请求参数的名字
 * request：设置是否必须传输value所对应的请求参数，默认值为true，表示value所对应的请求参数必须传输，否则页面报错：
 * 400 - Request String parameter 'xxx' is not present
 * defaultValue：设置当前没有传输value所对应的请求参数时，为形参设置的默认值，此时和required属性值
 * 4、@RequestHeader：将请求头信息和控制器方法的形参绑定
 * 5、CookieValue：将cookie数据和控制器方法的形参绑定
 * 6、通过控制器方法的实体类类型的形参获取请求参数
 * 需要在控制器方法的形参位置设置实体类类型的形参，要保证实体类中的属性的属性名和请求参数的名字一致
 * 7、解决获取请求参数的乱码问题
 * 在web.xml中配置Spring的编码过滤器characterEncodingFilter
 */
@Controller
public class TestParamController {
    @RequestMapping("/param/servletAPI")
    public String getParamServerAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam(
            @RequestParam(value = "userName",required = false,defaultValue = "hello") String username ,
            String password,
            @RequestHeader("referer") String referer,
            @CookieValue("JSESSIONID") String jsessionId
    ){
        System.out.println("jsessionId:"+jsessionId);
        System.out.println("referer:"+referer);
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);
        return "success";
    }
}
