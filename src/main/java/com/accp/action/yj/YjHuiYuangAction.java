package com.accp.action.yj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yj.YjHuiYuangBiz;
import com.accp.pojo.HuiYuang;
import com.accp.pojo.Jies;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/yj")
public class YjHuiYuangAction {
	@Autowired
	private YjHuiYuangBiz hyBiz;

	// 分页查询所又会员
	@PostMapping("/selectHuiYuangPage")
	public Map<String, Object> selectHuiYuangPage(Integer pageNum, Integer pageSize, String sousuo) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			PageInfo<HuiYuang> page = hyBiz.selectHuiYuangPage(pageNum, pageSize, sousuo);
			map.put("data", page);
			map.put("code", "200");
			System.out.println("数据会员" + JSON.toJSONString(page));
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 新增会员
	@RequiresRoles("超级管理员")
	@PostMapping("/insertHuiYuang")
	public Map<String, Object> insertHuiYuang(@RequestBody HuiYuang hy) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			hyBiz.insertHuiYuan(hy);
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 充值会员
	@RequiresRoles("超级管理员")
	@GetMapping("/selectHuiYuangCZ/{jifen}/{hyid}")
	public Map<String, Object> selectHuiYuangCZ(@PathVariable double jifen, @PathVariable Integer hyid) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			hyBiz.selectHuiYuangCZ(jifen, hyid);
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 删除会员
	@RequiresRoles("超级管理员")
	@GetMapping("/deleteHuiYuangid/{hyid}")
	public Map<String, Object> insertHuiYuang(@PathVariable Integer hyid) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			System.out.println("进入" + hyid + ":" + hyBiz.selectHuiYuangJiFenId(hyid));
			if (hyBiz.selectHuiYuangJiFenId(hyid) == 0) {
				hyBiz.deleteHuiYuangId(hyid);
				map.put("code", "200");
			} else {
				map.put("code", "300");
			}
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}
	// 分页查询未结算
	@PostMapping("/selectJiesWeiPage")
	public Map<String, Object> selectJiesWeiPage(Integer pageNum, Integer pageSize, String chePaiHao) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			PageInfo<Jies> page =hyBiz.selectJiesWeiPage(pageNum, pageSize, chePaiHao);
			map.put("data", page);
			map.put("code", "200");
			System.out.println("结算" + JSON.toJSONString(page));
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}
	//分页查询结算
		@PostMapping("/selectJiesJiePage")
		public Map<String, Object> selectJiesJiePage(Integer pageNum, Integer pageSize, String chePaiHao) {
			Map<String, Object> map = new HashMap<String, Object>();
			try {
				PageInfo<Jies> page =hyBiz.selectJiesJiePage(pageNum, pageSize, chePaiHao);
				map.put("data", page);
				map.put("code", "200");
				System.out.println("结算32" + JSON.toJSONString(page));
			} catch (Exception e) {
				map.put("code", "400");
				e.printStackTrace();
			}
			return map;
		}
	//查询结算项目
		@GetMapping("/yjSelectJsxm/{jiesId}")
		public Map<String, Object> yjSelectJsxm(@PathVariable String jiesId) {
			System.out.println(jiesId);
			Map<String, Object> map = new HashMap<String, Object>();
			try {		
				map.put("data", hyBiz.yjSelectJsxm(jiesId));
					map.put("code", "200");
			} catch (Exception e) {
				map.put("code", "400");
				e.printStackTrace();
			}
			return map;
		}
}
