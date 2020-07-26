package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Qxkz;

public interface QxkzMapper {
	
	/* 查询全部 */
	List<Qxkz> select();
	
	/* 根据ID查询 */
	Qxkz selectByPrimaryKey(@Param("staffID")Integer staffID);
	
	/* 新增员工会员 */
	int insert(@Param("record")Qxkz record);
	
	/* 修改会员权限 */
	int updateByPrimaryKeySelective(@Param("record")Qxkz record);

}