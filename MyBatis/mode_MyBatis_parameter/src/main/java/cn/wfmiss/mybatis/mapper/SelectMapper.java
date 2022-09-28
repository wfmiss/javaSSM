package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/7
 * Time: 0:23
 * Description:
 */
public interface SelectMapper {
    /**
     * 若sql语句查询的结果为多条数据时,一定不能以实体类类型作为方法的放回值
     * 否则会抛出异常,TooManyResultsException
     * 若sql语句查询的结果为一条数据时,此时可以使用实体类类型或List集合类型作为方法的放回值
     */

    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户的总数量
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为Map集合
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为Map集合
     * @return
     */
//    List<Map<String,Object>> getAllUserToMap();
    @MapKey("id")
    Map<String,Object> getAllUserToMap();

}
