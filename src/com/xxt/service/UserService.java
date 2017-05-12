package com.xxt.service;

import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;

/**
 * �û�service
 * @author 13983
 *
 */
public interface UserService {
	//����û��Ƿ����
	public	UserCustom checkUser(UserQueryVo userQueryVo)throws Exception;  
	//����id��ѯ�û�
	public	UserCustom findUserById(int id)throws Exception; 
	//�޸��û�
	public void updateUser(UserQueryVo userQueryVo)throws Exception;
	
}
