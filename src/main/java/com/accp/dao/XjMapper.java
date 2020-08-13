package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Xj;

public interface XjMapper {
    int deleteByPrimaryKey(Integer xjid);

    int insert(Xj record);

    int insertSelective(Xj record);

    Xj selectByPrimaryKey(Integer xjid);

    int updateByPrimaryKeySelective(Xj record);

    int updateByPrimaryKey(Xj record);
    
    //查询全部技工星级
    @Select("select * from xj")
    List<Xj> queryXj();
    
    //新增
    @Insert("insert into xj(xjname,xjfei)values(#{xjname},#{xjfei})")
    int addXj(Xj xj);
    
    //修改
    @Update("update xj set xjname=#{xjname},xjfei=#{xjfei} where xjid=#{xjid}")
    int updateXj(Xj xj);
    
    //根据id查询
    @Select("select * from xj where xjid=#{xjid}")
    Xj queryByids(Integer xjid);
    
    //删除
    @Delete("delete from xj where xjid=#{xjid}")
    int deleteXj(Integer xjid);
}