package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice4 {
	
	public void practice4() {
		
		int man, candy;
	
		System.out.println("머릿수 입력 : ");
		Scanner sc = new Scanner(System.in);
		man = sc.nextInt();
		
		System.out.println("사탕갯수 입력 : ");
		candy = sc.nextInt();
		
		System.out.println("인원수 : " + man);
		System.out.println("사탕갯수 : " + candy);
		System.out.println("1인당 사탕갯수 : " + candy/man);
		System.out.println("남는 사탕갯수 : " + candy%man);
	
	}
}
