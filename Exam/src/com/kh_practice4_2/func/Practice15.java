package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice15 {

	public void practice15() {

		Scanner sc = new Scanner(System.in);
		int pNum;
		int divideCount = 0;
		
		while(true) {
			System.out.print("2 이상의 정수 입력 : ");
			pNum = sc.nextInt();
			sc.nextLine();
			System.out.println();
			if(pNum<2) {
				System.out.println("2 이상의 정수를 입력해주세요.");
			} else break;
		}
		
		sc.close();
		
		for(int i = 2; i < pNum; i++) {
			if(pNum%i == 0) {
				System.out.println("소수가 아닙니다.");
				break;
			} else divideCount++;
		}
		
		if (divideCount == (pNum-2)) 
			System.out.println("소수입니다.");
		
	}	
}
