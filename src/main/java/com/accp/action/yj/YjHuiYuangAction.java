package com.accp.action.yj;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yj.YjHuiYuangBiz;
import com.accp.pojo.HuiYuang;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/yj")
public class YjHuiYuangAction {
	@Autowired
	private YjHuiYuangBiz hyBiz;
	//分页查询所又会员
	@PostMapping("/selectHuiYuangPage")
	public Map<String,Object> selectHuiYuangPage(Integer pageNum,Integer pageSize,String sousuo){
		Map<String, Object> map = new HashMap<String, Object>();
//		try {
//			PageInfo<HuiYuang> page=hyBiz.selectHuiYuangPage(pageNum, pageSize, sousuo);
//			map.put("data", page);
//			map.put("code", "200");
//			System.out.println("数据会员"+JSON.toJSONString(page));
//		} catch (Exception e) {
//			map.put("code", "400");
//			e.printStackTrace();
//		}
		return map;
	}
}
