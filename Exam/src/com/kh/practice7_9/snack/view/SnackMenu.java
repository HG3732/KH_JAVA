package com.kh.practice7_9.snack.view;

import java.util.Scanner;

import com.kh.practice7_9.snack.controller.SnackController;

public class SnackMenu {
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	Scanner sc = new Scanner(System.in);
	
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.print("종류 : ");
		kind = sc.next();
		System.out.println();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.println();
		System.out.print("맛 : ");
		flavor = sc.next();
		System.out.println();
		System.out.print("갯수 : ");
		numOf = sc.nextInt();
		System.out.println();
		System.out.print("가격 : ");
		price = sc.nextInt();
		System.out.println();
		
		scr.saveData(kind, name, flavor, numOf, price);
		
		System.out.println("저장 완료되었습니다.");
		System.out.println("정보를 확인하시겠습니까? (y/n)");
		String answer = sc.next();
		
		if (answer.equals("y")) {
			System.out.println(scr.confirmData());
		}
		
	}
	

}
