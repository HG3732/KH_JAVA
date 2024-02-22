package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice21 {

	public void practice21() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 정수 입력 : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for(int i = 1; i<=x*2; i+=2) {
			for(int k = x*2; k>i; k-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			
	}	
}
