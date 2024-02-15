package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int x = sc.nextInt();
		sc.close();
		int[] arr = new int[x];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + "  ");
		}
		
		
	}
}
