package com.accp.action.yj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.yj.staffBiz;
import com.accp.pojo.CaiDan;

import com.accp.pojo.Staff;

import com.accp.utils.PhoneCode;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("api/show")
public class staffAction {
	@Autowired
	private staffBiz staffmapper;

	// 账号密码登录
	@PostMapping("/denglu1")
	public Map<String, Object> delu1(String name, String password, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 1.创建客户对象
				Subject client = SecurityUtils.getSubject();
				try {
					// 2.登录认证=>自定义认证器Realm
					client.login(new UsernamePasswordToken(name, password));
					map.put("code", "200");
					map.put("msg", "ok");
				} catch (UnknownAccountException e) {// 用户名不存在
					map.put("code", "301");
					map.put("msg", "用户名不存在");
				} catch (IncorrectCredentialsException e) {// 密码错误
					map.put("code", "302");
					map.put("msg", "密码错误");
				}
		return map;
	}

	// 获取用户名
		@GetMapping("/denglu2")
		public Staff delu2() {
		Staff us  =(Staff)SecurityUtils.getSubject().getSession().getAttribute("USERS");
		System.out.println("获取用户名1"+JSON.toJSONString(us));
		return us;
	}
		//获取该用户菜单
		@GetMapping("/getCaiDan")
		public Map<String,Object> getUserFunTree() {
			// 从session获得用户，以便得到权限
			Staff user = (Staff) SecurityUtils.getSubject().getSession().getAttribute("USERS");
			Map<String, Object> map = new HashMap<String, Object>();
//			Map<String, Object> map2 = new HashMap<String, Object>();
//			List list1 = new ArrayList();// 剔除重复值，保存一级菜单名称
//			for (CaiDan fun : user.getJiaose().getListCaiDan()) {
//				if(fun.getDengji()==1) {
//					map.put(fun.getControlleraction(),fun.getMenuname());
//				}else if() {
//					
//				}
//			}
//			
//			System.out.println("菜单:"+JSON.toJSONString(tree));
			return map;
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
