package cn.wfmiss.spring.test;

import cn.wfmiss.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-28  13:37
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class FactoryBeanTest {
    @Test
    public void testFactoryBean(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-factory.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);

    }
}
