package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int i = sc.nextInt();
		int total = 0;
		
		int[] x = new int[i];
		
		for(int j = 0; j < x.length; j++) {
			System.out.println("배열 " + j + "번째 인덱스에 넣을 값 : ");
			int k = sc.nextInt();
			x[j] = k;
			total += k;
		}
		sc.close();
		for(int n = 0; n<x.length; n++) {
			System.out.print(x[n] + " ");
		}
		System.out.println();
		System.out.println("총합 : " + total);
		
		
		
	}
}
