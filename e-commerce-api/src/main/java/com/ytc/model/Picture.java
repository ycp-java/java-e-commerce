package com.ytc.model;

import java.io.Serializable;

public class Picture implements Serializable {
    private static final long serialVersionUID = 4444427462135668246L;
    private Integer pictureid;

    private String pictureurl;

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }
}