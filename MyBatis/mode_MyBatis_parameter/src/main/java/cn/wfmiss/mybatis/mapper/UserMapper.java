package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/6
 * Time: 17:57
 * Description:
 * mybatis获取值的两种方式：#{}和${}
 * #{}的本质是占位符，${}的本质是字符串拼接
 * 1、若mapper接口方法的参数为单数个的字面量类型
 * 此时可以通过#{}和${}以任意的内容获取参数值，一定要注意${}的单引号问题（''）
 * 2、若mapper接口方法的参数为多数个的字面量类型
 * 此时MyBatis会自动将这些参数放在一个map集合中，
 * 以`arg0,arg1...`为键，以参数为值；
 * 以`param1,param2...`为键，以参数为值；
 * 因此只需要通过`${}`和`#{}`访问map集合的键就可以获取相对应的值，一定要注意`${}`需要手动加单引号
 * 3.若mapper接口方法的参数为map集合类型的参数
 * 只需要通过`${}`和`#{}`访问map集合的键就可以获取相对应的值，一定要注意`${}`需要手动加单引号
 * 4.若mapper接口方法的参数为实体类类型的参数
 * 只需要通过#{}和${}访问实体类中的属性名，就可以获取相对应的属性值，一定要注意`${}`需要手动加单引号
 * 5、可以在mapper接口方法参数上设置@Param注解
 * 此时可以MyBatis会将这些参数放在map中，以两种方式进行存储
 * 以@Param注解的value属性值未键，以参数为值
 * 以Param1、Param2…注解的value属性值未键，以参数为值
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     * @author: wfmiss
     * @date: 2022/8/6 19:24
     * @param:
     * @return:
     **/
    User getUserByUsername(String username);

    /**
     * 验证登录
     * @author: wfmiss
     * @date: 2022/8/6 19:27
     * @param: username
     * @param: password
     **/
    User checkLogin(String username,String password);

    /**
     * 验证登录（以map集合作为参数）
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录（使用@param注解）
     * @param username
     * @param password
     * @return
     */
    User chekLoginByParam(@Param("username")String username,@Param("password") String password);
}
