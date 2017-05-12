package com.xxt.mapper;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxt.po.UserCustom;
import com.xxt.po.UserQueryVo;

public class UserMapperCustomTest {
	private ApplicationContext applicationContext;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		applicationContext = 
				new ClassPathXmlApplicationContext("classpath:config/applicationContext-dao.xml");
	}

	@Test
	public void test() throws Exception {
		UserMapperCustom userMapperCustom = (UserMapperCustom) applicationContext.getBean("userMapperCustom");
		
		//List<UserCustom> list=UserMapper.findUserList(null);
		UserQueryVo userQueryVo=new UserQueryVo();
		UserCustom userCustom =new UserCustom();
		UserCustom userCustom1 =new UserCustom();
		userCustom.setUsername("ÕÅÈý1");
		userCustom.setPassword("123456");
		userQueryVo.setUserCustom(userCustom);
		
		userCustom1=userMapperCustom.findUserById(1);
		 
		System.out.println(userCustom1.getUsername());
		
	}

}
