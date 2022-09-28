package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.User;

import java.util.List;

public interface UserMapper{

    //添加用户信息
    int insertUser();

    //修改用户信息
    void updateUser();

    //删除用户信息
    int deleteUser();

    //根据ID查询用户信息
    User getUserById();

    //查询所有用户信息
    List<User> getAllUser();

}