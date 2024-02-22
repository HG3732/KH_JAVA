package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice18 {

	public void practice18() {

		Scanner sc = new Scanner(System.in);
		int pNum;
		
		int divideCount = 0;
		
		while(true) {
			System.out.print("1 이상의 정수 입력 : ");
			pNum = sc.nextInt();
			sc.nextLine();
			System.out.println();
			if(pNum<1) {
				System.out.println("1 이상의 정수를 입력해주세요.");
			} else break;
		}
		
		sc.close();
		
			
			for(int i = 1; i <= pNum; i++) {
					if(i%6 == 0) {	
						divideCount++;}	//2와 3의 공배수인 6의 배수 따로 카운트
						if(i%2==0 || i%3==0) {		
							System.out.print(i + " ");
							}
					}
			System.out.println();
			System.out.println("count : " + divideCount);
				
			
	}	
}
