package com.accp.action.wlw;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wlw.XjBiz;
import com.accp.pojo.Section;
import com.accp.pojo.Staff;
import com.accp.pojo.Xj;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/wlw")
public class XjAuction {
	//
	@Autowired
	private XjBiz xjBiz;
	
	//查询全部
	@GetMapping("queryXj/{pageNum}/{pageSize}")
	public PageInfo<Xj> queryByAuction(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return xjBiz.queryByXj(pageNum, pageSize);
	}
	
	//根据id查询
	@GetMapping("queryByids/{xjid}")
	public Xj queryByids(@PathVariable Integer xjid) {
		Xj xj = xjBiz.queryByids(xjid);
		return xj;
	}
	
	//新增技工星级
	@PostMapping("addXj")
	@ResponseBody
	public Map<String, Object> addSection(@RequestBody Xj xj){
		System.out.println(JSON.toJSONString(xj));
		int count = xjBiz.addXj(xj);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改
	@PostMapping("updateXj")
	@ResponseBody
	public Map<String, Object> updateXj(@RequestBody Xj xj){
		System.out.println(JSON.toJSONString(xj));
		int count= xjBiz.update(xj);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	
	//删除
	@GetMapping("deleteByid/{xjid}")
	public Map<String, Object> deleteXj(@PathVariable Integer xjid){	
		int count= xjBiz.deleteXj(xjid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
