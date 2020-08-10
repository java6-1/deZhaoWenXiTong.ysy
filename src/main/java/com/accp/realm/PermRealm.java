package com.accp.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


import com.accp.biz.yj.staffBiz;
import com.accp.pojo.Staff;
import com.alibaba.fastjson.JSON;

public class PermRealm extends AuthorizingRealm {

	@Autowired
	private staffBiz userBiz;

	//认证逻辑
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获得用户名
		if (token.getPrincipal() == null)
			return null;
		String userName = token.getPrincipal().toString();
		Staff user = userBiz.yjSelectCaiDan(userName);//查询用户名
		if (user == null)
			return null;
		SecurityUtils.getSubject().getSession().setAttribute("USERS", user);//保存会话信息
		return new SimpleAuthenticationInfo(userName, user.getStaffpawss(), this.getName());
	}

	//授权逻辑
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();//获得用户名
		Staff user = userBiz.yjSelectCaiDan(userName);//查询角色，权限操作
		System.out.println("用户2:"+JSON.toJSONString(user));
		SimpleAuthorizationInfo author = new SimpleAuthorizationInfo();
		author.addRole(user.getJiaose().getJiaosename());//添加角色
		//循环添加操作
		user.getJiaose().getListCaiDan().forEach(obj -> {
			//挂号管理:r
			author.addStringPermission(obj.getMenuname() + ":" + obj.getCaozuo());
		});
		return author;
	}

}
