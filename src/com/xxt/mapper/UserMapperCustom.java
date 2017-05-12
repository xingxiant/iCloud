package com.xxt.mapper;

import com.xxt.po.User;
import com.xxt.po.UserCustom;
import com.xxt.po.UserExample;
import com.xxt.po.UserQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapperCustom {
	//��ѯ�û��б�
    public List<UserCustom> findUserList(UserQueryVo userQueryVo)throws Exception;
    //��ѯ�û��б�
    public UserCustom checkUser(UserQueryVo userQueryVo)throws Exception;
    //����id��ѯ�û�
    public UserCustom findUserById(int id)throws Exception;
}