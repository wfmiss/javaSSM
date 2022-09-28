package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.MyBatis.mapper
 * @Author: wfmiss
 * @CreateTime: 2022-08-08  14:45
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public interface EmpMapper {

    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 获取员工及所对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptEmpId(@Param("empId") Integer empId);

    /**
     * 通过分步查询员工以及所对应的部门信息的第一步
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分步查询部门的以及部门中的员工信息的第二步
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);

}
