package cn.wfmiss.spring.test;

import cn.wfmiss.spring.aop.annotation.Calculator;
import cn.wfmiss.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-09-03  13:43
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class AOPAnnotationTest {
    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(120,10);
    }
}
