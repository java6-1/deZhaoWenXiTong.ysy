package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Kehu;
import com.accp.pojo.Khcl;

public interface KehuMapper {
	int deleteByPrimaryKey(Integer kehuid);

	int insert(Kehu record);

	int insertSelective(Kehu record);

	Kehu selectByPrimaryKey(Integer kehuid);
	//修改客户
	int updateByPrimaryKeySelective(@Param("kehu")Kehu kehu);

	int updateByPrimaryKey(Kehu record);

	// 客户分页selectkehuPage
	List<Kehu> selectkehuPage(@Param("sousuo") String sousuo);

	// 车辆分页
	List<Khcl> selectkehuclPage(@Param("kehuid") Integer kehuid);

	// 新增客户与车辆
	// 在接口映射器中设置的useGeneratedKeys参数值将会覆盖在settings元素中设置全局useGeneratedKeys参数值
	@Options(useGeneratedKeys = true, keyProperty = "kehuid", keyColumn = "kehuId")
	int insertkehu(@Param("kehu") Kehu kehu);

	// 新增车辆
	int insertkhcl(@Param("khcl") Khcl khcl);
	//删除车俩
	int deleteKhcl(@Param("khclid")Integer khclid);
	// 删除客户
	int deletekehu(@Param("kehuid") String kehuid);
}