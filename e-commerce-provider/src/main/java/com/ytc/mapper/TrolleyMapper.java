package com.ytc.mapper;

import com.ytc.model.Trolley;

public interface TrolleyMapper {
    int deleteByPrimaryKey(Integer trolleyid);

    int insert(Trolley record);

    int insertSelective(Trolley record);

    Trolley selectByPrimaryKey(Integer trolleyid);

    int updateByPrimaryKeySelective(Trolley record);

    int updateByPrimaryKey(Trolley record);
}