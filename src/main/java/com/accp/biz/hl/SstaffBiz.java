package com.accp.biz.hl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StaffMapper;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class SstaffBiz {
	
	@Autowired
	private StaffMapper staffMapper;
	public PageInfo<Staff> selec(Integer pageNum, Integer pageSize,String staffname){	
		PageHelper.startPage(pageNum, pageSize);
		return  new PageInfo<Staff>(staffMapper.selec(staffname));
	}
	
	
	public Staff selecBybzj(String staffname){
		return staffMapper.selecBybzj(staffname);
	}
	
	
	public List<Staff> selecBybzjg(){		
		return staffMapper.selecBybzjg();
	}
}
