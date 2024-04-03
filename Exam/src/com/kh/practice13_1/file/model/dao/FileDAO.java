package com.kh.practice13_1.file.model.dao;

import java.io.*;

public class FileDAO {

	
	
	public boolean checkName(String file) {
		File realFile = new File("./IOPractice/" + file);		
		return realFile.exists();
	}
	
	public void fileSave(String file, String s) {
		File newFile = new File("./IOPractice/" + file);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(newFile, false));
			bw.write(s);
			newFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {bw.flush();}
				 bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public StringBuilder fileOpen(String file) {
		File newFile = new File("./IOPractice/" + file);
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(newFile));
			String line = null;
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		File newFile = new File("./IOPractice/" + file);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(newFile, true));
			bw.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
