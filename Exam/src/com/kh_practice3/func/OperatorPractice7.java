package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice7 {
	
	public void practice7() {
		
		int kor, eng, math, total;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("점수는 올바른 범위(0~100)로 입력해주세요.");
			System.out.println("국어 점수 : ");
			kor = sc.nextInt(); 
		} while (kor < 0 || kor > 100);
		
		do {System.out.println("점수는 올바른 범위(0~100)로 입력해주세요.");
			System.out.println("영어 점수 : ");
			eng = sc.nextInt();
		} while (eng < 0 || kor > 100);
		
		do {
			System.out.println("점수는 올바른 범위(0~100)로 입력해주세요.");
			System.out.println("수학 점수 : ");
			math = sc.nextInt();
		} while (kor < 0 || kor > 100);
		
		total = kor + eng + math;
		avg = total/3;
		int test1 = avg > 60 ? 1 : 0;
		int test2 = (kor > 40 && eng > 40 && math > 40) ? 1 : 0;
		String test3 = (test1 + test2 == 2) ? "합격" : "불합격" ;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println(test3);
	
	}
}
