package cn.wfmiss.spring.test;

import cn.wfmiss.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.test
 * @Author: wfmiss
 * @CreateTime: 2022-08-27  17:22
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class lifeCycleTest {
    /**
     * 1、实例化
     * 2、依赖注入
     * 3、后置处理器的PostProcessBeforeInitialization
     * 4、初始化，需要通过bean的init-method属性指定初始化的方法
     * 5、后置处理器的PostProcessAfterInitialization
     * 6、IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
     *
     * bean的后置处理器会在生命周期的初始化之前后添加额外操作
     * 需要实现BeanPostProcessor接口且配置到IOC容器中
     * 需要注意的是，bean后置处理器不是单独对某一个bean生效，而是针对IOC容器中所有的bean都会执行
     *
     * 注意：
     * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器时来执行
     * 若bean的作用域为多例时，生命周期的前三个步骤会在获取bean时来执行
     */

    @Test
    public void test(){
        //ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext ioc=new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
