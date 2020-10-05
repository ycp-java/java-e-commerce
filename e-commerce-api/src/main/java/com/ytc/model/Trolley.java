package com.ytc.model;

public class Trolley {
    private Integer trolleyid;

    private Integer commodityid;

    private Commodity commodity;

    public Integer getTrolleyid() {
        return trolleyid;
    }

    public void setTrolleyid(Integer trolleyid) {
        this.trolleyid = trolleyid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }
}