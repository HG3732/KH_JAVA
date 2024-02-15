package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice12 {

	public void practice12() {

		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		String z;
		boolean exit = true;

		while (exit) {
			while (true) {
				System.out.print("정수1 :");
				x = sc.nextInt();
				System.out.println();

				System.out.print("정수2 :");
				y = sc.nextInt();
				System.out.println();

				System.out.print("연산자(+, -, *, /, %) : ");
				z = sc.next();
				System.out.println();
				
				if (y == 0 && (z.equals("/") || z.equals("%"))) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else break;
			}
			
				switch (z) {
				case "+":
					System.out.println(x + " + " + y + " = " + (x + y));
					break;
				case "-":
					System.out.println(x + " - " + y + " = " + (x - y));
					break;
				case "*":
					System.out.println(x + " * " + y + " = " + (x * y));
					break;
				case "/":
					System.out.println(x + " / " + y + " = " + (x / y));
					break;
				case "%":
					System.out.println(x + " % " + y + " = " + (x % y));
					break;
				case "exit":
					System.out.println("프로그램을 종료합니다.");
					exit = false;
					break;
				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
					break;
				}
			
			if(z == "+" || z == "-" || z == "*" || z == "/" || z == "%")
			break;
		}
	}	
}
