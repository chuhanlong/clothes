package com.chu.clothes.dao.domain;

import java.io.Serializable;

/**
 * 
 *
 * @author Administrator
 * @date 2014-11-25
 *
 */
public class Test implements Serializable {
    /**  */
    private Integer id;

    /**  */
    private String name;

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
}