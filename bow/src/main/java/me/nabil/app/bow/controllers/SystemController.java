package me.nabil.app.bow.controllers;

import me.nabil.app.bow.template.BaseTemplate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/system")
public class SystemController {
	
	@RequestMapping("init")
	@ResponseBody
	public BaseTemplate init(){
		return new BaseTemplate(Boolean.TRUE, null, null);
	}
}
