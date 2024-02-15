package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice6 {
	
	public void method6 () {
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.println("확인하고자 하는 회원 등급 : ");
		input = sc.next();
		
		switch (input) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		}
		
}

