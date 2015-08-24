package com.chu.clothes.service;

import com.chu.clothes.dao.domain.User;

/**
 * 用户service，reference chu.user
 *
 * @author chu
 *
 */
public interface UserService {
	/**
	 * 插入
	 * @param user
	 * @return
	 */
	public int Insert(User user);
	
	/**
	 * 更新
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	public User findById(Integer id);
	
}
