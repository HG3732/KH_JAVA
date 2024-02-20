package com.kh.practice6.func;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] graph = new String[5][5];
		
		System.out.print("행 인덱스 입력 : ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.print("열 인덱스 입력 : ");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		
		for(int i = 0; i<graph.length; i++) {
			for(int j = 0; j<graph[i].length;j++) {
				if(i==0 && j==0) {
					graph[i][j] = " ";
				} else if (i != 0 && j == 0) {
					graph[i][j] = String.valueOf(i);
				} else if (i == 0 && j != 0) {
					graph[i][j] = String.valueOf(j);
				}
				else graph[i][j] = " ";
				if(i==x && j == y) {
					graph[i][j] = "x";
				}
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
