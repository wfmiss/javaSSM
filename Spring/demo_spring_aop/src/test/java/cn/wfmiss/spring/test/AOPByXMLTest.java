package cn.wfmiss.spring.test;


import cn.wfmiss.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-09-04  23:09
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class AOPByXMLTest {
    @Test
    public void testAOPByXML(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        int add = calculator.add(1, 1);
    }
}
