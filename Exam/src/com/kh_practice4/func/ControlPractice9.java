package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice9 {
	
	public void method9 () {
		
		Scanner sc = new Scanner(System.in);
		int midscore;
		int lastscore;
		int workscore;
		int join;
		
		do {
		System.out.print("중간 고사 점수 : ");
		midscore = sc.nextInt();
		System.out.println();
		} while(midscore > 100 || midscore <0);
		
		do {
		System.out.print("기말 고사 점수 : ");
		lastscore = sc.nextInt();
		System.out.println();
		} while(lastscore > 100 || lastscore <0);
		
		do {
		System.out.print("과제 점수 : ");
		workscore = sc.nextInt();
		System.out.println();
		} while(workscore > 100 || workscore <0);
		
		do {
		System.out.print("출석 횟수 : ");
		join = sc.nextInt();
		System.out.println();
		} while(join > 20 || join <0);
		
		double total = midscore*0.2 +lastscore*0.3 + workscore*0.3 + join;
		
		System.out.println("========== 결과 ==========");
		System.out.println("중간 고사 점수(20) : " + midscore*0.2);
		System.out.println("기말 고사 점수(30) : " + lastscore*0.3);
		System.out.println("과제 점수(20) : " + workscore*0.2);
		System.out.println("출석 점수(20) : " + join);
		System.out.println("총점 : " + total);
		if(join/20 <= 0.7) {
			System.out.println("Fail [출석 횟수 부족(" + join + "/20)]");
			}
		else {
			if(total >= 70) {
				System.out.println("Pass");
				}
			else {
				System.out.println("Fail [점수 미달]");
				}
		}	
	}
		
}

