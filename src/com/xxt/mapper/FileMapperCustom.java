package com.xxt.mapper;

import java.util.List;

import com.xxt.po.FileCustom;
import com.xxt.po.FileQueryVo;

public interface FileMapperCustom {
	//����ļ�
	public void insertFile(FileQueryVo fileQueryVo)throws Exception;
	//�����û�id��ѯfile
	public List<FileCustom> findUserListByUserId(int id)throws Exception;
}
