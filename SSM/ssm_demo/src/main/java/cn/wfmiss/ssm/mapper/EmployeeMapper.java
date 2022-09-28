package cn.wfmiss.ssm.mapper;

import cn.wfmiss.ssm.pojo.Employee;
import cn.wfmiss.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: cn.wfmiss.ssm.mapper
 * @Author: wfmiss
 * @CreateTime: 2022-09-27  21:44
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public interface EmployeeMapper {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
