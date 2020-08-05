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
    
    @Select("<script>SELECT * FROM `ghdw` where 1=1 <if test=\" ghdwpawss !=null and ghdwpawss !=''  \">and ghdwpawss = #{ghdwpawss}</if> </script>")
    List<Ghdw> query(String ghdwpawss);
}