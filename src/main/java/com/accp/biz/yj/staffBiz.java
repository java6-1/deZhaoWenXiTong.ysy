package com.accp.biz.yj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StaffMapper;
import com.accp.pojo.Staff;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class staffBiz {
	@Autowired
	private StaffMapper staffmapper;

	public Staff selectuserl(String name) {
		return staffmapper.selectuserl(name);
	}

	public Staff selectuserPhone(String phone) {
		return staffmapper.selectuserPhone(phone);
	}

	public Staff yjSelectCaiDan(String name) {
		return staffmapper.yjSelectCaiDan(name);
	}

	// 查看权限
	public List<Integer> yjSelectQuanXiang(String staffid) {
		return staffmapper.yjSelectQuanXiang(staffid);
	}

	// 删除权限
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int yjDeleteQuangx(String jiaoSeId) {
		return staffmapper.yjDeleteQuangx(jiaoSeId);
	}

	// 新增权限
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int yjInsertQuangx(String jiaoSeId, String caiDanId,String caozuo) {
		return staffmapper.yjInsertQuangx(jiaoSeId, caiDanId, caozuo);
	}
}
