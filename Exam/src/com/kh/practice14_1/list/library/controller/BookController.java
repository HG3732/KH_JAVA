package com.kh.practice14_1.list.library.controller;

import java.util.ArrayList;
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
		int x = list.indexOf(keyword);
		do {System.out.println();
		return ;
	}
	
	public Book deleteBook(String title, String author) {
		
		
	}
	
	public int ascBook() {
		return ;
	}

}