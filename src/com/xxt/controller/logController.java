package com.xxt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ���ڵ�¼��ע����Handler
 * @author 13983
 *
 */
@Controller
//���url�ĸ�·��
@RequestMapping("/logs")
public class logController {
	
	@RequestMapping("/login")
	public String login(String username,String password)throws Exception{
		
		return null;
		
	}

}
