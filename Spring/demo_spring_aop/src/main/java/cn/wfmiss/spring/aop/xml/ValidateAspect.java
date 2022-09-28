package cn.wfmiss.spring.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.aop.annotation
 * @Author: wfmiss
 * @CreateTime: 2022-09-04  19:44
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Component
public class ValidateAspect {
    public void beforMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
