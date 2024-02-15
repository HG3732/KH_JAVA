package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice9 {

	public void practice9() {

		int dan;

		Scanner sc = new Scanner(System.in);

		System.out.print("2 이상, 9 이하의 숫자를 입력하세요 : ");
		dan = sc.nextInt();
		System.out.println();

		if (dan < 2 || dan > 9) {
			System.out.println("2 이상, 9 이하의 수를 입력해주세요.");
		} else {
			for (; dan < 10; dan++) {
				System.out.println("==== " + dan + "단 ====");
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + " * " + i + " = " + (dan * i));
				}
			}
		}
	}
}
