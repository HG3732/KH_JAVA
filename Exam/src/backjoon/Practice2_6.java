package backjoon;

import java.util.Scanner;

public class Practice2_6 {

	public static void main(String[] args) {
		
		int h, m, cm;
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		h = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		cm = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		
		h += (m+cm)/60;
		int m2 = (m+cm)%60;
		
		if(h>23) {
			h = h%24;
		}
		System.out.println(h + " " + m2);
		
		
	}

}
