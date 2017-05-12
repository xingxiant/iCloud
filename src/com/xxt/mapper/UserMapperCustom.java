package com.xxt.mapper;

import com.xxt.po.User;
import com.xxt.po.UserCustom;
import com.xxt.po.UserExample;
import com.xxt.po.UserQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapperCustom {
	//查询用户列表
    public List<UserCustom> findUserList(UserQueryVo userQueryVo)throws Exception;
    //查询用户列表
    public UserCustom checkUser(UserQueryVo userQueryVo)throws Exception;
    //根据id查询用户
    public UserCustom findUserById(int id)throws Exception;
}