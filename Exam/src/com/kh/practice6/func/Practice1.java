package com.kh.practice6.func;

public class Practice1 {
	
	public static void main(String[] args) {
		
		String[][] str = new String[3][3];
		
		for(int i = 0; i<str.length; i++) {
			for(int j =0; j<str[i].length; j++) {
				str[i][j] = "(" + i + "," + j + ")";
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
		
	}

}
