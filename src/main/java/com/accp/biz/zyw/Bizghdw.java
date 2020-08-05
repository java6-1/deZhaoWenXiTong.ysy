package com.accp.biz.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GhdwMapper;
import com.accp.pojo.Ghdw;
import com.accp.pojo.Wxxm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Bizghdw {

	@Autowired
	GhdwMapper mapper;
	
	public PageInfo<Ghdw> list(Integer pageNum,String wxdz) {
		  PageHelper.startPage(pageNum, 3);
		  return new PageInfo<Ghdw>(mapper.query(wxdz));
		 }
	
	public int ins(Ghdw ghdw) {
		return mapper.insertSelective(ghdw);
	}
public int del(Integer dwid) {
		return mapper.deleteByPrimaryKey(dwid);
	}
public int upda(Ghdw ghdw) {
	return mapper.updateByPrimaryKeySelective(ghdw);
}
	
}
