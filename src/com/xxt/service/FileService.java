package com.xxt.service;

import java.util.List;

import com.xxt.po.FileCustom;
import com.xxt.po.FileQueryVo;
import com.xxt.utils.PageBean;

/**
 * file��service
 * @author 13983
 *
 */
public interface FileService {
	public void addFile(FileQueryVo fileQueryVo)throws Exception;
	//���pageBean,����userId�͵�ǰҳ��
	public PageBean getPageBean(int userId,int currentPage)throws Exception;
}
