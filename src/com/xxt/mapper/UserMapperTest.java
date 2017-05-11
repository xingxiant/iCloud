package com.xxt.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxt.po.User;



public class UserMapperTest {
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
	public void test() {
		UserMapper UserMapper = (UserMapper) applicationContext.getBean("userMapper");
	
		User user=new User();
		user=UserMapper.selectByPrimaryKey(1);
		
		System.out.println(user.getUsername());
	
	}

}
