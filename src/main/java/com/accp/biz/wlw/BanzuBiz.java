package com.accp.biz.wlw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.BanzuMapper;
import com.accp.pojo.Banzu;
import com.accp.pojo.Post;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class BanzuBiz {
	//
	@Autowired
	private BanzuMapper banzuMapper;
	
	//查询所有员工信息
	public PageInfo<Staff> queryByBanzu(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Staff>(banzuMapper.queryByBanzu());
	}
	
	//查询所有班组
	public List<Banzu> queryBanzu() {
		 List<Banzu> bz = banzuMapper.queryBanzu();
		 return bz;
	}
}
