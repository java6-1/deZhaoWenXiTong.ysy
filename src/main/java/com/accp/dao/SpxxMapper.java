package com.accp.dao;



import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Spxx;

public interface SpxxMapper {
    int deleteByPrimaryKey(Integer spxxid);

    int insert(Spxx record);

    int insertSelective(Spxx record);

    Spxx selectByPrimaryKey(Integer spxxid);

    int updateByPrimaryKeySelective(Spxx record);

    int updateByPrimaryKey(Spxx record);
    

    @Select("<script>select * from spxx where 1=1 "
    		+ " <if test=\" name !=null and name !=''  \">AND jsxmname = #{name} </if> </script> ")
    List<Spxx> query(String name);

}