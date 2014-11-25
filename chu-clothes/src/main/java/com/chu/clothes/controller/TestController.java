package com.chu.clothes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chu.clothes.dao.domain.Test;
import com.chu.clothes.service.TestService;

@Controller
@RequestMapping("/chu/test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping(value="/find",method = {RequestMethod.POST})
	public Test findById(Integer id) {
		Test test = null;
		if (id != null) {
			List<Test> list = testService.findById(id);
			if (list != null) {
				test = list.get(0);
			}
		}
		return test;
	}
	
}
