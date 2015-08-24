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
	
	public int Insert(User user) {
		int i = 0;
		if (user != null) {
			i = userMapper.insertSelective(user);
		}
		return i;
	}

	public int update(User user) {
		int i = 0;
		if (user != null) {
			i = userMapper.updateByPrimaryKeySelective(user);
		}
		return i;
	}

	public User findById(Integer id) {
		User user = null;
		user = userMapper.selectByPrimaryKey(id);
		return user;
	}

}
