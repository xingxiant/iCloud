package com.xxt.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xxt.po.FileCustom;
import com.xxt.po.FileQueryVo;
import com.xxt.service.FileService;
import com.xxt.service.UserService;
import com.xxt.utils.PageBean;

/**
 * �ļ�����Handler
 * @author 13983
 *
 */
@Controller
//���url�ĸ�·��
@RequestMapping("/fileAction")
public class FileController {
	@Autowired
	private FileService fileService;
	@RequestMapping("/upload")
	public String upload(MultipartFile file,int userId)throws Exception{
		
		FileCustom fileCustom=new FileCustom();
		//ԭʼ����
		String originalFilename = file.getOriginalFilename();
		//�ϴ�ͼƬ
		if(file!=null && originalFilename!=null && originalFilename.length()>0){

			//�洢ͼƬ������·��
			String file_path = "F:\\server_file\\";


			//�µ�ͼƬ����
			String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + originalFilename;
			//��ͼƬ
			File newFile = new File(file_path+newFileName);

			//���ڴ��е�����д�����
			file.transferTo(newFile);

			//����ͼƬ����д��itemsCustom��
			fileCustom.setFilename(newFileName);
			fileCustom.setCreatetime(new Date());
			fileCustom.setCanshare(1);
			fileCustom.setFilesize(String.valueOf(file.getSize()) );
			fileCustom.setUser(userId);
			FileQueryVo fileQueryVo=new FileQueryVo();
			fileQueryVo.setFileCustom(fileCustom);
			fileService.addFile(fileQueryVo);
			return "redirect:queryAll.action?currentPage=1";
		}else{
			return "/user/error.jsp";
		}

	}
	@RequestMapping("/queryAll")
	public String queryAll(Model model,int currentPage,HttpServletRequest request)throws Exception{
		int user_id=(int) request.getSession().getAttribute("user_id");
		PageBean<FileCustom> page=new PageBean<FileCustom>();
		page.setCurrentPage(currentPage);
		page=fileService.getPageBean(user_id,currentPage);
		
		model.addAttribute("pageBean", page);
		return "/user/right.jsp";
		
		
	}
	@RequestMapping("/queryFile")
	public String queryFile(Model model,int currentPage,HttpServletRequest request)throws Exception{
		int user_id=(int) request.getSession().getAttribute("user_id");
		PageBean<FileCustom> page=new PageBean<FileCustom>();
		page.setCurrentPage(currentPage);
		page=fileService.getPageBean(user_id,currentPage);
		
		model.addAttribute("pageBean", page);
		return "/user/myFile.jsp";
		
		
	}
	@RequestMapping("/findFileByName")
	public String findFileByName(Model model,String name,HttpServletRequest request)throws Exception{
		return name;
		
		
	}
	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(@RequestParam("filename") String filename,Model model,HttpServletRequest request)throws Exception{
		
		//�����ļ�·��
        String path = "F:\\server_file\\";
        filename=new String(filename.getBytes("iso-8859-1"),"UTF-8");
        System.out.println(filename);
        File file = new File(path+filename);
        
        HttpHeaders headers = new HttpHeaders();  
        //������ʾ���ļ������������������������  
        
        //֪ͨ�������attachment�����ط�ʽ����ͼƬ
        headers.setContentDispositionFormData("attachment", filename); 
        //application/octet-stream �� �����������ݣ�������ļ����أ���
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                headers, HttpStatus.CREATED); 
        
		
		
		
	}
}
