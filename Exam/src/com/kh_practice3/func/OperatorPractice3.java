package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice3() {
		
		int x;
	
		System.out.println("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
	
		String number = (x%2 == 1) ? "홀수" : "짝수";
		System.out.println(number + "다.");
	
	}
}
