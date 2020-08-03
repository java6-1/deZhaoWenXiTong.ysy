package com.accp.biz.wlw;

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
}
