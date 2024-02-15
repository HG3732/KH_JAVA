package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice11 {
	
	public void practice11() {
		
		int x;
		int y;

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하세요 : ");
		x = sc.nextInt();
		System.out.println();
		
		System.out.print("공차를 입력하세요 : ");
		y = sc.nextInt();
		System.out.println();
		
		
		
			for (int i = 0; i < 10; i++, x+=y) {
				System.out.println(x + " ");			
		}
	}
}
