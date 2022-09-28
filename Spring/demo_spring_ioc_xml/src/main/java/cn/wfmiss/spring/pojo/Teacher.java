package cn.wfmiss.spring.pojo;

/**
 * @BelongsProject: Spring
 * @BelongsPackage: cn.wfmiss.spring.pojo
 * @Author: wfmiss
 * @CreateTime: 2022-08-26  21:59
 * @Description: TODO
 * @Version: 1.0
 * @Description:
 */
public class Teacher {
    private Integer tid;
    private String tname;

    public Teacher(){

    }
    public Teacher(Integer tid,String tname){
        this.tid=tid;
        this.tname=tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
