package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice8 {
	
	public void practice8() {
		
		int dan;

		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("2 이상의 숫자를 입력하세요 : ");
		dan = sc.nextInt();
		System.out.println();
		
		if (dan<2) {
			System.out.println("2 이상의 수를 입력해주세요.");
			}
		else break;
		}
		
		for (int i = 1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		
		
		
	}
}
