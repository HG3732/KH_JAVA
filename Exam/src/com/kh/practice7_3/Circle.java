package com.kh.practice7_3;

import java.util.Scanner;

public class Circle {

	private static final double PI = 3.14; //static, final이 둘 다 있으면 명시적 초기화 해줘야함 생성자 초기홥 부라ㅓㅣ 브 
	private static int radius = 1;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		System.out.println("추가 길이 입력 : ");
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		radius += x;
	}
	
	public void getAreaOfCircle() {
		System.out.println("넓이 : " + PI*radius*radius);
	}
	
	public void getSizeOfCircle() {
		System.out.println("둘레 : " + PI*radius*2);
	}
}
