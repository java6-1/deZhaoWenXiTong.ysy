package com.accp.biz.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SpxxMapper;
import com.accp.pojo.Ghdw;
import com.accp.pojo.Spxx;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Bizspzl {

	@Autowired
	SpxxMapper spxx;

	public PageInfo<Spxx> list(Integer pageNum, String wxdz) {
		PageHelper.startPage(pageNum, 3);
		return new PageInfo<Spxx>(spxx.query(wxdz));
	}

	public int ins(Spxx spxx1) {
		return spxx.insertSelective(spxx1);
	}

	public int del(Integer id) {
		return spxx.deleteByPrimaryKey(id);
	}

	public int upda(Spxx spxx1) {
		return spxx.updateByPrimaryKeySelective(spxx1);
	}
}
