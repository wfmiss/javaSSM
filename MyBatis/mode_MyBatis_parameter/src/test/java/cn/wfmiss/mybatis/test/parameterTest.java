package cn.wfmiss.mybatis.test;

import cn.wfmiss.mybatis.mapper.UserMapper;
import cn.wfmiss.mybatis.pojo.User;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/6
 * Time: 18:50
 * Description:
 */
public class parameterTest {
    @Test
    public void testChekLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.chekLoginByParam("admin2","123456");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"华强","12345676",12,"女","huaqiqng@qq.com");
        mapper.insertUser(user);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object>map=new HashMap<>();
        map.put("username","password");
        map.put("username","admin1");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin1", "123456");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("admin1");
        System.out.println(user);
        sqlSession.close();
    }
}
