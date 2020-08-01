package com.accp.action.yj;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yj.KuhuBiz;
import com.accp.pojo.Kehu;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("api/yj")
public class YjKehuAction {
	@Autowired
	private KuhuBiz kehuservice;

	// 分页客户
	@PostMapping("/kehupage")
	public Map<String, Object> kehupage(Integer pageNum, Integer pageSize, String sousuo) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			map.put("data", kehuservice.selectkehuPage(pageNum, pageSize, sousuo));

			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 分页车辆
	@PostMapping("/khclpage")
	public Map<String, Object> khclpage(Integer pageNum, Integer pageSize, Integer kehuid) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			System.out.println(kehuid);
			map.put("data", kehuservice.selectkehuclPage(pageNum, pageSize, kehuid));
			System.out.println("数据2" + JSON.toJSONString(kehuservice.selectkehuclPage(pageNum, pageSize, kehuid)));
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 新增客户与车辆
	@PostMapping("/insertkehu")
	public Map<String, Object> insertkehu(@RequestBody Kehu kehu) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			System.out.println("对象" + JSON.toJSONString(kehu));

			kehu.setKehujrsj(kehu.getKhcl().getKhclrq());
			kehuservice.insertkehu(kehu);
			kehu.getKhcl().setKehuid(kehu.getKehuid());
			kehuservice.insertkehucl(kehu.getKhcl());
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 删除客户与车辆
	@DeleteMapping("/deletekehu")
	public Map<String, Object> delectkehu(String kehuid) {
		System.out.println("进入");
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			kehuservice.deletekehu(kehuid);
			map.put("code", "200");
		}catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}
}
