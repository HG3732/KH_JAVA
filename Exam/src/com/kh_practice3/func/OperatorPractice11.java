package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice11 {
	
	public void practice11() {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A사원 연봉 : ");
		a = sc.nextInt();
		System.out.println("B사원 연봉 : ");
		b = sc.nextInt();
		System.out.println("C사원 연봉 : ");
		c = sc.nextInt();
		
		String rich;
		
		System.out.println("A사원 연봉/연봉+a : " + a + " / " + a*1.4);
		rich = (a*1.4 > 3000) ? "3000 이상" : "3000 미만";
		System.out.println(rich);
		System.out.println("B사원 연봉/연봉+a : " + b + " / " + b);
		rich = (b > 3000) ? "3000 이상" : "3000 미만";
		System.out.println(rich);
		System.out.println("C사원 연봉/연봉+a : " + c + " / " + c*1.15);
		rich = (c*1.15 > 3000) ? "3000 이상" : "3000 미만";
		System.out.println(rich);
	}
}
