package com.kh.practice6.func;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int k = 0;
		
		System.out.print("행 : ");
		x = sc.nextInt();
		sc.nextLine();
		char[][] arr = new char[x][];
		
		for(int i = 0; i<x; i++) {
			System.out.print(i + "행의 열 크기 : ");
			y = sc.nextInt();
			sc.nextLine();
			arr[i] = new char[y];
			System.out.println();
		}
		sc.close();
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++, k++) {
				arr[i][j] = (char)(65 + k);
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
