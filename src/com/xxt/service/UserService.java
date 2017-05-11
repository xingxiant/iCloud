package com.xxt.service;

import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;

/**
 * 用户service
 * @author 13983
 *
 */
public interface UserService {

	public	UserCustom checkUser(UserQueryVo userQueryVo)throws Exception;  //检查用户是否存在
	
}
