package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Wxtype;

public interface WxtypeMapper {
    int deleteByPrimaryKey(Integer wxtypeid);

    int insert(Wxtype record);

    int insertSelective(Wxtype record);

    Wxtype selectByPrimaryKey(Integer wxtypeid);

    int updateByPrimaryKeySelective(Wxtype record);

    int updateByPrimaryKey(Wxtype record);
    
    @Select("select * from wxtype")
    public List<Wxtype> List();
}