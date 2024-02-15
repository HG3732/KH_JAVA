package com.kh.practice7_3;

import java.util.Arrays;

public class Lotto {

	private int[] lotto = new int[6];
	
	public Lotto() {}
	
	public void information() {
		while(true) {
			for(int i=0; i<6; i++) {
				lotto[i]=(int)(Math.random()*45+1);
			}
			
			Arrays.sort(lotto);
			
			if(checking_overlap(lotto)==true) {
				break;
			}
		}
		for(int j=0; j<6; j++) {
			System.out.print(lotto[j] + " ");
		}
	}
	
	static boolean checking_overlap(int []arr) {
		int[] check_arr = new int[45];
		for(int i=0; i<6; i++) {
			check_arr[arr[i]] +=1;
			if(check_arr[arr[i]]==2){
				return false;
			}
		}
		return true;
	}
	
}
