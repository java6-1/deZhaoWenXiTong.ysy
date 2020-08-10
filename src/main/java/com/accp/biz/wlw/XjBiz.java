package com.accp.biz.wlw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.XjMapper;
import com.accp.pojo.Xj;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class XjBiz {
	//
	@Autowired
	private XjMapper xjMapper;
	
	//查询全部
	public PageInfo<Xj> queryByXj(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Xj>(xjMapper.queryXj());
	}
	
	//根据id查询
	public Xj queryByids(Integer xjid) {
		Xj xj = xjMapper.queryByids(xjid);
		return xj;
	}
	
	//新增
	public int addXj(Xj xj) {
		int count = xjMapper.addXj(xj);
		return count;
	}
	
	//删除
	public int deleteXj(Integer xjid) {
		int count = xjMapper.deleteXj(xjid);
		return count;
	}
	
	//修改
	public int update(Xj xj) {
		int count = xjMapper.updateXj(xj);
		return count;
	}
}
