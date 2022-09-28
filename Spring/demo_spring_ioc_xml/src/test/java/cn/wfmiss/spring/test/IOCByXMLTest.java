package cn.wfmiss.spring.test;

import cn.wfmiss.spring.pojo.Clazz;
import cn.wfmiss.spring.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-18  21:14
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class IOCByXMLTest {
    /**
     * 获取bean的三种方式：
     * 1.根据bean的id获取
     * 2.根据bean的类型获取
     *  注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
     *      若没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
     *      若有多个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
     * 3.更具bean的id和类型获取
     * 结论：
     * 根据类型来获取`bean`时，在满足bean唯一性的前提下，其实只是看：
     *  『对象 `instanceof` 指定的类型』的返回结果，只要返回的是`true`就可以认定为和类型匹配，能够获取到。
     * 即通过bean的类型、bean所继承的类的类型、bean所实现的接口类型都可以获取bean
     */
    @Test
    public void testIOC(){
        //获取IOC容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
        //Student studentOne = (Student) ioc.getBean("studentOne");
        //Student studentOne = ioc.getBean(Student.class);
        //Student studentOne = ioc.getBean("studentOne", Student.class);
        Person person = ioc.getBean( Person.class);
        System.out.println(person);
    }

    @Test
    public void testDI(){
        //获取IOC容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
        //Person person = ioc.getBean("studentTwo",Person.class);
        //System.out.println(person);
        //Person person = ioc.getBean("studentThree",Person.class);
        //System.out.println(person);
        //Person person = ioc.getBean("studentFour",Person.class);
        //System.out.println(person);
        //Person person = ioc.getBean("studentFive", Person.class);
        //System.out.println(person);
        //Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);
        //System.out.println(clazzOne);
        Person person = ioc.getBean("studentFive", Person.class);
        System.out.println(person);
    }
}
