package com.accp.action.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.BizWxxm;

@RestController
@RequestMapping("/api/zyw")
public class AuctionWxxm {

	@Autowired
	BizWxxm biz;
	
	@GetMapping("/queryWx")
	public Object query() {		
		return biz.list();
	}
	@GetMapping("/queryWxxm")
	public Object wxxm(Integer pageNum,Integer id) {
		System.out.println(pageNum+"  "+id);
		return biz.list2(pageNum,id) ;
	}
}
