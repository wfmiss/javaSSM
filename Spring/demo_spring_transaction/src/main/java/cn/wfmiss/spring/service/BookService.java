package cn.wfmiss.spring.service;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.server
 * @Author: wfmiss
 * @CreateTime: 2022-09-10  14:36
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public interface BookService {
    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}
