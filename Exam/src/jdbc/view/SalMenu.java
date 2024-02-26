package jdbc.view;

import java.util.List;
import java.util.Scanner;

import jdbc.controller.SalController;
import jdbc.model.vo.Salgrade;

public class SalMenu {
	private Scanner sc = new Scanner(System.in);
	private SalController controller = new SalController();
	
	public void salMenu() {
		while (true) {
			boolean exit = false;
			System.out.println("SAL메뉴");
			System.out.println("1. Sal 조회");
			System.out.println("2. Sal 추가");
			System.out.println("3. Sal 삭제");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				selectList();
				break;
			case "2":
				insert();
				break;
			case "3":
				delete();
				break;
			default:
				exit = true;
				break;
			}
			if (exit)
				break;
		}
		System.out.println("종료");
	}

	public void selectList() {
		List<Salgrade> list = controller.selectList();
		if(list == null) {
			System.out.println("연결 오류 확인 불가");
		} else {
			System.out.println("사원 수 : " + list.size());
			if(list.size() > 0) {
				for(Salgrade s : list) {
					System.out.println(s);
					}
				}
			}
		}

	public void insert() {
		try {
		System.out.println("grade");
		String gradeStr = sc.nextLine();
		int grade = Integer.parseInt(gradeStr);
		System.out.println("losal");
		String losalStr = sc.nextLine();
		int losal = Integer.parseInt(losalStr);
		System.out.println("hisal");
		String hisalStr = sc.nextLine();
		int hisal = Integer.parseInt(hisalStr);
		
		Salgrade vo = new Salgrade(grade, losal, hisal);
		System.out.println("입력 완료");
		
		int result = controller.insert(vo);
		if (result > 0) {
			System.out.println("추가 완료");
		} else {System.out.println("추가 실패");}
		} catch (NumberFormatException e) {
			System.out.println("자료형에 맞게 입력하세요");
		}
		
	}
	
	public void delete() {
		try {
			System.out.println("grade");
			String gradeStr = sc.nextLine();
			int grade = Integer.parseInt(gradeStr);
			
			int result = controller.delete(grade);
			if(result > 0) {System.out.println("삭제 성공");}
			else {System.out.println("삭제 실패");}
			
		} catch (NumberFormatException e) {
			System.out.println("자료형에 맞게 입력하세요");
		}
	}
}
