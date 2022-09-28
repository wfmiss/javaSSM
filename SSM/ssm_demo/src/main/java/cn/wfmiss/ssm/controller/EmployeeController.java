package cn.wfmiss.ssm.controller;

import cn.wfmiss.ssm.pojo.Employee;
import cn.wfmiss.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @BelongsProject: SSM
 * @BelongsPackage: cn.wfmiss.ssm.controller
 * @Author: wfmiss
 * @CreateTime: 2022-09-27  20:46
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 * 查询所有的员工信息--->/employee--->get
 * 根据id查询的员工信息--->/employee/page/1--->get
 * 跳转到添加页面--->/toa/add--->get
 * 添加员工信息--->/employee--->post
 * 修改员工信息--->/employee--->put
 * 删除员工信息--->/employee/1--->delete
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{PageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("PageNum") Integer pageNum,Model model){
        //获取员工的分页信息
        PageInfo<Employee> page=employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求页
        model.addAttribute("page",page);
        return "employee_list";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //查询所有的员工信息
        List<Employee> list=employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("list",list);
        //跳转到employee_list.html
        return "employee_list";
    }

}
