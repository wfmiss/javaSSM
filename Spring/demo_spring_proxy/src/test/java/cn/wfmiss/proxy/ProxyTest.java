package cn.wfmiss.proxy;

import cn.wfmiss.spring.proxy.Calculator;
import cn.wfmiss.spring.proxy.CalculatorImpl;
import cn.wfmiss.spring.proxy.CalculatorStaticProxy;
import cn.wfmiss.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.proxy
 * @Author: wfmiss
 * @CreateTime: 2022-09-01  22:19
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class ProxyTest {
    /**
     * 动态代理有两种：
     * 1.jdk动态代理，要求必须接口，最终生成的代理类和实现相同的接口
     *   在com.sun.proxy包下，类名为$proxy2
     * 2.cglib动态代理，最终生成的代理类会继承目标类，并且和目标类在相同的包下
     */

    @Test
    public void testProxy(){
        //CalculatorStaticProxy proxy=new CalculatorStaticProxy(new CalculatorImpl());
        //proxy.add(10, 30);
        ProxyFactory proxyFactory=new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        calculator.div(100,10);
    }
}
