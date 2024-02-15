package com.kh_practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void method1() {
		
		System.out.println("문자를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(str);
		
	}

}
