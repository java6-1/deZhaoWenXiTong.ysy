package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Banzu;
import com.accp.pojo.Staff;

public interface BanzuMapper {
    int deleteByPrimaryKey(Integer bzid);

    int insert(Banzu record);

    int insertSelective(Banzu record);

    Banzu selectByPrimaryKey(Integer bzid);

    int updateByPrimaryKeySelective(Banzu record);

    int updateByPrimaryKey(Banzu record);
    
    //查询所有班组
    @Select("select * from banzu")
    List<Banzu> queryBanzu();
    
    //员工班组联查
    @Select("select * from staff  INNER JOIN section ON section.`sectionbh`=staff.`sectionID` inner join banzu on banzu.bzid=staff.bzid where state=0")
    List<Staff> queryByBanzu();
    
    //根据id查询班组信息
    @Select("select * from staff  INNER JOIN section ON section.`sectionbh`=staff.`sectionID` inner join banzu on banzu.bzid=staff.bzid where state=0 where staff.bzid=#{bzid}")
    List<Staff> queryByBanzuid(Integer bzid);
    
    //新增班组
    @Insert("insert into banzu(bzname)values(#{bzname})")
    int addBanzu();
    
    //删除班组
    @Delete("delete from banzu where bzid=#{bzid}")
    int deleteBanzu(Integer bzid);
    
}