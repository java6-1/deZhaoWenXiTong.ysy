package com.accp.biz.hl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClppMapper;
import com.accp.pojo.Clpp;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ClppBiz {
	@Autowired
	private ClppMapper clppMapper;
	
	public List<Clpp> select(){
		return clppMapper.select();
	}
}
