package com.xxt.mapper;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxt.po.FileCustom;
import com.xxt.po.FileQueryVo;

public class FileMapperCustomTest {
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
		
		//List<FileCustom> list=FileMapper.findFileList(null);
		FileQueryVo fileQueryVo=new FileQueryVo();
		FileCustom fileCustom =new FileCustom();
		FileCustom fileCustom1 =new FileCustom();
		fileCustom.setUser(1);
		fileCustom.setCreatetime(new Date());
		fileCustom.setFilename("нд╪Ч1");
		fileCustom.setCanshare(1);
		fileCustom.setFilesize("12mb");
		fileQueryVo.setFileCustom(fileCustom);
		
		fileMapperCustom.insertFile(fileQueryVo);
		 
		
	}

}
