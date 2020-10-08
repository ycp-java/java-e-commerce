package com.ytc.model;

import java.util.Date;

public class Seckill_Order {
    private String soId;

    private Integer commoditid;

    private Integer userid;

    private Date createTime;

    private Integer status;

    public String getSoId() {
        return soId;
    }

    public void setSoId(String soId) {
        this.soId = soId == null ? null : soId.trim();
    }

    public Integer getCommoditid() {
        return commoditid;
    }

    public void setCommoditid(Integer commoditid) {
        this.commoditid = commoditid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}