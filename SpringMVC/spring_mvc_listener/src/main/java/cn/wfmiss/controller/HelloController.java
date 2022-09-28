package cn.wfmiss.controller;

import cn.wfmiss.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @BelongsProject: Integration
 * @BelongsPackage: cn.wfmiss.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-27  16:52
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
