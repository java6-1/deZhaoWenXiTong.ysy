package com.accp.biz.hl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.QxkzMapper;
import com.accp.pojo.Qxkz;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class QxkzBiz {
	@Autowired
	private QxkzMapper qxkzMapper;
	
	/* 查询全部 */
	public List<Qxkz>  select() {
		return qxkzMapper.select();
	}
	
	/* 用户id查询 */
	public Qxkz  selectByPrimaryKey(Integer staffID) {
		return qxkzMapper.selectByPrimaryKey(staffID);
	}
	
	/* 新增员工 */
	@Transactional(propagation = Propagation.REQUIRED, isolation =Isolation.READ_COMMITTED, readOnly = false)
	public int insert(Qxkz record){
		return qxkzMapper.insert(record);
	}
	
	
	/* 修改会员权限 */
	@Transactional(propagation = Propagation.REQUIRED, isolation =Isolation.READ_COMMITTED, readOnly = false)
	public int updateByPrimaryKeySelective(Qxkz record) {
		return qxkzMapper.updateByPrimaryKeySelective(record);
	}
	
}
