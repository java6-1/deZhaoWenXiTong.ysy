package com.accp.dao;

import java.util.List;

import com.accp.pojo.Wxxm;

public interface WxxmMapper {
	List<Wxxm> select();
	
	
    int deleteByPrimaryKey(Integer wxxmid);

    int insert(Wxxm record);

    int insertSelective(Wxxm record);

    Wxxm selectByPrimaryKey(Integer wxxmid);

    int updateByPrimaryKeySelective(Wxxm record);

    int updateByPrimaryKey(Wxxm record);
}