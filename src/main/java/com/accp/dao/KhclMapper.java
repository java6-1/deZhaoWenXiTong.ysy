package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Khcl;

public interface KhclMapper {
	//查询全部客户
	List<Khcl> select(@Param("jiescph")String jiescph);
	
	//客户车辆Id查询
	Khcl selectByPrimaryKey(Integer khclid);
	
    int deleteByPrimaryKey(Integer khclid);

    int insert(Khcl record);

    int insertSelective(Khcl record);


    int updateByPrimaryKeySelective(Khcl record);

    int updateByPrimaryKey(Khcl record);
}