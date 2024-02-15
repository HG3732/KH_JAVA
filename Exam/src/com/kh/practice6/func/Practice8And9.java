package com.kh.practice6.func;

import java.util.Scanner;

public class Practice8And9 {

	public static void main(String[] args) {

		String[] student = new String[] { "1. 강건강", "2. 남나나", "3. 도대담", "4. 류라라", "5. 문미미", "6. 박보배", "7. 송성실",
				"8. 윤예의", "9. 진재주", "10. 차천축", "11. 피풍표", "12. 홍하하" };
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		int k = 0;

		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++, k++) {
				seat1[i][j] = student[k];
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++, k++) {
				seat2[i][j] = student[k];
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

		Scanner sc = new Scanner(System.in);
		String name;

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		name = sc.next();
		sc.nextLine();
		sc.close();
		System.out.println();
		sc.close();
	
	}
}
