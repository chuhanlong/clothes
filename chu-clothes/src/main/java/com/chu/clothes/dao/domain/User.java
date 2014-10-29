package com.chu.clothes.dao.domain;

import java.io.Serializable;

/**
 * 
 *
 * @author Administrator
 * @date 2014-10-29
 *
 */
public class User implements Serializable {
    /** ??ID */
    private Integer id;

    /** ??? */
    private String name;

    /** ?? */
    private Byte sex;

    /** ?? */
    private Short age;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }
}