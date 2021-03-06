package com.accp.biz.wlw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SectionMapper;
import com.accp.pojo.Section;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SectionBiz {
	@Autowired
	private SectionMapper sectionMapper;
	
	//查询全部
	public List<Section> querySection(){
		List<Section> list=sectionMapper.querySection();
		return  list;
	}
	
	//新增
	public int addSection(Section section) {
		int count = sectionMapper.addSection(section);
		return count;
	}
}
