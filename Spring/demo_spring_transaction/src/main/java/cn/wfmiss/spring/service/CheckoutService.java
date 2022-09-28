package cn.wfmiss.spring.service;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.server.impl
 * @Author: wfmiss
 * @CreateTime: 2022-09-11  00:25
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public interface CheckoutService {
    /**
     * 结账
     * @param userId
     * @param bookIds
     */
    void checkout(Integer userId, Integer[] bookIds);

}
