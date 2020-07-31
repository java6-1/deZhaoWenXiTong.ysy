package com.accp.biz.hl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.KhclMapper;
import com.accp.pojo.Khcl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class KhclBiz {
	@Autowired
	private KhclMapper khclmapper;
	
	
	public List<Khcl> select( String jiescph) {
		 return khclmapper.select(jiescph);
	}
	
	
	public Khcl selectByPrimaryKey(Integer khclid) {
		return khclmapper.selectByPrimaryKey(khclid);
	}
}
