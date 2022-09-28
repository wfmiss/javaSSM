package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/7
 * Time: 12:58
 * Description:
 */
public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * 动态设置表名，查询用户信息
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /**
     * 添加用户信息并获取自增的主键
     * @param user
     */
    void insertUser(User user);
}
