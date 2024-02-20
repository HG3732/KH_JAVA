package com.kh_practice9_2.person.controller;

import java.util.Arrays;

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

	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
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

	@Override
	public String toString() {
		return "PersonController [s=" + Arrays.toString(s) + "]";
	}

	public Employee[] printEmployee() {
		return e;
	}

	public static int getsCount() {
		return sCount;
	}

	public static int geteCount() {
		return eCount;
	}
	
}
