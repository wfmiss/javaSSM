package cn.wfmiss.spring.controller;

import cn.wfmiss.spring.service.UserService;
import cn.wfmiss.spring.service.impl.UserServiceImpl;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.controller.service
 * @Author: wfmiss
 * @CreateTime: 2022-08-28  18:18
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class UserController {
    private UserService userService;
    public UserService getUserService(){
        return userService;
    }
    public void setUserService(UserService userService){
        this.userService=userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
