package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.MyBatis.mapper
 * @Author: wfmiss
 * @CreateTime: 2022-08-08  23:57
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public interface DeptMapper {

    /**
     * 通过分步查询员工以及所对应的部门信息的第二步
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门以及部门中的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分步查询部门以及部门中的员工信息的第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
