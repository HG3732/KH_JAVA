package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice4 {
	
	public void practice4() {
		boolean exit = true;
		int x;
		Scanner sc = new Scanner(System.in);
		
		while(exit) {
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		x = sc.nextInt();
		
		if (x<1) {
			System.out.println("1 이상의 수를 입력해주세요.");
			}
		else {
			for(int i = 0; i < x; i++) {
				System.out.print((x-i) + " ");
				}
			exit = false;
			}
		}
	}
}
