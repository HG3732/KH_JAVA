package com.kh.practice7_5;

public class EmployeeRun {

	public static void main(String[] args) {

		Employee hong = new Employee();
		
		
		
		Employee hong2 = new Employee(100, "홍길동");
		
		System.out.println(hong2.getEmpNo());
		System.out.println(hong2.getEmpName());

		System.out.println("===================");
		
		Employee hong3 = new Employee(100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
		
		System.out.println(hong3.getEmpNo());
		System.out.println(hong3.getEmpName());
		System.out.println(hong3.getDept());
		System.out.println(hong3.getJob());
		System.out.println(hong3.getAge());
		System.out.println(hong3.getGender());
		System.out.println(hong3.getSalary());
		System.out.println(hong3.getBonusPoint());
		System.out.println(hong3.getPhone());
		System.out.println(hong3.getAddress());
	}

}
