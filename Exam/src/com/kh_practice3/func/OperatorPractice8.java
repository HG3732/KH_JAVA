package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice8 {
	
	public void practice8() {
		
		String ID;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 13자리를 -를 넣어서 입력해주세요. :");
		ID = sc.next();
		
		String gender = ID.charAt(7)%2 == 0 ? "여성" : "남성";
		System.out.println(gender);
		
	}
}
