package com.kh.practice5.func;

public class ArrayPractice2 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int j = 10;
		for(int i = 0; i<10; i++, j--) {
			
				arr[i] = j;
					
			
			System.out.print(arr[i] + "  ");
		}
		
		
	}
}
