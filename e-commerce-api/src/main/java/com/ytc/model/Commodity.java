package com.ytc.model;

import java.io.Serializable;

public class Commodity implements Serializable {
    private static final long serialVersionUID = 3291134811088302334L;
    private Integer commodityid;

    private String commodityname;

    private Integer commoditytypeid;

    private Integer commodityprice;

    private String commodityshow;

    private Integer commodityimgid;

    private Integer commodityimgid1;

    private Integer commodityimgid2;

    private Integer merchantid;

    private Merchant merchant;
    private Type type;
    private Picture picture;
    private Picture1 picture1;
    private Picture2 picture2;

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

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