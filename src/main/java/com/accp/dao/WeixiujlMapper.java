package com.accp.dao;

import org.apache.ibatis.annotations.Options;

import com.accp.pojo.Weixiujl;

public interface WeixiujlMapper {
	
	 @Options(useGeneratedKeys = true, keyProperty = "weixiujlid", keyColumn = "weixiujlId")
	 int insertSelective(Weixiujl record);
	
	
	
    int deleteByPrimaryKey(Integer weixiujlid);

    int insert(Weixiujl record);



    Weixiujl selectByPrimaryKey(Integer weixiujlid);

    int updateByPrimaryKeySelective(Weixiujl record);

    int updateByPrimaryKey(Weixiujl record);
}