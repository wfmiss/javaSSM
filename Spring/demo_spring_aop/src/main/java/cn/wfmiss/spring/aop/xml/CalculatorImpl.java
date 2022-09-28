package cn.wfmiss.spring.aop.xml;


import org.springframework.stereotype.Component;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.proxy
 * @Author: wfmiss
 * @CreateTime: 2022-08-31  16:55
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result =i+j;
        System.out.println("方法内部，result:"+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result =i-j;
        System.out.println("方法内部，result:"+result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result =i*j;
        System.out.println("方法内部，result:"+result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result =i/j;
        System.out.println("方法内部，result:"+result);
        return result;
    }
}
