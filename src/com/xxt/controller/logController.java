package com.xxt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用于登录，注销的Handler
 * @author 13983
 *
 */
@Controller
//添加url的根路径
@RequestMapping("/logs")
public class logController {
	
	@RequestMapping("/login")
	public String login(String username,String password)throws Exception{
		
		return null;
		
	}

}
