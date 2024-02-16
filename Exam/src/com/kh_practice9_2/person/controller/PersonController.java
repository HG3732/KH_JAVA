package com.kh_practice9_2.person.controller;

import com.kh_practice9_2.person.model.vo.Employee;
import com.kh_practice9_2.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	static int sCount = 0;
	static int eCount = 0;

	public int[] personCount() {
		int[] personCount = new int[2];
		int maxcount1 = 0;
		int maxcount2 = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				maxcount1++;
			} else {
				personCount[0] = maxcount1;
				break;
			}
		}
		for (int j = 0; j < e.length; j++) {
			if(e[j] != null) {
				maxcount2++;
			} else {
				personCount[1] = maxcount2;
				break;
			}
		}
		return personCount;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		if (sCount == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼습니다.");
			System.out.println("학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
		} else {
		for(int i=0;i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student();
				s[i].setName(name);
				s[i].setAge(age);
				s[i].setHeight(height);
				s[i].setWeight(weight);
				s[i].setGrade(grade);
				s[i].setMajor(major);
				sCount++;
				break;
				}
			}
		}
	}

	public Student[] printStudent() {
//		for(int i = 0; i<s.length; i++) {
//			System.out.println(s[i].getName() + ", " + s[i].getAge() + ", " + s[i].getHeight() + ", " + s[i].getWeight() + ", " + s[i].getGrade() + ", " + s[i].getMajor());
//		}
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		if (eCount == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼습니다.");
			System.out.println("사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
		} 
		for(int i=0;i<e.length; i++) {
			if(e[i] == null) {
				e[i].setName(name);
				e[i].setAge(age);
				e[i].setHeight(height);
				e[i].setWeight(weight);
				e[i].setSalary(salary);
				e[i].setDept(dept);
				eCount++;
				break;
			} 
		}
		
	}

	public Employee[] printEmployee() {
		return null;
	}

}
