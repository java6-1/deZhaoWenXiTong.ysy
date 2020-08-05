package com.accp.action.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.Bizghdw;
import com.accp.pojo.Clpp;
import com.accp.pojo.Ghdw;

@RestController
@RequestMapping("/api/zyw")
public class Auctionghdw {

	@Autowired
	Bizghdw biz;
	
	@GetMapping("/ghdwquery")
	public Object query(Integer pageNum,String wxdz) {
		return biz.list(pageNum, wxdz);
	}
	
	@GetMapping("/ghdwdel")
	public Object del(Integer id) {
		biz.del(id);
		return 1;
	}
	@PostMapping("/insghdw")
	public Object insert(Ghdw ghdw) {
	biz.ins(ghdw);
		return 1;
	}
	
	@PostMapping("/updateghdw")
	public Object upda(Ghdw ghdw) {
	biz.upda(ghdw);
		return 1;
	}
}
