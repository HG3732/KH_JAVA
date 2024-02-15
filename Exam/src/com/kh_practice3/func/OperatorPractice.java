package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		int x;
	
		System.out.println("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
	
		if (x > 0) {
			System.out.println("양수.");
		}
		else {
			System.out.println("양수가 아님.");
		}
	
	}
}
