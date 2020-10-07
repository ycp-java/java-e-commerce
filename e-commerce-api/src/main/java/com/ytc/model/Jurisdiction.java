package com.ytc.model;

import java.io.Serializable;

public class Jurisdiction implements Serializable {
    private static final long serialVersionUID = -2026620443536694170L;
    private Integer jurisdictionid;

    private String jurisdictionname;

    public Integer getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(Integer jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    public String getJurisdictionname() {
        return jurisdictionname;
    }

    public void setJurisdictionname(String jurisdictionname) {
        this.jurisdictionname = jurisdictionname == null ? null : jurisdictionname.trim();
    }
}