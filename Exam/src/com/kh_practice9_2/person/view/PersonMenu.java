package com.kh_practice9_2.person.view;

import java.util.Scanner;

import com.kh_practice9_2.person.controller.PersonController;
import com.kh_practice9_2.person.model.vo.Employee;
import com.kh_practice9_2.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {
		while (true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (menuNum) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}

	public void employeeMenu() {
		
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (menuNum) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertStudent() {
		
		System.out.print("학생 이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println();

		System.out.print("학생 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("학생 키 : ");
		int height = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("학생 몸무게 : ");
		int weight = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("학생 학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("학생 전공 : ");
		String major = sc.next();
		sc.nextLine();
		System.out.println();

		pc.insertStudent(name, age, height, weight, grade, major);

	}

	public void printStudent() {
		for( Student e : pc.printStudent()) {
			if(e != null)
				System.out.println(e);
		}
//		System.out.println(pc.printStudent());
	}

	public void insertEmployee() {
		
		System.out.print("사원 이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println();

		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("사원 키 : ");
		int height = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("사원 몸무게 : ");
		int weight = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("사원 급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.print("사원 부서 : ");
		String dept = sc.next();
		sc.nextLine();
		System.out.println();

		pc.insertEmployee(name, age, height, weight, salary, dept);
	}

	public void printEmployee() {
		for(Employee e : pc.printEmployee()) {
			if(e != null)
				System.out.println(e);
		}
	}

}
