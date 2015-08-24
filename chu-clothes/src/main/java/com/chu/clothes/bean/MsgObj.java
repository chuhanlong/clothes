package com.chu.clothes.bean;

import java.io.Serializable;

public class MsgObj implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -9197842531117053732L;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MsgObj(String msg) {
        this.msg = msg;
    }

    public MsgObj() {

    }

}
