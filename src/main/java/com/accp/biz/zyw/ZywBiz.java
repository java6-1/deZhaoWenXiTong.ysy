package com.accp.biz.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClppMapper;
import com.accp.pojo.Clpp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZywBiz {
	@Autowired
	ClppMapper clppmapper;
	
	public PageInfo<Clpp> queryByAuction(Integer pageNum,String name,String szm) {
		  PageHelper.startPage(pageNum, 5);
		  return new PageInfo<Clpp>(clppmapper.queryForm(name,szm));
		 }
	
	public int ins(Clpp clpp) {
		return clppmapper.insertSelective(clpp);
	}
	public int del(Integer clppid) {
		return clppmapper.deleteByPrimaryKey(clppid);
	}

}
