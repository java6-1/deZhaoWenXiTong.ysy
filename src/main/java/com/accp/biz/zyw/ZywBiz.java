package com.accp.biz.zyw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ChexingMapper;
import com.accp.dao.ClppMapper;
import com.accp.pojo.Chexing;
import com.accp.pojo.Clpp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZywBiz {
	@Autowired
	ClppMapper clppmapper;
	
	@Autowired
	ChexingMapper chexingmapper;
	
	public PageInfo<Clpp> queryByAuction(Integer pageNum,String name,String szm) {
		  PageHelper.startPage(pageNum, 5);
		  return new PageInfo<Clpp>(clppmapper.queryForm(name,szm));
		 }
	public PageInfo<Chexing> queryByChe(Integer pageNum,String name,String szm,Integer size) {
		  PageHelper.startPage(pageNum, size);
		  return new PageInfo<Chexing>(chexingmapper.queryForm(name));
		 }
	public List<Clpp> query(){
		return clppmapper.query();
	}
	
	public int ins(Clpp clpp) {
		return clppmapper.insertSelective(clpp);
	}
	public int inschexing(Chexing clpp) {
		return chexingmapper.insertSelective(clpp);
	}
	public int upda(Clpp clpp) {
		return clppmapper.updateByPrimaryKeySelective(clpp);
	}
	public int del(Integer clppid) {
		return clppmapper.deleteByPrimaryKey(clppid);
	}

}
