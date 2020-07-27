package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);
   
    int updateByPrimaryKey(Staff record);
    //yj
    Staff selectuser(@Param("staffAccount")String staffAccount,@Param("staffPawss")String staffPawss);
    //yj
    Staff selectuserPhone(@Param("staff")String staff);
    
    //查询全部wlw
    @Select("select * from staff  INNER JOIN section ON section.`sectionbh`=staff.`sectionID`")
    List<Staff> queryStaff();

}