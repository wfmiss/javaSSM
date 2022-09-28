package cn.wfmiss.spring.service.impl;

import cn.wfmiss.spring.service.BookService;
import cn.wfmiss.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.server.impl
 * @Author: wfmiss
 * @CreateTime: 2022-09-11  00:23
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Override
    //@Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for (Integer bookId:bookIds) {
            bookService.buyBook(userId,bookId);
        }
    }
}
