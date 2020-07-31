package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Wxxm;

public interface WxxmMapper {
	List<Wxxm> select();
	
	
    int deleteByPrimaryKey(Integer wxxmid);

    int insert(Wxxm record);

    int insertSelective(Wxxm record);

    Wxxm selectByPrimaryKey(Integer wxxmid);

    int updateByPrimaryKeySelective(Wxxm record);

    int updateByPrimaryKey(Wxxm record);
    
    @Select("SELECT * FROM `wxxm` w,`wxtype` a\r\n" + 
    		"WHERE w.`wxtypeId`=a.wxtypeId AND a.`wxtypeId`=#{id}")
    List<Wxxm> query(Integer id);
}