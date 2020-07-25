package com.accp.action.hl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.hl.ChexingBiz;
import com.accp.biz.hl.QxkzBiz;
import com.accp.pojo.Chexing;
import com.accp.pojo.Qxkz;


@RestController
@RequestMapping("/api/hl") // 命名空间
public class HlAction {
	@Autowired
	private ChexingBiz chexingBiz;
	
	@Autowired
	private QxkzBiz qxkzBiz;
	
	
	
	/**查询全部**/
	@GetMapping("/selec")
	public List<Qxkz> select() {	
		List<Qxkz> list = qxkzBiz.select();
		return  list;
	}
	
	/**根据ID查询**/
	@GetMapping("/selectByPrimaryKey/{staffID}")
	public Qxkz selectByPrimaryKey(@PathVariable Integer staffID) {	
		Qxkz qxkz = qxkzBiz.selectByPrimaryKey(staffID);
		System.out.println(qxkz);
		return  qxkz;
	}
	
	
	/**根据ID查询**/
	@PostMapping("/insert")
	public int  insert(@RequestBody Qxkz record) {	
		int count = qxkzBiz.insert(record);
		return  count;
	}
	
	/**修改会员权限**/
	@PutMapping("/updateByPrimaryKeySelective")
	public int  updateByPrimaryKeySelective(@RequestBody Qxkz record) {	
		int count = qxkzBiz.updateByPrimaryKeySelective(record);
		return  count;
	}
	
}
