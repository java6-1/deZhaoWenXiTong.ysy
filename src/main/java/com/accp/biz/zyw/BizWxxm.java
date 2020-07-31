package com.accp.biz.zyw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WxtypeMapper;
import com.accp.dao.WxxmMapper;
import com.accp.pojo.Chexing;
import com.accp.pojo.Wxtype;
import com.accp.pojo.Wxxm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class BizWxxm {

	
	@Autowired 
	WxtypeMapper wxmapper;
	@Autowired 
	WxxmMapper wxxmmapper;
	
	public List<Wxtype> list() {
		return wxmapper.List();
	}
	
	public List<Wxxm> list2(Integer id) {
		return wxxmmapper.query(id);
	}
	public PageInfo<Wxxm> list2(Integer pageNum,Integer id) {
		  PageHelper.startPage(pageNum, 3);
		  return new PageInfo<Wxxm>(wxxmmapper.query(id));
		 }
}
