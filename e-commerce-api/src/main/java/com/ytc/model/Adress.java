package com.ytc.model;

import java.io.Serializable;

public class Adress implements Serializable {
    private static final long serialVersionUID = 4418191453615829439L;
    private Integer adressid;

    private String adressname;

    public Integer getAdressid() {
        return adressid;
    }

    public void setAdressid(Integer adressid) {
        this.adressid = adressid;
    }

    public String getAdressname() {
        return adressname;
    }

    public void setAdressname(String adressname) {
        this.adressname = adressname == null ? null : adressname.trim();
    }
}