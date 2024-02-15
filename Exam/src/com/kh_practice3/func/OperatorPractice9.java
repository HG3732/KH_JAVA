package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice9 {
	
	public void practice9() {
		
		int num1, num2, x;
		boolean z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		
		do {
		System.out.println("첫 번째 정수보다 더 큰 수를 입력하세요 : ");
		num2 = sc.nextInt();
		} while (num2 < num1);
		
		System.out.println("세 번째 정수를 입력하세요 : ");
		x = sc.nextInt();
		
		z = (x <= num1 || x > num2);
		System.out.println(z);
	}
}
