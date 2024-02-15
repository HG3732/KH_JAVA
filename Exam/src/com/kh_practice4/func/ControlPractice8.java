package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice8 {
	
	public void method8 () {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		String z;
		
		do {System.out.println("피연산자1 입력(음수X) : ");
		x = sc.nextInt();
		} while (x<0);
		
		do {System.out.println("피연산자2 입력(음수X) : ");
		y = sc.nextInt();
		} while (y<0);
		
		System.out.println("연산기호 입력 : ");
		z = sc.next();
		
		switch (z) {
		case "+":
			System.out.println(x + "+" + y + "=" + (x+y));
			break;
		case "-":
			System.out.println(x + "-" + y + "=" + (x-y));
			break;
		case "*":
			System.out.println(x + "*" + y + "=" + (x*y));
			break;
		case "/":
			System.out.println(x + "/" + y + "=" + (x/y));
			break;
		case "%":
			System.out.println(x + "%" + y + "=" + (x%y));
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			break;
		}
	}
		
}

