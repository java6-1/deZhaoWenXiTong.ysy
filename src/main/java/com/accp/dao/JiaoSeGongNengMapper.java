package com.accp.dao;

import com.accp.pojo.JiaoSeGongNeng;

public interface JiaoSeGongNengMapper {
    int deleteByPrimaryKey(Integer gjid);

    int insert(JiaoSeGongNeng record);

    int insertSelective(JiaoSeGongNeng record);

    JiaoSeGongNeng selectByPrimaryKey(Integer gjid);

    int updateByPrimaryKeySelective(JiaoSeGongNeng record);

    int updateByPrimaryKey(JiaoSeGongNeng record);
}