package cn.wfmiss.spring.controller;

import cn.wfmiss.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.controller
 * @Author: wfmiss
 * @CreateTime: 2022-08-29  20:27
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Controller("controller")
public class UserController {
    @Autowired
    //@Qualifier("userServiceImpl")
    private UserService userService;

    //public UserController(UserService userService){
    //    this.userService=userService;
    //}

    /*public void setUserController(UserService userController){
        this.userService=userController;
    }*/

    public void saveUser(){
        userService.saveUser();
    }

}
