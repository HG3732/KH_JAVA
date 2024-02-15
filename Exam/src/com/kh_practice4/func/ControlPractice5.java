package com.kh_practice4.func;

import java.util.Scanner;

public class ControlPractice5 {
	
	public void method5 () {
		
		String id = "myId";
		String password = "myPassword";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String id2 = sc.next();
		
		if(!(id2.equals(id))) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
			System.out.println("비밀번호 : ");
			String pw2 = sc.next();
			if(!(pw2.equals(password))) {
				System.out.println("비밀번호가 틀렸습니다.");
				return;
			}
			System.out.println("로그인 성공");
		}
		
}

