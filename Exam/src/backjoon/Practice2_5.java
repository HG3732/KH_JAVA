package backjoon;

import java.util.Scanner;

public class Practice2_5 {
	
	public static void main(String[] args) {
		int H, M;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		H = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		if(H>23) H %=24;
		if(M>59) M %=60;
		
		if(M<45) {
			H--;
			if(H < 1) H = 23;
			M += 15;
		} else {
			M -= 45;
		}
		
		sc.close();
		System.out.println(H + " " + M);
	}
}
