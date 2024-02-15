package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		String menu[] = new String[] {"후라이드", "양념", "파닭", "신호등"};
		
		System.out.print("치킨 메뉴 입력 : ");
		String chicken = sc.next();
		sc.close();
		for (int i = 0; i<menu.length; i++) {
			if (menu[i].equals(chicken)) {
				a++;
				break;
			}
		}
		if(a>0) {
			System.out.println(chicken + "치킨 배달 가능");
		}
		else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
		
		
	}
}
