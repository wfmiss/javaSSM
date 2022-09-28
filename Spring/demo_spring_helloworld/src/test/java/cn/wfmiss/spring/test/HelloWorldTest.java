package cn.wfmiss.spring.test;

import cn.wfmiss.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-29  20:22
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class HelloWorldTest {
    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        helloworld.sayHello();
    }
}
