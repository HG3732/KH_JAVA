package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice5 {
	
	public void practice5() {
		
		String name, gender;
		int grade, classnumber, number;
		double score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요 : ");
		name = sc.nextLine();
		
		System.out.println("학년을 입력해주세요 : ");
		grade = sc.nextInt();
		
		System.out.println("반을 입력해주세요 : ");
		classnumber = sc.nextInt();
		
		System.out.println("번호를 입력해주세요 : ");
		number = sc.nextInt();
		
		System.out.println("성별을 입력해주세요(남성이라면 M, 여성은 F) : ");
		gender = sc.nextLine();
		
		String gender2 = (gender.equals("M")) ? "남학생" : "여학생" ;
		
		System.out.println("성적을 입력해주세요 : ");
		score = sc.nextDouble();
		
		// java.util.IllegalFormatConversionException: d != java.lang.String
		
		System.out.println(grade + "학년 " + classnumber + "반 " + number + "번 " + name + gender2 + "님의 점수는 " + score + "점 입니다.");
	
	}
}
