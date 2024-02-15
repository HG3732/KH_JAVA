package com.kh.practice7_4;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	protected Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void information() {
		System.out.println("제목 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
		System.out.println("할인율 : " + discountRate);
	}

}
