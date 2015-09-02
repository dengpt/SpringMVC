package com.springmvc.service;

import java.util.List;

import com.springmvc.domain.UserEntity;

public interface UserService {

	public UserEntity getUser(String id);
	
	public List<UserEntity> getAllUser();
}
