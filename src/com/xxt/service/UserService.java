package com.xxt.service;

import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;

/**
 * �û�service
 * @author 13983
 *
 */
public interface UserService {

	public	UserCustom checkUser(UserQueryVo userQueryVo)throws Exception;  //����û��Ƿ����
	
}
