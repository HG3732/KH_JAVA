package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice6 {
	
	public void practice6() {
		
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		x = sc.nextInt();
		System.out.println();
		
		
		
		
		System.out.print("두 번째 숫자를 입력하세요.");
		y = sc.nextInt();
		System.out.println();
		
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
		else {
		}
		
	}
}
