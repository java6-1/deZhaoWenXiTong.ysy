package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Jies;

public interface JiesMapper {
    int deleteByPrimaryKey(Integer jiesid);

    int insert(Jies record);

    int insertSelective(Jies record);

    Jies selectByPrimaryKey(Integer jiesid);

    int updateByPrimaryKeySelective(Jies record);

    int updateByPrimaryKey(Jies record);
    //查询未结算
    List<Jies> selectJiesWeiPage(@Param("chepaihao")String chepaihao);
    //查询结算
   
    List<Jies> selectJiesJiePage(@Param("chepaihao")String chepaihao);
}