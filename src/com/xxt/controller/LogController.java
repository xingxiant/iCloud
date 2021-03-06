package com.xxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;
import com.xxt.service.UserService;

/**
 * 用于用户登录，注销的Handler
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
		UserCustom userCustom=new UserCustom();
		userCustom=userService.checkUser(userQueryVo);
		if(userCustom==null){
			model.addAttribute("error", "用户名或密码错误");
			return "/jsp/login.jsp";
		}else{
			//登录成功，将用户名,id放到session域
			HttpSession session=request.getSession();
			
			session.setAttribute("user_name", userCustom.getUsername());
			session.setAttribute("user_id", userCustom.getId());
			
			return "/user/index.jsp";
			}
		
		
		
	}
	@RequestMapping("/logout")
	public String ss(Model model,HttpServletRequest request )throws Exception{
		//退出登录，将用户名，id从session域中移除
		HttpSession session=request.getSession();
		
		session.removeAttribute("user_name");
		session.removeAttribute("user_id");
		
		return "/jsp/login.jsp";
		
		
	}

}
