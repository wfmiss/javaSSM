package cn.wfmiss.pojo;

/**
 * @BelongsProject: SpringMVC
 * @BelongsPackage: cn.wfmiss.pojo
 * @Author: wfmiss
 * @CreateTime: 2022-09-25  09:42
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private  String gender;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
