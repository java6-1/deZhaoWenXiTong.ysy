package com.accp.action.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.ZywBiz;
import com.accp.pojo.Clpp;

@RestController
@RequestMapping("/api/zyw")
public class ActionZyw {
 
	@Autowired
	ZywBiz biz;
	
	@GetMapping("/pp")
	public Object show(Integer pageNum,String name,String szm) {
		System.out.println("11"+name);
		return biz.queryByAuction(pageNum,name,szm);
	}
	
	@PostMapping("/ins")
	public Object insert(Clpp clpp) {
	biz.ins(clpp);
		return 1;
	}
	
	@PostMapping("/upda")
	public Object upda(Clpp clpp) {
	    biz.upda(clpp);
		return 1;
	}
	
	@GetMapping("/sc")
	public Object sc(Integer ppid) {
		 biz.del(ppid);
		return 1;
	}
}
