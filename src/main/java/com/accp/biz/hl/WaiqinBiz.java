package com.accp.biz.hl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WaiqinMapper;

import com.accp.pojo.Waiqin;




@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WaiqinBiz {
	@Autowired
	private WaiqinMapper waiqinMapper;
	
	//下拉查询车牌号
	
	public List<Waiqin> selectByjiescph(String jiescph){	
		return  waiqinMapper.selectByjiescph(jiescph);
	}
	
}
