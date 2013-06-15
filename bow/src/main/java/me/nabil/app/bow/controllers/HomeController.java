package me.nabil.app.bow.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController extends BaseController{
	
	
	@RequestMapping(value="/")
	public String home(HttpServletRequest request){
		if(null == getUser(request)){
			return "user/login";
		} else {
			getLogger().info("HomeController: Passing through...");
	        return "/WEB-INF/views/jsp/index.html";
		}
		
	}
}
