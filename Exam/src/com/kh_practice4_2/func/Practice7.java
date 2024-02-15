package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice7 {
	
	public void practice7() {
		
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		x = sc.nextInt();
		System.out.println();
		
		if (x<1) {
			System.out.println("1 이상의 수를 입력해주세요.");
			}
		else break;
		}
		
		while(true) {
		System.out.print("두 번째 숫자를 입력하세요.");
		y = sc.nextInt();
		System.out.println();
		if (y<1 || x == y) {
			System.out.println("1 이상의 첫 번째 수와 다른 수를 입력해주세요.");
			}
		else break;
		}
		if(x<y) {
			for(; x<=y; x++) {
				System.out.print(x + " ");
			}
		}
		else if(x>y){
			for(; x>=y; y++) {
				System.out.print(y + " ");
			}	
		}
		
	}
}
