package com.accp.action.zyw;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.Bizspzl;
import com.accp.pojo.Spxx;

@RestController
@RequestMapping("/api/zyw")
public class Actionspzl {

	@Autowired 
	Bizspzl biz;
	
	@GetMapping("/queryspzl")
	public Object name(Integer pageNum,String spzl) {
		if(spzl.equals("undefined")) {
			spzl=null;
		}
		System.out.println(spzl+"1111111111");
		return biz.list(pageNum, spzl);
	}
	@GetMapping("/removespxx")
	public Object spxx(Integer spid) {
		Map<String, Object> message = new HashMap<String,Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		biz.del(spid);
		return message;
	}
	@PostMapping("/updatespzl")
	public Object updatespzl(Spxx spxx) {
		Map<String, Object> message = new HashMap<String,Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		biz.upda(spxx);
		return message;
	}
	@PostMapping("/insspxx")
	public Object insspxx(Spxx spxx) {
		Map<String, Object> message = new HashMap<String,Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		biz.ins(spxx);
		return message;
	}
	
}
