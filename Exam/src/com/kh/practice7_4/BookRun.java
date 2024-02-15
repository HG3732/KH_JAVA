package com.kh.practice7_4;

public class BookRun {

	public static void main(String[] args) {

		Book A = new Book();
		Book B = new Book("동화", "동아", "김씨");
		Book C = new Book("소설", "이북", "이씨", 15000, 0.15);
		
		A.information();
		B.information();
		C.information();
		
	}

}
