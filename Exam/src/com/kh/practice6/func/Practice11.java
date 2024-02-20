package com.kh.practice6.func;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] graph = new String[5][5];

		int x, y;

		while (true) {
			System.out.print("행 인덱스 입력 : ");
			x = sc.nextInt();
			sc.nextLine();
			System.out.println();

			if (x == 99) {
				System.out.println("시스템 종료");
				break;
			}

			System.out.print("열 인덱스 입력 : ");
			y = sc.nextInt();
			sc.nextLine();
			System.out.println();

			graph[x][y] = "x";

			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph[i].length; j++) {
					if (graph[i][j] != "x") {
						if (i == 0 && j == 0) {
							graph[i][j] = " ";
						} else if (i != 0 && j == 0) {
							graph[i][j] = String.valueOf(i);
						} else if (i == 0 && j != 0) {
							graph[i][j] = String.valueOf(j);
						} else
							graph[i][j] = " ";
						if (i == x && j == y) {
							graph[x][y] = "x";
						}
					}
					System.out.print(graph[i][j] + " ");
				}
				System.out.println();
			}

		}
		sc.close();
	}
}
