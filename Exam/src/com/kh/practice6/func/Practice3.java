package com.kh.practice6.func;

public class Practice3 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for ( int j = 0; j<arr[i].length; j++) {
				arr[i][j] = 16 - (arr[i].length*i + j);
				System.out.print(" " + arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
