package com.accp.dao;

import com.accp.pojo.Spxx;

public interface SpxxMapper {
    int deleteByPrimaryKey(Integer spxxid);

    int insert(Spxx record);

    int insertSelective(Spxx record);

    Spxx selectByPrimaryKey(Integer spxxid);

    int updateByPrimaryKeySelective(Spxx record);

    int updateByPrimaryKey(Spxx record);
    
}