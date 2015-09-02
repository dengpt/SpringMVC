package com.springmvc.dao;

import java.util.List;

import com.springmvc.domain.UserEntity;

public interface UserDao {

	//这里的函数名，参数与UserMapper.xml中的id相对应。
	public UserEntity getUser(String id);
	
	public List<UserEntity> getAllUser();
	
	public int insertUser(UserEntity user);
	
	public int updateUser(UserEntity user);
	
	public int deleteUser(String id);
}
