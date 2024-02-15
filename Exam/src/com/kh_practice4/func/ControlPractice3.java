package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice3 {

	public void method3 () {
		
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("올바른 숫자를 입력해주세요.");
			System.out.print("국어점수 : ");
			kor = sc.nextInt();
		} while (kor > 100 || kor < 0);
		
		
		do {
			System.out.println("올바른 숫자를 입력해주세요.");
			System.out.print("영어점수 : ");
			eng = sc.nextInt();
		} while (eng > 100 || eng < 0);
		
		do {
			System.out.println("올바른 숫자를 입력해주세요.");
			System.out.print("수학점수 : ");
			math = sc.nextInt();
		} while (math > 100 || math < 0);
		
		if ((kor <= 40) || (eng <= 40) || (math <= 40)) {
			System.out.println("불합격입니다.");
		}
		else if((kor + eng + math)/3 < 60) {
			System.out.println("합계 : " + (kor + eng + math));
			System.out.println("평균 : " + (kor + eng + math)/3);
			System.out.println("불합격입니다.");
		}
		else {
			System.out.println("합계 : " + (kor + eng + math));
			System.out.println("평균 : " + (kor + eng + math)/3);
			System.out.println("축하합니다, 합격입니다!");
		}
		
	}
}
