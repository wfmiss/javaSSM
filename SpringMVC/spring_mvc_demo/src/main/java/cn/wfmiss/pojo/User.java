package cn.wfmiss.pojo;

/**
 * @BelongsProject: SpringMVC
 * @BelongsPackage: cn.wfmiss.pojo
 * @Author: wfmiss
 * @CreateTime: 2022-09-20  12:30
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class User {
    private Integer Id;
    private String username;
    private String password;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(Integer id, String username, String password) {
        Id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
}
