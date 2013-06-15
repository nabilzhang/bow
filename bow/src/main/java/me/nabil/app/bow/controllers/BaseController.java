package me.nabil.app.bow.controllers;

import javax.servlet.http.HttpServletRequest;

import me.nabil.app.bow.entity.User;

import org.slf4j.Logger;

public class BaseController {
	private Logger logger = null;

	protected Logger getLogger() {
		if (null == logger) {
			logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
		}
		return logger;
	}

	/**
	 * 获取当前访问用户
	 * 
	 * @param request
	 * @return
	 */
	protected User getUser(HttpServletRequest request){
		User user = (User)request.getSession().getAttribute("user");
		return user;
		
	}
}
