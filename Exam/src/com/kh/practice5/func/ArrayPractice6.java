package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char day[] = {'월', '화', '수', '목', '금', '토', '일'};
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int x = sc.nextInt();
		System.out.println();
		sc.close();
		if(x >= 0 || x < 7) {
		System.out.println(day[x]+"요일");
			}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
