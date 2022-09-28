package cn.wfmiss.spring;

import cn.wfmiss.spring.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring
 * @Author: wfmiss
 * @CreateTime: 2022-09-10  21:58
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-xml.xml")
public class txByXMLTest {
    @Autowired
    private BookController bookController;
    @Test
    public void testBuyBook(){
        bookController.buyBook(1,1);
        //bookController.checkout(1,new Integer[]{1,2});
    }

}
