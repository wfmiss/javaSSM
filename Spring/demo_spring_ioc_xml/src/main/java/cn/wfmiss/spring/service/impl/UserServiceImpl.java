package cn.wfmiss.spring.service.impl;

import cn.wfmiss.spring.dao.UserDao;
import cn.wfmiss.spring.service.UserService;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.service.impl
 * @Author: wfmiss
 * @CreateTime: 2022-08-28  18:24
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public UserDao getUserDao(){
        return userDao;
    }
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }


    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
