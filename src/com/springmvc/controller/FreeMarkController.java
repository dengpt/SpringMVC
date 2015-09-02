package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/freeMarker")
public class FreeMarkController {

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap){
		modelMap.addAttribute("username", "xijinping");
		modelMap.addAttribute("password","pengliyuan");
		return "index";
		
	}
}
