package com.accp.biz.hl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.KehuMapper;
import com.accp.pojo.Kehu;
import com.accp.pojo.Khcl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class KehuBiz {
	
	@Autowired
	private KehuMapper kehuMapper;
	
	public Kehu selectByPrimaryKey(Integer kehuid) {
		return kehuMapper.selectByPrimaryKey(kehuid);
	}
}
