package com.kh_practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
public void method3 () {
		
		System.out.println("변수 실습문제 3 시작합니다.");
		System.out.println("가로 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		System.out.println("세로 값을 입력하세요 : ");
		double y = sc.nextDouble();
		
		System.out.println("면적 : " + (x * y));
		System.out.println("둘레 : " + (x + y)*2 );
		
		System.out.println("변수 실습문제 3 마칩니다.");
	}

}
