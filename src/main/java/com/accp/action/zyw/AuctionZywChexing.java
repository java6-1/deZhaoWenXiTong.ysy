package com.accp.action.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.ZywBiz;

@RestController
@RequestMapping("/api/zyw")
public class AuctionZywChexing {

	
	@Autowired
	ZywBiz biz;
	
	@GetMapping("/chexing")
	public Object show(Integer pageNum,Integer size,String name,String szm) {
		System.out.println(size);
		return biz.queryByChe(pageNum,name,szm,size);
	}
}
