package com.xxt.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxt.po.FileCustom;

public class FileMapperCustomTestTest {
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
		FileMapperCustom fileMapperCustom = (FileMapperCustom) applicationContext.getBean("fileMapperCustom");
		List<FileCustom> list=fileMapperCustom.findUserListByUserId(2);
		for(FileCustom file:list){
			System.out.println(file.getFilename());
		}
	}

}
