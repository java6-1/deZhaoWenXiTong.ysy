package com.accp.biz.wlw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StaffMapper;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StaffBizs {
	@Autowired
	private StaffMapper staffMapper;
	
	//查询全部
	public PageInfo<Staff> queryByStaff(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Staff>(staffMapper.queryStaff());
	}
	
	//新增
	public int addStaff(Staff staff) {
		int count=staffMapper.addStaff(staff);
		return count;
	}
	
	//根据id查询
	public Staff queryByStaff(Integer staffid) {
		Staff staff=staffMapper.queryByStaff(staffid);
		return staff;
	}
	
	//根据id删除
	public int deleteStaff(Integer staffid) {
		int count = staffMapper.deleteStaff(staffid);
		return count;
	}
	
	//修改
	public int updateStaff(Staff staff) {
		int count = staffMapper.updateStaff(staff);
		return count;
	}
	
	//查询全部部根据分页
	public List<Staff> query(){
		List<Staff> list = staffMapper.queryStaff();
		return list;
	}
	
	//离职登记
	public int XgStaff(Staff staff){
		int count = staffMapper.XgStaff(staff);
		return count;
	}
	
	//离职查询
	public PageInfo<Staff> queryByStaffs(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Staff>(staffMapper.queryStaffs());
	}
	
	//离职删除
	public int DeStaff(Integer staffid){
		int count = staffMapper.DeStaff(staffid);
		return count;
	}
	
	
	//根据名字模糊查询离职
	public List<Staff> queryByname(String staffname){
		List<Staff> list = staffMapper.queryByName(staffname);
		return list;
	}
	
	//根据名字模糊查询员工
	public List<Staff> queryBynames(String staffname){
		List<Staff> list = staffMapper.queryByNames(staffname);
		return list;
	}
}
