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

import com.accp.biz.wlw.WaiqinBizs;
import com.accp.pojo.Waiqin;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/wlw")
public class WaiqinAution {
	//
	@Autowired
	private WaiqinBizs waiqinBizs;
	
	//查询全部外勤车辆
	@GetMapping("queryWaiqin/{pageNum}/{pageSize}")
	public PageInfo<Waiqin> queryByWaiqin(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println("进入yixia1");
		return waiqinBizs.queryWaiqin(pageNum, pageSize);
	}
	
	//新增
	@PostMapping("addWaiqin")
	@ResponseBody
	public Map<String, Object> addWaiqin(@RequestBody Waiqin waiqin){
		System.out.println(JSON.toJSONString(waiqin));
		int count = waiqinBizs.addWaiqin(waiqin);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改
	@PostMapping("updateWaiqin")
	@ResponseBody
	public Map<String, Object> updateWaiqin(@RequestBody Waiqin waiqin){
		System.out.println(JSON.toJSONString(waiqin));
		int count= waiqinBizs.updateWaiqin(waiqin);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//根据id删除
	@GetMapping("deleteWaiqin/{waiqinid}")
	public Map<String, Object> deleteByWaiqin(@PathVariable Integer waiqinid) {
		int count = waiqinBizs.deleteWaiqin(waiqinid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//根据id查询
	@GetMapping("queryByWaqiqinid/{waiqinid}")
	public Waiqin queryByWaqiqin(@PathVariable Integer waiqinid) {
		Waiqin waiqin = waiqinBizs.queryBywaiqinid(waiqinid);
		return waiqin;
	}
}
