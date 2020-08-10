package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Waiqin;

public interface WaiqinMapper {
	
	List<Waiqin> selectByjiescph(@Param("jiescph")String jiescph);
	
    Waiqin selectByPrimaryKey(Integer waiqinid);
	
    
    
    
    int deleteByPrimaryKey(Integer waiqinid);

    int insert(Waiqin record);

    int insertSelective(Waiqin record);



    int updateByPrimaryKeySelective(Waiqin record);

    int updateByPrimaryKey(Waiqin record);
    
    //查询全部
    @Select("select * from waiqin inner join banzu on banzu.bzid=waiqin.bzid")
    List<Waiqin> queryWaiqin();
    
    //根据id查询
    @Select("select * from waiqin inner join banzu on banzu.bzid=waiqin.bzid where waiqinid=#{waiqinid}")
    Waiqin queryBywaiqinid(Integer waiqinid);
    
    //新增
    @Insert("insert into waiqin(jiescph,waiqinpp,waiqinlc,bzid)values(#{jiescph},#{waiqinpp},#{waiqinlc},#{bzid})")
    int addWaiqin(Waiqin waiqin);
    
    //删除
    @Delete("delete from waiqin where waiqinid=#{waiqinid}")
    int deleteWaiqn(Integer waiqinid);
    
    //修改
    @Update("update waiqin set jiescph=#{jiescph},waiqinpp=#{waiqinpp},waiqinlc=#{waiqinlc},bzid=#{bzid} where waiqinid=#{waiqinid}")
    int updateWaiqin(Waiqin waiqin);
}