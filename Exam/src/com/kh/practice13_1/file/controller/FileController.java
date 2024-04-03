package com.kh.practice13_1.file.controller;

import com.kh.practice13_1.file.model.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {

		if(fd.checkName(file)) return true;
		else return false;
	}
	
	public void fileSave(String file, StringBuilder sb) {
		String sbString = sb.toString();
		fd.fileSave(file, sbString);
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String content = sb.toString();
		fd.fileEdit(file, content);
	}
	
}
