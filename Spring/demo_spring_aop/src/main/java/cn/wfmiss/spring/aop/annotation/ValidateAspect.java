package cn.wfmiss.spring.aop.annotation;

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
@Aspect
@Order(1)
public class ValidateAspect {
    //@Before("execution(* cn.wfmiss.spring.aop.annotation.CalculatorImpl.*(..))")
    @Before("cn.wfmiss.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
