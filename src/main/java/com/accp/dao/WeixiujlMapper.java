package com.accp.dao;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Weixiujl;

public interface WeixiujlMapper {
	/*
	 * int deleteByPrimaryKey(Integer weixiujlid);
	 * 
	 * int insert(Weixiujl record);
	 */
    
    @Options(useGeneratedKeys = false, keyProperty = "weixiujlid", keyColumn = "weixiujlId")
    int insertSelective(Weixiujl record);


	/*
	 * Weixiujl selectByPrimaryKey(Integer weixiujlid);
	 * 
	 * int updateByPrimaryKeySelective(Weixiujl record);
	 * 
	 * int updateByPrimaryKey(Weixiujl record);
	 */
}