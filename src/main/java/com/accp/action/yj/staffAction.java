package com.accp.action.yj;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yj.staffBiz;
import com.accp.pojo.Staff;

import com.accp.utils.PhoneCode;

@RestController
@RequestMapping("api/show")
public class staffAction {
	@Autowired
	private staffBiz staffmapper;

	// 账号密码登录
	@PostMapping("/denglu1")
	public Map<String, Object> delu1(String name, String password, HttpSession session) {
		System.out.println("小");
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Staff us = staffmapper.selectuser(name, password);
			map.put("data", us);
			session.setAttribute("user", us);
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 获取用户名
		@PostMapping("/denglu2")
		public Staff delu2(HttpSession session) {
		Staff us  =(Staff) session.getAttribute("user");
		return us;
	}


	// 手机号登录也验证
	@GetMapping("/denglu2/{phone}")
	public Map<String, Object> delu2(@PathVariable String phone, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			System.out.println();
			Staff us = staffmapper.selectuserPhone(phone);
			map.put("data", us);
			if (null != us) {
				map.put("type", us.getStaffid());
			}
			session.setAttribute("user", us);
			map.put("code","200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}

	// 获取验证码
	@GetMapping("/dengluyanzhengma/{phone}")
	public Map<String, Object> dengluyanzhengma(@PathVariable String phone) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			// 获取验证码
			PhoneCode.getPhonemsg(phone, map);
			map.put("code", "200");
		} catch (Exception e) {
			map.put("code", "400");
			e.printStackTrace();
		}
		return map;
	}
	
}
