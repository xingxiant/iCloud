package com.xxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xxt.mapper.FileMapperCustom;
import com.xxt.po.FileCustom;
import com.xxt.po.FileQueryVo;
import com.xxt.service.FileService;
import com.xxt.utils.PageBean;

public class FileServiceImpl implements FileService {
	@Autowired
	private FileMapperCustom fileMapperCustom;
	@Override
	public void addFile(FileQueryVo fileQueryVo) throws Exception {
		fileMapperCustom.insertFile(fileQueryVo);

	}
	@Override
	public PageBean getPageBean(int userId,int currentPage) throws Exception {
		//����page����
		PageBean<FileCustom> page=new PageBean<FileCustom>() ;
		//��ǰҳ����СΪ1
		if(currentPage<=0){
			currentPage=1;
		}
		
		List<FileCustom> list=fileMapperCustom.findUserListByUserId(userId);
		
		
		
		
		//��װpage����
		page.setTotalCount(list.size());
		int totalPage=page.getTotalPage();
		//��ǰҳ�����Ϊpage.getTotalPage
		if(currentPage>=page.getTotalPage()){
			currentPage=page.getTotalPage();
		}
		page.setCurrentPage(currentPage);
		if(currentPage<totalPage){
			int fromIndex=(currentPage-1)*page.getPageCount();
			if(fromIndex<0){
				fromIndex=0;
			}
			page.setPageData(list.subList(fromIndex, (currentPage)*page.getPageCount()));
		}else{
			int fromIndex=(currentPage-1)*page.getPageCount();
			if(fromIndex<0){
				fromIndex=0;
			}
			page.setPageData(list.subList(fromIndex, list.size()));
		}
		
	
		
		
		
		return page;
	}
	

}
