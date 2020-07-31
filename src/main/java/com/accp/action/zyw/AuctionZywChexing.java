package com.accp.action.zyw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zyw.ZywBiz;
import com.accp.pojo.Chexing;
import com.accp.pojo.Clpp;

@RestController
@RequestMapping("/api/zyw")
public class AuctionZywChexing {

	
	@Autowired
	ZywBiz biz;
	
	@GetMapping("/chexing")
	public Object show(Integer pageNum,Integer size,String name,String szm) {
		System.out.println(name);
		if(name !="" && name !=null && name != "undefined") {
			name="%"+name+"%";
		}

		return biz.queryByChe(pageNum,name,szm,size);
	}
	@PostMapping("/inschexing")
	public Object insert(Chexing chexing) {
		System.out.println(chexing.toString());
	   biz.inschexing(chexing);
		return 1;
	}
	@GetMapping("/scchexing")
	public Object sc(Integer cheid ) {
		return biz.dels(cheid);
	}
	
}
