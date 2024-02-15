package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice2 {

	public void method2() {

		int x;

		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();

		if (x < 0) {
			System.out.println("양수만 입력해주세요.");
		} 
		else if (x % 2 == 1) {
			System.out.println("홀수입니다.");
		} 
		else {
			System.out.println("짝수입니다.");
		}
	}
}
