package com.ytc.model;

public class Picture2 {
    private Integer pictureid2;

    private String pictureurl2;

    public Integer getPictureid2() {
        return pictureid2;
    }

    public void setPictureid2(Integer pictureid2) {
        this.pictureid2 = pictureid2;
    }

    public String getPictureurl2() {
        return pictureurl2;
    }

    public void setPictureurl2(String pictureurl2) {
        this.pictureurl2 = pictureurl2 == null ? null : pictureurl2.trim();
    }
}