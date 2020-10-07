package com.ytc.model;

public class Commodity {
    private Integer commodityid;

    private String commodityname;

    private Integer commoditytypeid;

    private Integer commodityprice;

    private String commodityshow;

    private Integer commodityimgid;

    private Integer commodityimgid1;

    private Integer commodityimgid2;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getCommoditytypeid() {
        return commoditytypeid;
    }

    public void setCommoditytypeid(Integer commoditytypeid) {
        this.commoditytypeid = commoditytypeid;
    }

    public Integer getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(Integer commodityprice) {
        this.commodityprice = commodityprice;
    }

    public String getCommodityshow() {
        return commodityshow;
    }

    public void setCommodityshow(String commodityshow) {
        this.commodityshow = commodityshow == null ? null : commodityshow.trim();
    }

    public Integer getCommodityimgid() {
        return commodityimgid;
    }

    public void setCommodityimgid(Integer commodityimgid) {
        this.commodityimgid = commodityimgid;
    }

    public Integer getCommodityimgid1() {
        return commodityimgid1;
    }

    public void setCommodityimgid1(Integer commodityimgid1) {
        this.commodityimgid1 = commodityimgid1;
    }

    public Integer getCommodityimgid2() {
        return commodityimgid2;
    }

    public void setCommodityimgid2(Integer commodityimgid2) {
        this.commodityimgid2 = commodityimgid2;
    }
}