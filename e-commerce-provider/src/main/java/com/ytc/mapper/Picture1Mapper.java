package com.ytc.mapper;

import com.ytc.model.Picture1;

public interface Picture1Mapper {
    int deleteByPrimaryKey(Integer pictureid1);

    int insert(Picture1 record);

    int insertSelective(Picture1 record);

    Picture1 selectByPrimaryKey(Integer pictureid1);

    int updateByPrimaryKeySelective(Picture1 record);

    int updateByPrimaryKey(Picture1 record);
}