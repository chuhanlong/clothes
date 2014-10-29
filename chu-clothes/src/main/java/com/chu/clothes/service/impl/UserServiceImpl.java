package com.chu.clothes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chu.clothes.dao.domain.User;
import com.chu.clothes.dao.mapper.UserMapper;
import com.chu.clothes.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User findById(Integer id) {
		User user = null;
		if (id != null) {
			user = userMapper.selectByPrimaryKey(id);
		}
		return user;
	}

}
