package com.accp.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.HuiYuang;



public interface HuiYuangMapper {
	//分页查询会员
		List<HuiYuang> selectHuiYuangPage(@Param("sousuo")String sousuo);
		//新增会员
		int insertHuiYuan(@Param("hy")HuiYuang hy);
		//删除会原
		int deleteHuiYuangId(@Param("hyid")Integer hyid);
		//查询会员金额
		double selectHuiYuangJiFenId(@Param("hyid")Integer hyid);
		//充值会员
		@Update("UPDATE `huiyuang` SET `jiFen`=#{jifen} where`huiYuanId`=#{hyid}")
		int selectHuiYuangCZ(@Param("jifen")double jifen,@Param("hyid")Integer hyid);
}