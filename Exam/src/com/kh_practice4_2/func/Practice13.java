package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice13 {

	public void practice13() {

		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("정수 입력 : ");
		x = sc.nextInt();
		
		for(int i = 1; i < (x+1); i++) {
			for(int j = 0; j<i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}	
}
