package com.ytc.model;

import java.io.Serializable;

public class Type implements Serializable {
    private static final long serialVersionUID = -7195784032289317094L;
    private Integer typeid;

    private String typename;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}