package cn.wfmiss.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.aop.annotation
 * @Author: wfmiss
 * @CreateTime: 2022-09-03  13:19
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Component
public class LoggerAspect {
    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应签名信息
        Signature signature = joinPoint.getSignature();
        //获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,方法："+signature.getName()+",参数："+ Arrays.toString(args));
    }

    public void afterAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应签名信息
        Signature signature = joinPoint.getSignature();
        //获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,方法：："+signature.getName()+",执行完毕");
    }

    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
        //获取连接点所对应签名信息
        Signature signature = joinPoint.getSignature();
        //获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,方法：："+signature.getName()+",结果："+result);
    }

    /**
     * 在返回通知中若要获取目标对象方法的返回值
     * 只需要通过@AfterReturning注解的reurning
     * 就可以将通知方法的某个参数指定为接收目标对象的出现的异常的参数
     */
    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Throwable ex){
        //获取连接点所对应签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,方法："+signature.getName()+",异常通知:"+ex);
    }

    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){

        Object result=null;
        try {
            System.out.println("环绕通知-->前置通知");
            //表示目标对象方法的执行
             result = joinPoint.proceed();
            System.out.println("环绕通知-->返回通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知-->异常通知");
        }finally {
            System.out.println("环绕通知-->后置通知");
        }
        return result;
    }
}
