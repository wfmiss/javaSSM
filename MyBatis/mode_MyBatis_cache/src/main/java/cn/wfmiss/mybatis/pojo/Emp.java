package cn.wfmiss.mybatis.pojo;

import java.io.Serializable;

/**
 * @BelongsProject: JavaSSM
 * @BelongsPackage: cn.wfmiss.mybatis.pojo
 * @Author: wfmiss
 * @CreateTime: 2022-08-11  17:00
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */

public class Emp implements Serializable {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;

    public Emp(Integer empId, String empName, Integer age, String gender) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
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
}
