package cn.wfmiss.spring.controller;

import cn.wfmiss.spring.service.BookService;
import cn.wfmiss.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-10  14:37
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }

    public void checkout(Integer userId,Integer[] bookIds){
        checkoutService.checkout(userId,bookIds);
    }
}
