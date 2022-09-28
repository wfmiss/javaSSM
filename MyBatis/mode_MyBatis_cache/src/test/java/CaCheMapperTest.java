import cn.wfmiss.mybatis.mapper.CaCheMapper;
import cn.wfmiss.mybatis.pojo.Emp;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: PACKAGE_NAME
 * @Author: wfmiss
 * @CreateTime: 2022-08-14  19:52
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class CaCheMapperTest {

    /**
     * MyBatis的一级缓存：
     * MyBatis的一级缓存是sqlSession级别的，即通过一个sqlSession查询的数据会被缓存
     * 再次使用同一个sqlSession查询同一条数据，会从缓存中获取
     * 使一级缓存失效的四种情况：
     * 1.不同的SqlSession对应不同的一级缓存
     * 2.同一个SqlSession但是查询条件不同
     * 3.同一个SqlSession两次查询期间执行了任何一次增删改操作
     * 4.同一个SqlSession两次查询期间手动清空了缓存
     */
    @Test
    public void testCaChe() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sessionFactory.openSession();
        CaCheMapper mapper1 = sqlSession1.getMapper(CaCheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
        sqlSession1.close();

        SqlSession sqlSession2 = sessionFactory.openSession();
        CaCheMapper mapper2 = sqlSession2.getMapper(CaCheMapper.class);
        Emp emp2 = mapper2.getEmpById(1);
        System.out.println(emp2);
        sqlSession2.close();
    }

    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CaCheMapper mapper = sqlSession.getMapper(CaCheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);
        sqlSession.clearCache();
        //mapper.insertEmp(new Emp(null, "狗", 25, "男"));

        Emp emp2 = mapper.getEmpById(1);
        System.out.println(emp2);
        sqlSession.close();
    }
}
