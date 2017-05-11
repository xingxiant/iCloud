package com.xxt.mapper;

import java.util.List;

import com.xxt.po.FileCustom;
import com.xxt.po.FileQueryVo;

public interface FileMapperCustom {
	//添加文件
	public void insertFile(FileQueryVo fileQueryVo)throws Exception;
	//根据用户id查询file
	public List<FileCustom> findUserListByUserId(int id)throws Exception;
}
