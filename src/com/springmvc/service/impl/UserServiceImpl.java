package com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.domain.UserEntity;
import com.springmvc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserEntity getUser(String id) {
		
		return null;
	}

	@Override
	public List<UserEntity> getAllUser() {
		return userDao.getAllUser();
	}

}
