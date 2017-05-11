package com.xxt.po;

import com.xxt.po.User;
import com.xxt.po.UserCustom;

/**
 * 用户包装对象
 * @author 13983
 *
 */
public class UserQueryVo {
	private User user;
	private UserCustom userCustom;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserCustom getUserCustom() {
		return userCustom;
	}
	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
}
