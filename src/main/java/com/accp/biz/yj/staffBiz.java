package com.accp.biz.yj;

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
	public Staff selectuserl(String name, String password) {
		return staffmapper.selectuserl(name, password);
	}
	public Staff selectuserPhone(String phone) {
		return staffmapper.selectuserPhone(phone);
	}
}
