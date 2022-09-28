import cn.wfmiss.mybatis.mapper.DeptMapper;
import cn.wfmiss.mybatis.mapper.EmpMapper;
import cn.wfmiss.mybatis.pojo.Dept;
import cn.wfmiss.mybatis.pojo.Emp;
import cn.wfmiss.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: PACKAGE_NAME
 * @Author: wfmiss
 * @CreateTime: 2022-08-08  14:54
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class ResultMapTest {
    @Test
    public void testGetDeptAndEmpByStepOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByStepOne = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(deptAndEmpByStepOne);
        sqlSession.close();
    }

    @Test
    public void testGetDeptAndEmpByDeptId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);
        sqlSession.close();
    }

    @Test
    public void testGetEmpAndDeptByStepOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByStepOne(1);
        System.out.println(empByEmpId);
        sqlSession.close();
    }

    @Test
    public void testGetEmpAndDeptEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptEmpId(1);
        System.out.println(empByEmpId);
        sqlSession.close();
    }

    @Test
    public void testGetEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println(empByEmpId);
        sqlSession.close();
    }
}
