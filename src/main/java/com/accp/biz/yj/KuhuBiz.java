package com.accp.biz.yj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accp.dao.KehuMapper;
import com.accp.pojo.Kehu;
import com.accp.pojo.Khcl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class KuhuBiz {
	@Autowired
	private KehuMapper kehumapper;

	// 客户分页
	public PageInfo<Kehu> selectkehuPage(Integer pageNum, Integer pageSize, String sousuo) {
		PageHelper.startPage(pageNum, pageSize);
		if (sousuo != null) {
			sousuo = "%" + sousuo + "%";
		}
		PageInfo<Kehu> page = new PageInfo<Kehu>(kehumapper.selectkehuPage(sousuo));
		return page;
	}

	// 车辆分页
	public PageInfo<Khcl> selectkehuclPage(Integer pageNum, Integer pageSize, Integer kehuid) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Khcl> page = new PageInfo<Khcl>(kehumapper.selectkehuclPage(kehuid));
		return page;
	}

	// 新增客户与车辆
	public int insertkehu(Kehu kehu) {
		return kehumapper.insertkehu(kehu);
	}

	// 新增客户与车辆
	public int insertkehucl(Khcl khcl) {
		return kehumapper.insertkhcl(khcl);

	}

	// 删除客户
	public int deletekehu(String kehuid) {
		return kehumapper.deletekehu(kehuid);
	}
}
