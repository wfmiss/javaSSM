package cn.wfmiss.mybatis.pojo;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.MyBatis.pojo
 * @Author: wfmiss
 * @CreateTime: 2022-08-08  14:29
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class Emp {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private Dept deptId;

    public Emp(Integer empId, String empName, Integer age, String gender, Dept deptId) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDeptId(Dept deptId) {
        this.deptId = deptId;
    }

    public Emp() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Dept getDeptId() {
        return deptId;
    }
}
