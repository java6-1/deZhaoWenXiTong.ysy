package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Ghdw;

public interface GhdwMapper {
    int deleteByPrimaryKey(Integer ghdwbh);

    int insert(Ghdw record);

    int insertSelective(Ghdw record);

    Ghdw selectByPrimaryKey(Integer ghdwbh);

    int updateByPrimaryKeySelective(Ghdw record);

    int updateByPrimaryKey(Ghdw record);
    
    @Select("SELECT * FROM `ghdw` ")
    List<Ghdw> query(String diz);
}