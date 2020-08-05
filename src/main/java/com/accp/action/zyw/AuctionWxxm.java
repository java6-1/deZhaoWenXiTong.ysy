package com.accp.action.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.BizWxxm;
import com.accp.pojo.Wxxm;

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
	public Object wxxm(Integer pageNum,Integer id,String wxname) {
		System.out.println(pageNum+"  "+id+" "+wxname);
		return biz.list2(pageNum,id,wxname) ;
	}
	
	@PostMapping("/inswxxm")
	public Object ins(Wxxm wx) {
		biz.ins(wx);
		return 1;
	}
	@GetMapping("removewx")
	public Object removewx(Integer wxid) {
		biz.del(wxid);
		return 1;
	}
	@PostMapping("updatewxxm")
	public Object updatewxxm(Wxxm wx) {
		biz.upda(wx);
		return 1;
	}
}
