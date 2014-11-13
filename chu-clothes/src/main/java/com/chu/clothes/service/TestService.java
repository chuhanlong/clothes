package com.chu.clothes.service;

import java.util.List;

import com.chu.clothes.dao.domain.Test;

public interface TestService {

	
	public List<Test> findById(Integer id);
}
