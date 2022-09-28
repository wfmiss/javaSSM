package cn.wfmiss.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-26  23:12
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class DataSourceTest {
    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
