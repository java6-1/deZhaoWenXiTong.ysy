package com.accp.dao;

import com.accp.pojo.test;

public interface testMapper {
    int deleteByPrimaryKey(Integer stuno);

    int insert(test record);

    int insertSelective(test record);

    test selectByPrimaryKey(Integer stuno);

    int updateByPrimaryKeySelective(test record);

    int updateByPrimaryKey(test record);
}