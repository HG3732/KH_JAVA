package com.kh_practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public int x = 10;
	public int y = 5;
	public String fileName = "aaaa";
	
	public void method1 () {
		
		System.out.println("변수 실습문제 1 시작합니다.");
		System.out.println("이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.");
		System.out.print("이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		//Scanner sc2 = new Scanner(System.in); << 다시 생성하지 않는다. 안그러면 오류발생. 리소스 많이먹기때문
		String gender = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		String age = sc.next();
		
		System.out.print("키를 입력하세요(cm) : ");
		String height = sc.nextLine();
		
		System.out.println("키 " + height + "cm인 " + gender + "성 " + name + "님 반갑습니다.");
		
		
		System.out.println("변수 실습문제 1 마칩니다.");
	}
	
	public void method2 () {
		
		System.out.println("변수 실습문제 1 시작합니다.");
		System.out.println("이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.");
		System.out.print("이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		//Scanner sc2 = new Scanner(System.in); << 다시 생성하지 않는다. 안그러면 오류발생. 리소스 많이먹기때문
		String gender = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		Short age = sc.nextShort();
		
		System.out.print("키를 입력하세요(cm) : ");
		Double height = sc.nextDouble();
		
		System.out.println("키 " + height + "cm인 " + gender + "성 " + name + "님 반갑습니다.");
		
		
		System.out.println("변수 실습문제 1 마칩니다.");
	}
	
	
}
