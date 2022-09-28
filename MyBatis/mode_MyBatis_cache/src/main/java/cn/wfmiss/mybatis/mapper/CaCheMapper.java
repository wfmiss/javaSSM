package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/14
 * Time: 19:48
 * Description:
 */
public interface CaCheMapper {
    /**
     * 根据员工id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     * @param emp
     */
    void insertEmp(Emp emp);
}
