package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice7 {
	
	public void method7 () {
		
		Scanner sc = new Scanner(System.in);
		double weight;
		double height;
		double BMI;
		
		System.out.println("키를 입력하세요 : ");
		height = sc.nextDouble();

		System.out.println("몸무게를 입력하세요 : ");
		weight = sc.nextDouble();
		
		BMI = weight/(height*height*0.0001);
		
		System.out.println("BMI : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}
		else if(18.5 <= BMI && BMI < 23) {
			System.out.println("정상 체중");
		} 
		else if(23 <= BMI && BMI < 25) {
			System.out.println("과체중");
		}
		else if(25 <= BMI && BMI < 30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도비만");
		}
		
	}
		
}

