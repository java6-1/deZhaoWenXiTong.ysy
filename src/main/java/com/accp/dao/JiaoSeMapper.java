package com.accp.dao;

import com.accp.pojo.JiaoSe;

public interface JiaoSeMapper {
    int deleteByPrimaryKey(Integer jiaoseid);

    int insert(JiaoSe record);

    int insertSelective(JiaoSe record);

    JiaoSe selectByPrimaryKey(Integer jiaoseid);

    int updateByPrimaryKeySelective(JiaoSe record);

    int updateByPrimaryKey(JiaoSe record);
}