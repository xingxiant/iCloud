package com.xxt.service;

import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;

/**
 * 用户service
 * @author 13983
 *
 */
public interface UserService {
	//检查用户是否存在
	public	UserCustom checkUser(UserQueryVo userQueryVo)throws Exception;  
	//根据id查询用户
	public	UserCustom findUserById(int id)throws Exception; 
	//修改用户
	public void updateUser(UserQueryVo userQueryVo)throws Exception;
	
}
