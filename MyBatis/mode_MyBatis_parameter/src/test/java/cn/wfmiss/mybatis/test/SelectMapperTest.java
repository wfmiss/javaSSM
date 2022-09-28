package cn.wfmiss.mybatis.test;

import cn.wfmiss.mybatis.mapper.SelectMapper;
import cn.wfmiss.mybatis.pojo.User;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.mybatis.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-07  00:25
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class SelectMapperTest {
    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Object>> allUserToMap = mapper.getAllUserToMap();
//        allUserToMap.forEach(System.out::println);
        Map<String, Object> allUserToMap = mapper.getAllUserToMap();
        System.out.println(allUserToMap);
        sqlSession.close();
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(1);
        System.out.println(userByIdToMap);
        sqlSession.close();
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println("用户总数量为:"+count);
        sqlSession.close();
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

}
