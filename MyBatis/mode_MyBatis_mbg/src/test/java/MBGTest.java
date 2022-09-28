import cn.wfmiss.mybatis.mapper.EmpMapper;
import cn.wfmiss.mybatis.pojo.Emp;
import cn.wfmiss.mybatis.pojo.EmpExample;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: PACKAGE_NAME
 * @Author: wfmiss
 * @CreateTime: 2022-08-16  00:12
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class MBGTest {
    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
        /*Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);*/
        //查询所有数据
        /*List<Emp> list =mapper.selectByExample(null);
        list.forEach(System.out::println);*/

        //根据条件查询数据
        /*EmpExample empExample=new EmpExample();
        empExample.createCriteria().andAgeEqualTo(20);
        List<Emp> list =mapper.selectByExample(empExample);
        list.forEach(System.out::println);*/
        //测试普通修改功能
        Emp emp=new Emp(1,"小黑",null,"女");
        //测试普通修改功能
        //mapper.updateByPrimaryKey(emp);
        //测试选择性修改
        mapper.updateByPrimaryKeySelective(emp);

        sqlSession.close();
    }
}
