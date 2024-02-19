package com.kh.practice6.func;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice8And9 {

	public static void main(String[] args) {

		List<String> studentList = Arrays.asList(new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실",
				"윤예의", "진재주", "차천축", "피풍표", "홍하하"});
		System.out.println(studentList);
		
		int rowCount = 3;
		int columnCount = 2;
		int bundanCount = 1;
		int listIndex = 0;
		
xx:		while(true) {
			System.out.println("== "+(bundanCount++)+"분단 ==");	//(bundanCount++)
			System.out.println();
			for(int r = 0; r<rowCount; r++) {
				for(int c = 0; c<columnCount; c++) {
					if(listIndex >= studentList.size()) {
						break xx;
					}
					System.out.print(studentList.get(listIndex++) +"\t" );
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
				
		Scanner sc = new Scanner(System.in);
		String name;
		
		while(true) {
			System.out.print("검색할 학생 이름을 입력하세요 : ");
			name = sc.next();
			sc.nextLine();
		
			System.out.println();
		
			if(!studentList.contains(name)) {
				System.out.println("없는 학생의 이름입니다. 다시 입력해주세요.");
				} else { 
					sc.close();
					break;
					}
			}
		
		int bundansize = 6;
		int tablesize = 2;
		int seatNum = studentList.indexOf(name);
		String side = null;
		int sideNum = ((seatNum%bundansize)%tablesize);
		switch (sideNum) {
		case 0:
			side = "왼쪽";
			break;
		case 1:
			side = "오른쪽";
			break;
		default:
			break;
		}
		
		
		
		System.out.println(name + "학생은 " + (seatNum/bundansize+1) + "분단 " + ((seatNum%bundansize)/tablesize+1) + "번째 줄 " + side + "자리 입니다.");
		
		
		
	
	}

}
