package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.domain.UserEntity;
import com.springmvc.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		
		List<UserEntity> list = userService.getAllUser();
		
		modelMap.addAttribute("resultList", list);
		return "userList";
		
	}
}
