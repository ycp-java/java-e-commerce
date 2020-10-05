package com.ytc.model;

public class Commodity {
    private Integer commodityid;

    private String commodityname;

    private Integer commoditytypeid;

    private Type type;

    private Integer commoditycount;

    private Integer commodityprice;

    private String commodityshow;

    private Integer commoditystatusid;

    private Status status;

    private Integer commodityimgid;

    private Picture picture;

    private Integer commodityimgid1;

    private Picture1 picture1;

    private Integer commodityimgid2;

    private Picture2 picture2;

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Picture1 getPicture1() {
        return picture1;
    }

    public void setPicture1(Picture1 picture1) {
        this.picture1 = picture1;
    }

    public Picture2 getPicture2() {
        return picture2;
    }

    public void setPicture2(Picture2 picture2) {
        this.picture2 = picture2;
    }

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
        this.commodityname = commodityname;
    }

    public Integer getCommoditytypeid() {
        return commoditytypeid;
    }

    public void setCommoditytypeid(Integer commoditytypeid) {
        this.commoditytypeid = commoditytypeid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getCommoditycount() {
        return commoditycount;
    }

    public void setCommoditycount(Integer commoditycount) {
        this.commoditycount = commoditycount;
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
        this.commodityshow = commodityshow;
    }

    public Integer getCommoditystatusid() {
        return commoditystatusid;
    }

    public void setCommoditystatusid(Integer commoditystatusid) {
        this.commoditystatusid = commoditystatusid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityid=" + commodityid +
                ", commodityname='" + commodityname + '\'' +
                ", commoditytypeid=" + commoditytypeid +
                ", type=" + type +
                ", commoditycount=" + commoditycount +
                ", commodityprice=" + commodityprice +
                ", commodityshow='" + commodityshow + '\'' +
                ", commoditystatusid=" + commoditystatusid +
                ", status=" + status +
                ", commodityimgid=" + commodityimgid +
                ", picture=" + picture +
                ", commodityimgid1=" + commodityimgid1 +
                ", picture1=" + picture1 +
                ", commodityimgid2=" + commodityimgid2 +
                ", picture2=" + picture2 +
                '}';
    }
}