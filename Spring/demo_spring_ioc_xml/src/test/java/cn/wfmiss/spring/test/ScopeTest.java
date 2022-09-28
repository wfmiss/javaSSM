package cn.wfmiss.spring.test;

import cn.wfmiss.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-26  23:40
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class ScopeTest {
    @Test
    public void testScope(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-scope.xml");
        Student student1 = ioc.getBean(Student.class);
        Student student2 = ioc.getBean(Student.class);

        System.out.println(student1==student2);
    }
}
