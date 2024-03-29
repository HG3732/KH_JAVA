package com.kh.practice14_1.list.library.model.vo;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Book implements Comparable<Book> {

	private String title;
	private String author;
	private String category;
	private int price;

	public Book() {
	}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}

	public int hashCode() {
		return hashCode();
	}

	public boolean equals(Book book) {
		// TODO
		return true;
	}

	@Override
	public int compareTo(Book book) {
		return this.title.compareTo(book.title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
