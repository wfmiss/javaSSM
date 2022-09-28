import cn.wfmiss.mybatis.mapper.EmpMapper;
import cn.wfmiss.mybatis.pojo.Emp;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: PACKAGE_NAME
 * @Author: wfmiss
 * @CreateTime: 2022-08-17  17:34
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class PageTest {

    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        ///查询功能之前开启分页功能
        Page<Object> page = PageHelper.startPage(1, 4);
        List<Emp> emps=mapper.selectByExample(null);
        //查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo=new PageInfo<>(emps,5);
        emps.forEach(System.out::println);
        System.out.println(pageInfo);
        sqlSession.close();
    }
}
