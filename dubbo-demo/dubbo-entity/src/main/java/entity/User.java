package entity;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author YuMengMeng
 * @date  2022/10/17
 */

public class User implements Serializable {
    private String username;
    private String password;
    private String phone;
    private String createtime;


    public User() {
    }

    public User(String username, String password, String phone, String createtime) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.createtime = createtime;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
