package cn.wfmiss.ssm.service.impl;

import cn.wfmiss.ssm.mapper.EmployeeMapper;
import cn.wfmiss.ssm.pojo.Employee;
import cn.wfmiss.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: cn.wfmiss.ssm.service.impl
 * @Author: wfmiss
 * @CreateTime: 2022-09-27  21:20
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,4);
        //查询员工的所有信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page=new PageInfo<Employee>(list,5);
        return page;
    }

}
