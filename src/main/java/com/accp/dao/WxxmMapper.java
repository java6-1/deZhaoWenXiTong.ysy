package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Wxxm;

public interface WxxmMapper {
	List<Wxxm> select();
	
	List<Wxxm> selectByP(@Param("wxtypeid")Integer wxtypeid);
    int deleteByPrimaryKey(Integer wxxmid);
    
    
    int insertlist(@Param("record")List<Wxxm> record);
    
    
    int updateBy(@Param("bz1")Integer bz1,@Param("wxxmid")Integer wxxmid);

    int insert(Wxxm record);

    int insertSelective(Wxxm record);

    Wxxm selectByPrimaryKey(Integer wxxmid);

    int updateByPrimaryKeySelective(Wxxm record);

    int updateByPrimaryKey(Wxxm record);
}