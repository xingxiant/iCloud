package com.xxt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxt.mapper.UserMapperCustomTest;
import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;
import com.xxt.service.UserService;

@Controller
@RequestMapping("/userAction")
public class UserController {
	@Autowired
	UserService userService;
	//修改用户信息
	@RequestMapping("/update")
	public String update(Model model,HttpServletRequest request,UserQueryVo userQueryVo) throws Exception{
		userService.updateUser(userQueryVo);
		
		return "queryById.action?id="+userQueryVo.getUserCustom().getId();
		
	}
	@RequestMapping("/queryById")
	public String queryById(Model model,HttpServletRequest request,int id) throws Exception{
		UserCustom userCustom=new UserCustom();
		userCustom=userService.findUserById(id);
		model.addAttribute("userCustom", userCustom);
		return "/user/formation.jsp";
		
	}
}
