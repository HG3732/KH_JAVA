package com.kh_practice4_2.func;

import java.util.Scanner;

public class Practice17 {

	public void practice17() {

		Scanner sc = new Scanner(System.in);
		int pNum;
		
		int pNumCount = 1;	//2 때문에 0부터 시작하지 않고 1부터 시작
		
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
		
		System.out.print("2 ");
		
		if(pNum == 2) {
			System.out.println();
			System.out.println("2까지 소수의 갯수는 1개 입니다.");
		} else {
			
			for(int i = 3; i <= pNum; i++) {
				int divideCount = 0;
				for(int j = 2; j < i; j++) {
					if(i%j == 0) {
						break;		//소수가 아니므로 break
					} else {
						divideCount++;}
						if(divideCount == (i-2)) {		//1과 자기자신을 제외해야하므로 -2
							System.out.print(i + " ");
							pNumCount++;
							}
					} 
				}
			System.out.println();
			System.out.println("2부터 " + pNum + "까지의 소수의 갯수는 " + pNumCount + "개 입니다.");
		}
	}	
}
