package cn.wfmiss.spring.service.impl;

import cn.wfmiss.spring.dao.UserDao;
import cn.wfmiss.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.service.impl.UserServiceImp
 * @Author: wfmiss
 * @CreateTime: 2022-08-29  20:29
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    //@Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
