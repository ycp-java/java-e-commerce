package com.ytc.mapper;

import com.ytc.model.Picture2;

public interface Picture2Mapper {
    int deleteByPrimaryKey(Integer pictureid2);

    int insert(Picture2 record);

    int insertSelective(Picture2 record);

    Picture2 selectByPrimaryKey(Integer pictureid2);

    int updateByPrimaryKeySelective(Picture2 record);

    int updateByPrimaryKey(Picture2 record);
}