package com.ytc.model;

public class Picture1 {
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