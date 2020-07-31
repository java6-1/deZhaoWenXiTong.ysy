package com.accp.biz.hl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WeixiuspMapper;
import com.accp.pojo.Weixiujl;
import com.accp.pojo.Weixiusp;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WeixiuspBiz {
	@Autowired
	private WeixiuspMapper weixiuspMapper;
	
	/*新增维修记录主表 */
	@Transactional(propagation = Propagation.REQUIRED, isolation =Isolation.READ_COMMITTED, readOnly = false)
	public int insertSelective(Weixiusp record) {
		return weixiuspMapper.insertSelective(record);
	}
}
