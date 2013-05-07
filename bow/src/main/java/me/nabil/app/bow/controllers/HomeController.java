package me.nabil.app.bow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController extends BaseController{
	
	
	@RequestMapping(value="/")
	public String home(){
		getLogger().info("HomeController: Passing through...");
        return "/WEB-INF/views/jsp/index.jsp";
	}
}
