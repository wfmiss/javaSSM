package cn.wfmiss.spring.dao;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.dao
 * @Author: wfmiss
 * @CreateTime: 2022-09-10  14:38
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public interface BookDao {
    /**
     * 根据图书的id查询图书的价格
     * @param bookId
     * @return
     */
    Integer getPriceByBookDao(Integer bookId);

    /**
     * 更新图书库存
     * @param bookId
     */
    void updateStock(Integer bookId);

    /**
     * 修改用户余额
     * @param userId
     * @param price
     */
    void updateBalance(Integer userId, Integer price);
}
