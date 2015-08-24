package com.chu.clothes.dao.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ”√ªß±Ì
 *
 * @author chu
 * @date 2015-8-24
 *
 */
public class User implements Serializable {
    /**  */
    private Integer id;

    /**  */
    private String userName;

    /**  */
    private String password;

    /**  */
    private String email;

    /**  */
    private String mobile;

    /**  */
    private Byte age;

    /**  */
    private Byte status;

    /**  */
    private Date ctime;

    /**  */
    private Date mtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }
}