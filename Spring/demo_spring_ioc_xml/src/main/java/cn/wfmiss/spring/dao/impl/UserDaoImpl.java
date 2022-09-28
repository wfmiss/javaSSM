package cn.wfmiss.spring.dao.impl;

import cn.wfmiss.spring.dao.UserDao;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.dao
 * @Author: wfmiss
 * @CreateTime: 2022-08-28  18:25
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
