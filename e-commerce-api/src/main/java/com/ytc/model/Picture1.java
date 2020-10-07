package com.ytc.model;

import java.io.Serializable;

public class Picture1 implements Serializable {
    private static final long serialVersionUID = 4749120343086761842L;
    private Integer pictureid1;

    private String pictureurl1;

    public Integer getPictureid1() {
        return pictureid1;
    }

    public void setPictureid1(Integer pictureid1) {
        this.pictureid1 = pictureid1;
    }

    public String getPictureurl1() {
        return pictureurl1;
    }

    public void setPictureurl1(String pictureurl1) {
        this.pictureurl1 = pictureurl1 == null ? null : pictureurl1.trim();
    }
}