package cn.wfmiss.mybatis.test;

import cn.wfmiss.mybatis.mapper.UserMapper;
import cn.wfmiss.mybatis.pojo.User;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/5
 * Time: 19:17
 * Description:
 */
public class MyBatisTest {
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser();
        sqlSession.close();
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getAllUser();
        //for (User s:user) System.out.println(s);
        user.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testDeleteUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser();
        System.out.println("执行结果："+i);
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //获取sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();

        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        //获取sql的会话SqlSession(不会自动提交事务)，是MyBatis提供的操作数据库的对象
        //SqlSession sqlSession=sqlSessionFactory.openSession();
        //获取sql的会话SqlSession(会自动提交事务)，是MyBatis提供的操作数据库的对象
        SqlSession sqlSession=sqlSessionFactory.openSession(true);

        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //调用mapper接口中的方法，实现添加用户信息的功能
        // int i = mapper.insertUser();
        //提供sql以及的唯一标识找到sql并执行，唯一标识是namespace.sqlId
        int i = sqlSession.insert("cn.wfmiss.mybatis.mapper.UserMapper.insertUser");
        System.out.println("执行结果："+i);

        //提交事务
        //sqlSession.commit();

        //关闭会话
        sqlSession.close();
    }
}
