package com.kh_practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void method2() {
		
		System.out.println("국어의 점수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		
		System.out.println("수학의 점수를 입력해주세요 : ");
		int math = sc.nextInt();
		
		System.out.println("영어의 점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double avg = total/3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
	}

}
