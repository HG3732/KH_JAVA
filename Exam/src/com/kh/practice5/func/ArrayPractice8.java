package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;

		while (true) {
			System.out.println("3 이상의 홀수 : ");
			i = sc.nextInt();
			if (i % 2 == 0 || i < 3) {
				System.out.println("3 이상의 홀수를 입력해주세요.");
			} else
				break;
		}
		sc.close();
		int[] x = new int[i];
		int l = i / 2;

		for (int j = 0; j < (x.length / 2) + 1; j++) {
			x[j] = j + 1;
		}

		for (int k = (i / 2); k < x.length; k++, l--) {
			x[k] = l + 1;
		}
		System.out.println();
		for (int y = 0; y < x.length; y++) {
			System.out.print(x[y] + " ");
		}

	}
}
