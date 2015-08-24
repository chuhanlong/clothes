package com.chu.clothes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chu.clothes.bean.ResObj;
import com.chu.clothes.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
//	@ResponseBody
//	@RequestMapping("/save")
//	public ResObj<User> save(){
//		ResObj
//	}
}
