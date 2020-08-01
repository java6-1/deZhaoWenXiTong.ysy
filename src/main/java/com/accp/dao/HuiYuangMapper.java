package com.accp.dao;

import com.accp.pojo.HuiYuang;

public interface HuiYuangMapper {
    int deleteByPrimaryKey(Integer huiyuanid);

    int insert(HuiYuang record);

    int insertSelective(HuiYuang record);

    HuiYuang selectByPrimaryKey(Integer huiyuanid);

    int updateByPrimaryKeySelective(HuiYuang record);

    int updateByPrimaryKey(HuiYuang record);
}