package com.accp.action.wlw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wlw.StaffBizs;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/wlw")
public class StaffActions {
	@Autowired
	private StaffBizs staffBizs;
	
	//查询全部
	@GetMapping("queryStaff/{pageNum}/{pageSize}")
	public PageInfo<Staff> queryByAuction(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println("进入yixia1");
		return staffBizs.queryByStaff(pageNum, pageSize);
	}
}
