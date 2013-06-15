package me.nabil.app.bow.controllers;

import javax.servlet.http.HttpServletRequest;

import me.nabil.app.bow.entity.User;
import me.nabil.app.bow.service.UserService;
import me.nabil.app.bow.template.BaseTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "login")
	public String login() {
		return "/WEB-INF/views/jsp/login.jsp";
	}

	@RequestMapping(value = "logon")
	@ResponseBody
	public BaseTemplate logon(User user, HttpServletRequest request) {
		User ret = userService.checkLogin(user);
		getLogger().info("user login:" + user);
		if (ret == null) {
			return new BaseTemplate(Boolean.FALSE, "用户名不存在", null);
		} else if (!user.getPassword().equals(ret.getPassword())) {
			return new BaseTemplate(Boolean.FALSE, "用户名或密码错误", null);
		} else {
			request.getSession().setAttribute("user", user);
			return new BaseTemplate(Boolean.TRUE, null, null);
		}
	}
}
