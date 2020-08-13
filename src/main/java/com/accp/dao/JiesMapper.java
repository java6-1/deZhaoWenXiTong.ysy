package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Jies;
import com.accp.pojo.Jsxm;

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
    //查询结算项目
    @Select("select a.`jsxmName`,a.`jsxmpice`from `jsxm` a\r\n" + 
    		"join  jies b on a.`jiesId`=b.`jiesId` where b.`jiesId`=#{jiesId}")
    List<Jsxm> yjSelectJsxm(@Param("jiesId")String jiesId);
}