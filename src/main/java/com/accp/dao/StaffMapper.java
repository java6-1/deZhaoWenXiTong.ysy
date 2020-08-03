package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Staff;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);
   
    int updateByPrimaryKey(Staff record);
    Staff selectuser(@Param("staffAccount")String staffAccount,@Param("staffPawss")String staffPawss);
    Staff selectuserPhone(@Param("staff")String staff);

    
    //查询全部wlw
    @Select("select * from staff  INNER JOIN section ON section.`sectionbh`=staff.`sectionID`")
    List<Staff> queryStaff();


    List<Staff> selec(@Param("staffname")String staffname);
    
    
    //新增员工
    @Insert("insert into staff(postid,staffname,staffsex,tstore,sectionid,education,edtype,school,specialty,sfid,yhdz,xjdz,staff,entrytime)values(#{postid},#{staffname},#{staffsex},#{tstore},#{sectionid},#{education},#{edtype},#{school},#{specialty},#{sfid},#{yhdz},#{xjdz},#{staff},#{entrytime})")
    int addStaff(Staff staff);

    //删除员工
    @Delete("delete from staff where staffid=#{staffid}")
    int deleteStaff(Integer staffid);
    
    //根据id查询
    @Select("select * from staff  INNER JOIN section ON section.`sectionbh`=staff.`sectionID` where staffid = #{staffid}")
    Staff queryByStaff(Integer staffid);
    
    //根据id修改员工信息
    @Update("update staff set  postid=#{postid},staffname=#{staffname},staffsex=#{staffsex},tstore=#{tstore},sectionid=#{sectionid},education=#{education},edtype=#{edtype},school=#{school},specialty=#{specialty},sfid=#{sfid},yhdz=#{yhdz},xjdz=#{xjdz},staff=#{staff},entrytime=#{entrytime} where staffid=#{staffid}")
    int updateStaff(Staff staff);
}