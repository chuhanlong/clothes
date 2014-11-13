package com.chu.clothes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chu.clothes.dao.domain.Test;
import com.chu.clothes.dao.domain.TestExample;
import com.chu.clothes.dao.mapper.TestMapper;
import com.chu.clothes.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestMapper testMapper;
	
	public List<Test> findById(Integer id) {
		List<Test> test = null;
		if (id != null) {
			TestExample c = new TestExample();
			TestExample.Criteria cr = c.createCriteria();
			cr.andIdEqualTo(id);
			test = testMapper.selectByExample(c);
		}
		return test;
	}
}
