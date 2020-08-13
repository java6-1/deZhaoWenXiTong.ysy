package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Section;

public interface SectionMapper {
    int deleteByPrimaryKey(Integer sectionbh);

    int insert(Section record);

    int insertSelective(Section record);

    Section selectByPrimaryKey(Integer sectionbh);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
    
    //查询全部
    @Select("select * from section")
    List<Section> querySection();
    
    //新增
    @Insert("insert into section(sectionname,bz1,bz2,bz3)values(#{sectionname},#{bz1},#{bz2},#{bz3})")
    int addSection(Section section);
}