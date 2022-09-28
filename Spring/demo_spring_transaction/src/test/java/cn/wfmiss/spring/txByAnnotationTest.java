package cn.wfmiss.spring;

import cn.wfmiss.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring
 * @Author: wfmiss
 * @CreateTime: 2022-09-10  21:58
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 * 声明式事务的配置步骤：
 * 1、在spring的配置文件中来配置事务管理器
 * 2、开启事务的注解驱动
 * 在需要被事务管理的方法上，添加@Transactional注解，该方法就会被事务管理
 * @Transactional注解表示的位置：
 * 1、可以表示在犯法上
 * 2、表示在类上，则类中所有的方法都会被事务管理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class txByAnnotationTest {
    @Autowired
    private BookController bookController;
    @Test
    public void testBuyBook(){
        //bookController.buyBook(1,1);
        bookController.checkout(1,new Integer[]{1,2});
    }

}
