package com.accp.action.wlw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wlw.BanzuBiz;
import com.accp.pojo.Banzu;
import com.accp.pojo.Post;
import com.accp.pojo.Staff;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/wlw")
public class BanzuAction {
	//
	@Autowired
	private BanzuBiz banziBiz;
	
	//查询全部班组
	@GetMapping("queryBanzu")
	private List<Banzu> queryBanzu(){
		return banziBiz.queryBanzu();
	}
	
	//分页查询全部
	@GetMapping("queryByBanzu/{pageNum}/{pageSize}")
	public PageInfo<Staff> queryByBanzu(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println("进入yixiawqe1");
		System.out.println("qqqa");
		return banziBiz.queryByBanzu(pageNum, pageSize);
	}
}
