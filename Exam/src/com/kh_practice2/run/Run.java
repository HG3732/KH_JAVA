package com.kh_practice2.run;

import com.kh_practice2.func.CastingPractice1;
import com.kh_practice2.func.CastingPractice2;
import com.kh_practice2.func.CastingPractice3;

public class Run {

	public static void main(String[] args) {

		System.out.println("형변환 실습문제 시작합니다.");
		
		System.out.println("문제 1");
		CastingPractice1 c1 = new CastingPractice1();
		c1.method1();
		
		System.out.println("문제 2");
		CastingPractice2 c2 = new CastingPractice2();
		c2.method2();
		
		System.out.println("문제 3");
		CastingPractice3 c3 = new CastingPractice3();
		c3.method3();
		
		
		
	}

}
