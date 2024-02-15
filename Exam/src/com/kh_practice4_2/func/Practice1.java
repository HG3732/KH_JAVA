package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice1 {
	
	public void practice1() {
		int x;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		x = sc.nextInt();
		
		if (x<1) {
			System.out.println("1 이상의 수를 입력해주세요.");
			}
		else {
			for(int i = 1; i < (x+1); i++) {
				System.out.print(i + " ");
				}
			
			}
		
	}
}
