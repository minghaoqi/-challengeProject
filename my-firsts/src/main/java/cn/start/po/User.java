package cn.start.po;

/**
 * Created by yoho8 on 2017/3/29.
 * 用户
 */
public class User {

    private Long id;

    private String userName;//登录用户名

    private String realName;//用户昵称

    private String password;//用户密码

    private String phone; //用户手机号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
