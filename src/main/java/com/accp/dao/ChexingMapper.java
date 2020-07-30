package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Chexing;

public interface ChexingMapper {
	
	List<Chexing> select();
	
    int deleteByPrimaryKey(Integer chexingid);

    int insert(Chexing record);

    int insertSelective(Chexing record);

    Chexing selectByPrimaryKey(Integer chexingid);

    int updateByPrimaryKeySelective(Chexing record);

    int updateByPrimaryKey(Chexing record);
    
    @Select("select * from chexing")
    List<Chexing> queryForm(String name);
}