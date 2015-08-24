package com.chu.clothes.service;

import com.chu.clothes.dao.domain.User;

/**
 * �û�service��reference chu.user
 *
 * @author chu
 *
 */
public interface UserService {
	/**
	 * ����
	 * @param user
	 * @return
	 */
	public int Insert(User user);
	
	/**
	 * ����
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * ����ID��ѯ�û�
	 * @param id
	 * @return
	 */
	public User findById(Integer id);
	
}
