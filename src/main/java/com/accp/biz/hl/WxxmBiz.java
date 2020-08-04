package com.accp.biz.hl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WxxmMapper;
import com.accp.pojo.Wxxm;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WxxmBiz {
	@Autowired
	private WxxmMapper wxxmMapper;
	public List<Wxxm> selec(){
		return wxxmMapper.select();
	}
	
	
	public List<Wxxm> selectByP(Integer wxtypeid){
		return wxxmMapper.selectByP(wxtypeid);
	}
	
	/*新增维修记录主表 */
	@Transactional(propagation = Propagation.REQUIRED, isolation =Isolation.READ_COMMITTED, readOnly = false)
	public int updateBy(Integer bz1,Integer wxxmid) {
		return wxxmMapper.updateBy(bz1,wxxmid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation =Isolation.READ_COMMITTED, readOnly = false)
	public int insertlist(List<Wxxm> record) {
		return wxxmMapper.insertlist(record);
	}
}
