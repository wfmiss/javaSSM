package cn.wfmiss.ssm.service;

import cn.wfmiss.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: cn.wfmiss.ssm.service
 * @Author: wfmiss
 * @CreateTime: 2022-09-27  21:20
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public interface EmployeeService {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
