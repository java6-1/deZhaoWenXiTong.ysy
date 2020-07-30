package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Waiqin;

public interface WaiqinMapper {
	
	List<Waiqin> selectByjiescph(@Param("jiescph")String jiescph);
	
    Waiqin selectByPrimaryKey(Integer waiqinid);
	
    
    
    
    int deleteByPrimaryKey(Integer waiqinid);

    int insert(Waiqin record);

    int insertSelective(Waiqin record);



    int updateByPrimaryKeySelective(Waiqin record);

    int updateByPrimaryKey(Waiqin record);
    
    

}