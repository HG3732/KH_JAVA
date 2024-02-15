package com.kh.practice7_3;

import java.util.Arrays;
import java.util.Random;

public class Lotto2 {

	private int[] lotto;
	
	{			//이게 초기화 블럭
		lotto = new int[6];
		for(int i = 0; i<lotto.length; i++) {
		//	Random rd = new Random();
		//	lotto[i] = rd.nextInt(45); //Math.random(); -> 0<= ? <1;
			lotto[i] = new Random().nextInt(45);	//위 두 줄을 한 줄로 축약한 것
			
		}
	}
	
	public Lotto2() {}
	
	
	
}
