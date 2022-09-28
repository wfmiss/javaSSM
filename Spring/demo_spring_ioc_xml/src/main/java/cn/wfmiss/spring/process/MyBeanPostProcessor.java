package cn.wfmiss.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.process
 * @Author: wfmiss
 * @CreateTime: 2022-08-28  12:00
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //此方法在bean的生命周期初始化之前执行
        System.out.println("MyBeanPostProcessor-->后置处理器postProcessBeforeInitialization");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //此方法在bean的生命周期初始化之后执行
        System.out.println("MyBeanPostProcessor-->后置处理器postProcessAfterInitialization");
        return null;
    }
}
