package com.accp.biz.hl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WeixiujlMapper;
import com.accp.pojo.Weixiujl;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WeixiujlBiz {
	@Autowired
	private WeixiujlMapper weixiujlMapper;
	
	
	/*新增维修记录主表 */
	@Transactional(propagation = Propagation.REQUIRED, isolation =Isolation.READ_COMMITTED, readOnly = false)
	public int insertSelective(Weixiujl record) {
		return weixiujlMapper.insertSelective(record);
	}
}
