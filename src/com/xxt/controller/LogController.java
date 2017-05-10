package com.xxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxt.po.UserQueryVo;
import com.xxt.service.UserService;
import com.xxt.service.impl.UserServiceImpl;

/**
 * 用于登录，注销的Handler
 * @author 13983
 *
 */
@Controller
//添加url的根路径
@RequestMapping("/logs")
public class LogController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model,UserQueryVo userQueryVo)throws Exception{
		if(userService.checkUser(userQueryVo)==null){
			model.addAttribute("error", "用户名或密码错误");
			return "/jsp/login.jsp";
		}else{
			//登录成功，将用户名放到session域
			HttpSession session=request.getSession();
			session.setAttribute("user_name", userQueryVo.getUserCustom().getUsername());	
			return "/jsp/test.jsp";
			}
		
		
		
	}
	@RequestMapping("/")
	public String ss(Model model,String username,String password)throws Exception{
		
		return "/jsp/test.jsp";
		
		
	}

}
