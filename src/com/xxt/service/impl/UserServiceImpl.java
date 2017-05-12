package com.xxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xxt.mapper.UserMapper;
import com.xxt.mapper.UserMapperCustom;
import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;
import com.xxt.service.UserService;


public class UserServiceImpl implements UserService {
	@Autowired
	UserMapperCustom userMapperCustom;
	@Autowired
	UserMapper userMapper;
	@Override
	public UserCustom checkUser(UserQueryVo userQueryVo) throws Exception {
		
		return userMapperCustom.checkUser(userQueryVo);
	}
	@Override
	public UserCustom findUserById(int id) throws Exception {
		
		return userMapperCustom.findUserById(id);
	}
	@Override
	public void updateUser(UserQueryVo userQueryVo) throws Exception {
		
		userMapperCustom.update(userQueryVo);
	}

}
