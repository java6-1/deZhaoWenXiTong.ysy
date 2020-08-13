package com.accp.biz.yj;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.HuiYuangMapper;
import com.accp.dao.JiesMapper;
import com.accp.pojo.HuiYuang;
import com.accp.pojo.Jies;
import com.accp.pojo.Jsxm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class YjHuiYuangBiz  {
	@Autowired 
	private HuiYuangMapper hymapper;
	@Autowired 
	private JiesMapper jsmapper;
	//分页会员
	public PageInfo<HuiYuang> selectHuiYuangPage(Integer pageNum, Integer pageSize, String sousuo) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<HuiYuang>(hymapper.selectHuiYuangPage(sousuo));
	}
	//新增会员
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertHuiYuan(HuiYuang hy) {
		double je=Double.parseDouble(hy.getJifen());
		hy.setRi(new Date());
		if(je>=500&&je<1000) {
			double a=je+100;
			hy.setJifen(""+a);
		}else if(je>=1000) {
			double a=je+300;
			hy.setJifen(""+a);
		}
		return hymapper.insertHuiYuan(hy);
	}
	//查询会员金额
	public double selectHuiYuangJiFenId(Integer hyid) {
		return hymapper.selectHuiYuangJiFenId(hyid);
	}
	//删除会员
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteHuiYuangId(Integer hyid) {
		return hymapper.deleteHuiYuangId(hyid);
	}
	//充值
	public int selectHuiYuangCZ(double jifen,Integer hyid) {
		double a=jifen;
		if(jifen>=500&&jifen<1000) {
			 a=jifen+100;
		}else if(jifen>=1000) {
			a=jifen+300;
		}
		return hymapper.selectHuiYuangCZ(hymapper.selectHuiYuangJiFenId(hyid)+a, hyid);
	}
	//查询未结算
	public PageInfo<Jies> selectJiesWeiPage(Integer pageNum,Integer pageSize,String chePaiHao){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Jies>(jsmapper.selectJiesWeiPage(chePaiHao));
	}
	//查询结算
		public PageInfo<Jies> selectJiesJiePage(Integer pageNum,Integer pageSize,String chePaiHao){
			PageHelper.startPage(pageNum, pageSize);
			return new PageInfo<Jies>(jsmapper.selectJiesJiePage(chePaiHao));
		}
	//查询结算项目
		public List<Jsxm> yjSelectJsxm(String jiesId){
			return jsmapper.yjSelectJsxm(jiesId);
		}
}
