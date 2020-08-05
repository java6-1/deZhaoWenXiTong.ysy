package com.accp.action.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.Bizghdw;

@RestController
@RequestMapping("/api/zyw")
public class Auctionghdw {

	@Autowired
	Bizghdw biz;
	
	@GetMapping("/ghdwquery")
	public Object query(Integer pageNum,String wxdz) {
		return biz.list(pageNum, wxdz);
	}
}
