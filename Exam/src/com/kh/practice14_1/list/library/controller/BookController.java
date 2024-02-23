package com.kh.practice14_1.list.library.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.kh.practice14_1.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> list = new ArrayList<Book>();
	
	public BookController () {}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public List selectList() {
		return list;
	}
	
	public ArrayList<Book> serchBook(String keyword){
		ArrayList<Book> bList = new ArrayList<Book>();
			for(int i = 0; i<list.size(); i++) {
				bList.add(list.get(x));
				
			}
		//TODO
		return  bList;
	}
	
	public Book deleteBook(String title, String author) {
		int dbNum;
		Book result;
		if(list.contains(title)) {
			dbNum = list.indexOf(title);
		} else if(list.contains(author)) {
			dbNum = list.indexOf(author);
		} else return null;
		
		result = list.remove(dbNum);

		return result;
	}
	
	public int ascBook(Book book) {
		return book.compareTo(book);
	}

}
