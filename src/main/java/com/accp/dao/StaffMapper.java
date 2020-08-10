package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.pojo.Staff;

public interface StaffMapper {

    //密码验证
    Staff selectuserl(@Param("staffAccount")String staffAccount);
    //手机号验证
    Staff selectuserPhone(@Param("staff")String staff);
    //查询用户权限
    Staff yjSelectCaiDan(@Param("name")String name);
    
    //查询全部wlw
    @Select("select * from staff  INNER JOIN section ON section.`sectionbh`=staff.`sectionID`")
    List<Staff> queryStaff();
    Staff selecBybzj(@Param("staffname")String staffname);  
    List<Staff> selecBybzjg();
    List<Staff> selec(@Param("staffname")String staffname);

}