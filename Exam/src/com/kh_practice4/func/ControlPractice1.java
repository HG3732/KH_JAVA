package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice1 {
	
	public void method1 () {
		
		int x;
		String menu;
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		switch (x) {
		case 1:
			menu = "입력";
			System.out.println(menu + "메뉴입니다.");
			break;
		case 2:
			menu = "수정";
			System.out.println(menu + "메뉴입니다.");
			break;
		case 3:
			menu = "조회";
			System.out.println(menu + "메뉴입니다.");
			break;
		case 4:
			menu = "삭제";
			System.out.println(menu + "메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("없는 번호입니다.");
			break;
		}
		
		
	}
}
