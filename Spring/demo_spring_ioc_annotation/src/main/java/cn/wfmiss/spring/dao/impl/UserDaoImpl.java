package cn.wfmiss.spring.dao.impl;

import cn.wfmiss.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.dao.impl
 * @Author: wfmiss
 * @CreateTime: 2022-08-29  20:32
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
