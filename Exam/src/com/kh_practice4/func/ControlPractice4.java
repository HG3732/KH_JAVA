package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice4 {
	
	public void method4 () {
		
		int month;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력해주세요 : ");
		month = sc.nextInt();
		
		switch (month) {
		case 12: case 1: case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println("잘못된 달 입니다.");
			break;
		}
	}
}
