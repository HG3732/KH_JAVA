package com.kh_practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
public void method2 () {
		
		System.out.println("변수 실습문제 2 시작합니다.");
		System.out.print("첫 번째 정수 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		System.out.println("나누기 : " + (num1 / num2));
		
		System.out.println("변수 실습문제 2 마칩니다.");
	}

}
