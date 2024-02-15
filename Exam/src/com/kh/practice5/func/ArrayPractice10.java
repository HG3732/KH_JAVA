package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String ID = sc.next();
		System.out.println();
		sc.close();
		char[] ID2 = new char[14];
		for(int i = 0; i<ID2.length; i++) {
			ID2[i] = ID.charAt(i);
		}
		
		
		int x = 8;
		while(x<ID2.length) {
			ID2[x] = '*';
			x++;
		}
		
		for(int i = 0; i<ID2.length; i++) {
			System.out.print(ID2[i]);			
		}
		
		
	}
}
