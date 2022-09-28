package cn.wfmiss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: SpringMVC
 * @BelongsPackage: cn.wfmiss.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-21  13:36
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Controller
public class TestViewController {

    @RequestMapping("/test/view/thymeleaf")
    public String TestThymeleafView(){
        return "success";
    }

    @RequestMapping("/test/view/forward")
    public String TestInternalResourceView(){
        return "forward:/test/model";
    }

    @RequestMapping("/test/view/redirect")
    public String TestRedirectView(){
        return "redirect:/test/model";
    }

}
