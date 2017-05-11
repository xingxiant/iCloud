package com.xxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;
import com.xxt.service.UserService;

/**
 * �����û���¼��ע����Handler
 * @author 13983
 *
 */
@Controller
//���url�ĸ�·��
@RequestMapping("/logs")
public class LogController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model,UserQueryVo userQueryVo)throws Exception{
		UserCustom userCustom=new UserCustom();
		userCustom=userService.checkUser(userQueryVo);
		if(userCustom==null){
			model.addAttribute("error", "�û������������");
			return "/jsp/login.jsp";
		}else{
			//��¼�ɹ������û���,id�ŵ�session��
			HttpSession session=request.getSession();
			
			session.setAttribute("user_name", userCustom.getUsername());
			session.setAttribute("user_id", userCustom.getId());
			System.out.println(session.getAttribute("user_name"));
			System.out.println(session.getAttribute("user_id"));
			return "/user/index.jsp";
			}
		
		
		
	}
	@RequestMapping("/")
	public String ss(Model model,String username,String password)throws Exception{
		
		return "/jsp/test.jsp";
		
		
	}

}
