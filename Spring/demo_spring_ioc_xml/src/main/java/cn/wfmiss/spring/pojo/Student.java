package cn.wfmiss.spring.pojo;

import java.util.Arrays;
import java.util.Map;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.pojo
 * @Author: wfmiss
 * @CreateTime: 2022-08-18  20:52
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class Student implements Person {
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Double score;
    private String[] hobby;
    private Clazz clazz;
    private Map<String,Teacher> teacherMap;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", hobby=" + Arrays.toString(hobby) +
                ", clazz=" + clazz +
                ", teacherMap=" + teacherMap +
                '}';
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Double score, String[] hobby, Clazz clazz, Map<String, Teacher> teacherMap) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.score = score;
        this.hobby = hobby;
        this.clazz = clazz;
        this.teacherMap = teacherMap;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Double score, String[] hobby, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.score = score;
        this.hobby = hobby;
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student(Integer sid, String sname, Integer age, String gender, Double score, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
        this.score = score;
        this.clazz = clazz;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student() {
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Student(Integer sid, String sname, String gender, Double score) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.score = score;
    }

    public Student(Integer sid, String sname, String gender, Integer age) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.age = age;
    }

}
