package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Weixiusp;

public interface WeixiuspMapper {
	
	
	int insert(Weixiusp record);
	
	List<Weixiusp> selectByKey(@Param("weixiujlid")Integer weixiujlid);
	
	int deleteByPrimaryKey(@Param("weixiuspid")Integer weixiuspid);
	/*
	 * 
	 * 
	 * int insert(Weixiusp record);
	 * 
	 * int insertSelective(Weixiusp record);
	 * 
	 * Weixiusp selectByPrimaryKey(Integer weixiuspid);
	 * 
	 * int updateByPrimaryKeySelective(Weixiusp record);
	 * 
	 * int updateByPrimaryKey(Weixiusp record);
	 */
}