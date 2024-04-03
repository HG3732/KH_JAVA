package com.kh.practice13_1.file.view;

import java.util.Scanner;

import com.kh.practice13_1.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		boolean exit = false;
		while(true) {
		System.out.println("***** My Note ******");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		String menuNum = sc.nextLine();
		System.out.println();
		
		switch (menuNum) {
			case "1":
				fileSave();
				break;
			case "2":
				fileOpen();
				break;
			case "3":
				fileEdit();
				break;
			case "9":
				System.out.println("프로그램을 종료합니다.");
				exit = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		if(exit) {break;}
		}
	}

	public void fileSave() {
		
		StringBuilder textSum = new StringBuilder();
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String text = sc.nextLine();
			System.out.println();
			if(text.equals("ex끝it")) break;
			
			textSum.append(text);
		}
			
		System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
		String textSub = sc.nextLine();
		System.out.println();
		
		boolean check = fc.checkName(textSub);
			while(check) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				String answer = sc.nextLine();
				if(answer.equals("y") || answer.equals("Y")) break;
				else {
					System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
					System.out.println();
					textSub = sc.nextLine();
				}
			} fc.fileSave(textSub, textSum);
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String textSub = sc.nextLine();
		System.out.println();
		if(!fc.checkName(textSub)) {
			System.out.println("없는 파일입니다.");
		} else {
			System.out.println(fc.fileOpen(textSub));
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String textSub = sc.nextLine();
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		System.out.print("추가할 내용 : ");
		String addContent = sc.nextLine();
		System.out.println();
		sb.append(addContent);
		if(!fc.checkName(textSub)) {
			System.out.println("없는 파일입니다.");
		} else {
			fc.fileEdit(textSub, sb);
		}
	}
	
	
	
}
