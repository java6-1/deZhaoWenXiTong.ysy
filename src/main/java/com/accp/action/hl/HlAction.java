package com.accp.action.hl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.hl.ChexingBiz;
import com.accp.pojo.Chexing;


@RestController
@RequestMapping("/api/hl") // 命名空间
public class HlAction {
	
	@Autowired
	private ChexingBiz chexingBiz;
	
	@GetMapping("/selec")
	public List<Chexing> select() {	
		List<Chexing> list = chexingBiz.select();
		System.out.println("1213");
		return  list;
	}
}
