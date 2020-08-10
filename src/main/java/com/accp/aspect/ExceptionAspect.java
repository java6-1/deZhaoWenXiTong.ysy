package com.accp.aspect;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionAspect {
	//操作权限认证
	@ExceptionHandler
	@ResponseBody
	public Map<String, Object> errorHandler(Exception e) {
		Map<String, Object> message = new HashMap<String, Object>();
		if (e instanceof AuthorizationException) {
			message.put("code", "501");
			message.put("msg", "权限不足!");
		} else {
			message.put("code", "500");
			message.put("msg", e.getMessage());
		}
		return message;
	}

}
