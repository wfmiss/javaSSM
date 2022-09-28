package cn.wfmiss.mybatis.pojo;

import java.util.List;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.MyBatis.pojo
 * @Author: wfmiss
 * @CreateTime: 2022-08-08  14:43
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class Dept {
    private Integer deptId;
    private String deptName;
    private List<Emp> emps;

    public Dept(Integer deptId, String deptName, List<Emp> emps) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.emps = emps;
    }
    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
