package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Wxxm;

public interface WxxmMapper {
	List<Wxxm> select();
	
	List<Wxxm> selectByP(@Param("wxxmname")String wxxmname);
    int deleteByPrimaryKey(Integer wxxmid);

    int insert(Wxxm record);

    int insertSelective(Wxxm record);

    Wxxm selectByPrimaryKey(Integer wxxmid);

    int updateByPrimaryKeySelective(Wxxm record);

    int updateByPrimaryKey(Wxxm record);
}