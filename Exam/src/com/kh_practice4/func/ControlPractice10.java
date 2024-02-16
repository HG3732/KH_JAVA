package com.kh_practice4.func;

import java.util.Scanner;

import com.kh_practice4.func.ControlPractice1;
import com.kh_practice4.func.ControlPractice2;
import com.kh_practice4.func.ControlPractice3;
import com.kh_practice4.func.ControlPractice4;
import com.kh_practice4.func.ControlPractice5;
import com.kh_practice4.func.ControlPractice6;
import com.kh_practice4.func.ControlPractice7;
import com.kh_practice4.func.ControlPractice8;
import com.kh_practice4.func.ControlPractice9;
import com.kh_practice4.func.ControlPractice11;

public class ControlPractice10 {

	public void practice10() {

		int num;
			Scanner sc = new Scanner(System.in);
	
			System.out.println("실행할 문제를 입력하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. P/F");
			System.out.println("10. PW");
			System.out.print("선택 : ");
			num = sc.nextInt();

		switch (num) {
			case 1:
				System.out.println("실습문제 4-1");
				ControlPractice1 c1 = new ControlPractice1();
				c1.method1();
				break;
			case 2:
				System.out.println("실습문제 4-2");
				ControlPractice2 c2 = new ControlPractice2();
				c2.method2();
				break;
			case 3:
				System.out.println("실습문제 4-3");
				ControlPractice3 c3 = new ControlPractice3();
				c3.method3();
				break;
			case 4:
				System.out.println("실습문제 4-4");
				ControlPractice4 c4 = new ControlPractice4();
				c4.method4();
				break;
			case 5:
				System.out.println("실습문제 4-5");
				ControlPractice5 c5 = new ControlPractice5();
				c5.method5();
				break;
			case 6:
				System.out.println("실습문제 4-6");
				ControlPractice6 c6 = new ControlPractice6();
				c6.method6();
				break;
			case 7:
				System.out.println("실습문제 4-7");
				ControlPractice7 c7 = new ControlPractice7();
				c7.method7();
				break;
			case 8:
				System.out.println("실습문제 4-8");
				ControlPractice8 c8 = new ControlPractice8();
				c8.method8();
				break;
			case 9:
				System.out.println("실습문제 4-9");
				ControlPractice9 c9 = new ControlPractice9();
				c9.method9();
				break;
			case 10:
				System.out.println("실습문제 4-10(hard)");
				ControlPractice11 c10 = new ControlPractice11();
				c10.method11();
				break;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
		}

	}
}
