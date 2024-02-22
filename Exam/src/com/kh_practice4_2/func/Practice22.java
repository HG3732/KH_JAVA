package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice22 {

	public void practice22() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 정수 입력 : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		
		for(int i = 1; i<=x; i++) {
			if(i == 1 || i == x) {
				int j = 1;
			while(j <= x) {
				System.out.print("*");
				j++;
				}
			}
			
			else {
				System.out.print("*");
				for(int k = 1; k < x-1; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
			
	}	
}
