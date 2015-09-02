package com.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.domain.UserEntity;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	@Override
	public UserEntity getUser(String id) {
		
		return null;
	}

	@Override
	public List<UserEntity> getAllUser() {
		return null;
	}

}
