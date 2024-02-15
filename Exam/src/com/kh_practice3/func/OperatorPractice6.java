package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice6 {
	
	public void practice6() {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		String person = age > 19 ? "성인" : (age > 13 ? "청소년" : "어린이");
		
		System.out.println("나이는 " + age + "살로, " + person + "입니다.");
	
	}
}
