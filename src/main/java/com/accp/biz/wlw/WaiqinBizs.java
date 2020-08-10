package com.accp.biz.wlw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WaiqinMapper;
import com.accp.pojo.Waiqin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WaiqinBizs {
	
	//
	@Autowired
	private WaiqinMapper waiqinMapper;
	
	//查询全部外勤车辆
	public PageInfo<Waiqin> queryWaiqin(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Waiqin>(waiqinMapper.queryWaiqin());
	} 	
	
	//根据id查询
	public Waiqin queryBywaiqinid(Integer waiqinid) {
		Waiqin wq = waiqinMapper.queryBywaiqinid(waiqinid);
		return wq;
	}
	
	//新增
	public int addWaiqin(Waiqin waiqin) {
		int count = waiqinMapper.addWaiqin(waiqin);
		return count;
	}
	
	//删除
	public int deleteWaiqin(Integer waiqinid) {
		int count = waiqinMapper.deleteWaiqn(waiqinid);
		return count;
	}
	
	
	//修改
	public int updateWaiqin(Waiqin waiqin) {
		int count = waiqinMapper.updateWaiqin(waiqin);
		return count;
	}
}
