package jdbc.view;

import java.util.Scanner;

public class MainMenu {
	
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			boolean exit = false;
			System.out.println("메뉴를 고르세요");
			System.out.println("1. SAL 도메인");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				salMenu();
				break;
			default:
				exit = true;
				break;
			}
			if(exit) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	public void salMenu() {
		new SalMenu().salMenu();
	}
}
