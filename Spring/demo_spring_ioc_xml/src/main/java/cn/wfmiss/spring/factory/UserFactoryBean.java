package cn.wfmiss.spring.factory;

import cn.wfmiss.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.factory
 * @Author: wfmiss
 * @CreateTime: 2022-08-28  13:12
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 * FactoryBean是一个接口，需要创建一个类实现接口
 * 其中有三个方法：
 * getObject():通过一个对象交给IOC容器
 * getObjectType():设置所提供对象的类型
 * isSingleton():所提供的对象是否单例
 * 当把FactoryBean的实现类配置为bean时，会将当前类中getObject()所返回的对象交给IOC容器管理
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
