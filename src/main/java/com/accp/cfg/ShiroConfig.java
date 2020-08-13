package com.accp.cfg;

import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.mgt.SecurityManager;

import com.accp.realm.PermRealm;

@Configuration
public class ShiroConfig {

	// 异常切面
	@Bean
	@ConditionalOnMissingBean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator daapc = new DefaultAdvisorAutoProxyCreator();
		daapc.setProxyTargetClass(true);
		return daapc;
	}

	//自定义验证器
	@Bean
	public PermRealm permRealm() {
		PermRealm customRealm = new PermRealm();// 构建自定义验证器
		return customRealm;
	}

	//权限管理器(web)
	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(permRealm());
		return securityManager;
	}

	// 启用角色,权限元注解验证配置
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
		return authorizationAttributeSourceAdvisor;
	}

	//启动过滤器
	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		// shiro过滤器设置
//		Map<String, String> map = new HashMap<String, String>();
//		// 不验证登录url
//		map.put("/api/users/loginIn/**", "anon");//公开资源
//		// 对所有url进行会话认证
//		map.put("/**", "user");
//		// 会话验证失败，进入登录url
//		shiroFilterFactoryBean.setLoginUrl("/login.html");
//		shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
		return shiroFilterFactoryBean;
	}

}
