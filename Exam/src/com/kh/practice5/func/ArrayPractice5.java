package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어를 입력하세요 : ");
		String x = sc.next();
		
		char [] str = new char[x.length()];
		
		for(int i = 0; i<str.length; i++) {
			
			str[i] = x.charAt(i);
			System.out.print(str[i] + "  ");
		}
		
		System.out.println("찾을 문자를 입력하세요 : ");
		String y = sc.next();
		char z = Character.valueOf(y.charAt(0));
		
		int k = 0;
		System.out.print(z + "가 존재하는 위치(인덱스) : ");
		for(int j = 0; j<str.length; j++) {
			
			if(z == (str[j])) {
				k++;
				System.out.print(j);
			}
			
		}
		sc.close();
		System.out.println();
		System.out.println(y + "의 갯수 : " + k);
		
		
	}
}
