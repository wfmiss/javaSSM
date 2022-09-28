package cn.wfmiss.mybatis.mapper;

import cn.wfmiss.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Date: 2022/8/11
 * Time: 17:04
 * Description:
 */
public interface DynamicSQLMapper {

    /**
     * 根据条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 使用choose查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工信息
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
