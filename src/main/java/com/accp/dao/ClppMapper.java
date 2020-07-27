package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Clpp;

public interface ClppMapper {
    int deleteByPrimaryKey(Integer clppid);

    int insert(Clpp record);

    int insertSelective(Clpp record);

    Clpp selectByPrimaryKey(Integer clppid);

    int updateByPrimaryKeySelective(Clpp record);

    int updateByPrimaryKey(Clpp record);
    
    @Select("<script>select * from clpp where 1=1 <if test=\" name !=null and name !='' \">AND clppName=#{name} </if>"
    		+ "<if test=\" szm !=null and szm !='' \">AND clppszm=#{szm} </if></script>")
    List<Clpp> queryForm(String name,String szm);
    

    
}