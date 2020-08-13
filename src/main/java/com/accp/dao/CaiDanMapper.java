package com.accp.dao;

import com.accp.pojo.CaiDan;

public interface CaiDanMapper {
    int deleteByPrimaryKey(Integer caidanid);

    int insert(CaiDan record);

    int insertSelective(CaiDan record);

    CaiDan selectByPrimaryKey(Integer caidanid);

    int updateByPrimaryKeySelective(CaiDan record);

    int updateByPrimaryKey(CaiDan record);
}