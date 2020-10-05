package com.ytc.mapper;

import com.ytc.model.Picture;

public interface PictureMapper {
    int deleteByPrimaryKey(Integer pictureid);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer pictureid);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}