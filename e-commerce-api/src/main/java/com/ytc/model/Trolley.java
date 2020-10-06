package com.ytc.model;

public class Trolley {
    private Integer trolleyid;

    private Integer commodityid;

    private Integer userid;

    private Commodity commodity;

    private User user;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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