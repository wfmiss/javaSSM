package cn.wfmiss.mybatis;

import cn.wfmiss.mybatis.mapper.DynamicSQLMapper;
import cn.wfmiss.mybatis.pojo.Emp;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.mybatis
 * @Author: wfmiss
 * @CreateTime: 2022-08-11  17:14
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class DynamicSQLMapperTest {

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds=new Integer[]{5,6,7,8};
        mapper.deleteMoreEmp(empIds);
        sqlSession.close();
    }

    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 =new Emp(null,"小明1",20,"男");
        Emp emp2 =new Emp(null,"小明2",20,"男");
        Emp emp3 =new Emp(null,"小明3",20,"男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);
        sqlSession.close();
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        Emp emp=new Emp(null,"张三",null,null);
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByChoose(emp);
        empByCondition.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        Emp emp=new Emp(null,"",20,null);
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        empByCondition.forEach(System.out::println);
        sqlSession.close();
    }
}
