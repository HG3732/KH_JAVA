package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice5 {
	
	public void practice5() {
		boolean exit = true;
		int x;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		while(exit) {
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		x = sc.nextInt();
		
		if (x<1) {
			System.out.println("1 이상의 수를 입력해주세요.");
			}
		else {
			for(int i = 1; i < (x+1); i++) {
				if(i != (x)) { 
					System.out.print(i + " + ");
					total += i;
					}
				else if(i == (x)) {
					System.out.print(i);
					total += i;
					}
				}
			System.out.print(" = " + total);
			exit = false;
			}
		}
	}
}
