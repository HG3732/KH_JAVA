package com.kh_practice4.func;

import java.util.Scanner;
import java.util.stream.Stream;

public class ControlPractice11 {

	public void method11() {

		Scanner sc = new Scanner(System.in);
		int pw;
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		pw = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		sc.close();
			
		if(pw<1000 || pw>9999) {
			System.out.println("자릿수 안맞음");
		}
		
		int [] pwdigit = Stream.of(String.valueOf(pw).split("")).mapToInt(Integer::parseInt).toArray();
		
		for(int i = 1; i<pwdigit.length; i++) {
			for(int j = 0; j<i; j++) {
				if(pwdigit[i] == pwdigit[j]) {
					System.out.println("중복 값 있음");
					break;
				}
			}
		}

	}
}
