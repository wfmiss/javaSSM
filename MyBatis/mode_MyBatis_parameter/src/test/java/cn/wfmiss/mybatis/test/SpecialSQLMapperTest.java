package cn.wfmiss.mybatis.test;

import cn.wfmiss.mybatis.mapper.SpecialSQLMapper;
import cn.wfmiss.mybatis.pojo.User;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.mybatis.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-07  12:59
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class SpecialSQLMapperTest {
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user=new User(null,"xiaoming","xiao123",45,"男","xiaoming@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testJDBC(){
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("", "", "");
//            String sql="select * from t_user where username like '%?%'";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1,"a");
            String sql="insert into t_user values()";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet resultSet=ps.getGeneratedKeys();
            resultSet.next();
            int id = resultSet.getInt(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> userList = mapper.getUserList("t_user");
        userList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        int i = mapper.deleteMore("9,10,11,12,13");
        System.out.println("成功删除数据："+i+" 条");
    }

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> userByLike = mapper.getUserByLike("a");
        userByLike.forEach(System.out::println);
        sqlSession.close();
    }
}
