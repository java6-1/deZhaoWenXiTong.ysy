//package com.accp.biz.yj;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.accp.dao.HuiYuangMapper;
//import com.accp.pojo.HuiYuang;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.toolkit.Wrappers;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//@Service
//@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
//public class YjHuiYuangBiz  {
//	public PageInfo<HuiYuang> selectHuiYuangPage(Integer pageNum, Integer pageSize, String sousuo) {
//		PageHelper.startPage(pageNum, pageSize);
//		QueryWrapper<HuiYuang> qw = Wrappers.query();
//		qw.eq("phone", sousuo);
//		return new PageInfo<HuiYuang>(.selectList(qw));
//	}
//}
