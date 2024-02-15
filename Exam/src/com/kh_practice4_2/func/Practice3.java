package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice3 {
	
	public void practice3() {

		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		x = sc.nextInt();
		
		if (x<1) {
			System.out.println("1 이상의 수를 입력해주세요.");
			}
		else {
			for(int i = 0; i < x; i++) {
				System.out.print((x-i) + " ");
				}
			
			}
	}
}
