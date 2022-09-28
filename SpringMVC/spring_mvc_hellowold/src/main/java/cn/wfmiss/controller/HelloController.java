package cn.wfmiss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: SpringMVC
 * @BelongsPackage: cn.wfmiss.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-11  15:33
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String protal(){
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        //将逻辑视图返回
        return "success";
    }
}
