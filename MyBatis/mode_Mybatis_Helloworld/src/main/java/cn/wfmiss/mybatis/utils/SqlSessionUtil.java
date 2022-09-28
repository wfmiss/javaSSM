package cn.wfmiss.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/5
 * Time: 19:17
 * Description:
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        try {
            //获取核心配置文件的输入流
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

            //获取SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();

            //获取SqlSessionFactory
            SqlSessionFactory sqlsessionFactory = sqlSessionFactoryBuilder.build(is);

            //获取SqlSession对象
            sqlSession = sqlsessionFactory.openSession(true);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSession;
    }
}
