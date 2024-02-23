package com.kh.practice14_1.list.library.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.practice14_1.list.library.controller.BookController;
import com.kh.practice14_1.list.library.model.vo.Book;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		
		
		while(true) {
			System.out.println("****** 메인 메뉴 ******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (menuNum) {
			case 1: insertBook();
			case 2: selectList();
			case 3: searchBook();
			case 4: deleteBook();
			case 5: ascBook();
			case 9: System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
	}
	
	public void insertBook() {
		
			System.out.print("도서명 입력 : ");
			String title = sc.nextLine();
			System.out.println();
			
			System.out.print("저자명 입력 : ");
			String author = sc.nextLine();
			System.out.println();
			
			System.out.print("장르 입력(1. 인문, 2. 자연과학, 3. 의료, 4. 기타 : ");
			String category = sc.nextLine();
			System.out.println();
			
			System.out.print("가격 입력 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			Book book = new Book(title, author, category, price);
			
			bc.insertBook(book);
		}

	
	public void selectList() {
		List<Book> sList = bc.selectList();
		if(sList.equals(null)) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Book b : sList) {
				System.out.println(b);
			}
		}
	}
	public void searchBook() {
		
		System.out.print("검색 할 단어 입력 : ");
		String keyword = sc.nextLine();
		System.out.println();
		
		
		
	}
	public void deleteBook() {
		
	}
	public void ascBook() {
		
	}
	
	
}
