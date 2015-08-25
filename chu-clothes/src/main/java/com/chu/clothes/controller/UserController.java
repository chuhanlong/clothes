package com.chu.clothes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chu.clothes.bean.MsgObj;
import com.chu.clothes.bean.ResObj;
import com.chu.clothes.dao.domain.User;
import com.chu.clothes.enumBean.RetCodeType;
import com.chu.clothes.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/save")
	public ResObj<User> save(User user){
		ResObj<User> res = new ResObj<User>();
		MsgObj msg = new MsgObj();
		msg.setMsg(RetCodeType.UNDEFINED.getMsg());
		res.setCode(RetCodeType.UNDEFINED.getCode());
		res.setMessage(msg);
		
		return res;
	}
}
