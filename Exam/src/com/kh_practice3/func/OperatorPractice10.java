package com.kh_practice3.func;

import java.util.Scanner;

public class OperatorPractice10 {
	
	public void practice10() {
		
		int x, y, z;
		boolean same;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 1 : ");
		x = sc.nextInt();
		System.out.println("입력 2 : ");
		y = sc.nextInt();
		System.out.println("입력 3 : ");
		z = sc.nextInt();
		
		same = (x == y && y==z);
		System.out.println(same);
	}
}
