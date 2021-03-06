package com.accp.biz.hl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WxtypeMapper;
import com.accp.pojo.Wxtype;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WxtypeBiz {
	@Autowired
	private WxtypeMapper wxtypeMapper;
	
	public List<Wxtype> select() {
		 return wxtypeMapper.select();
	}
}
