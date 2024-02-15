package com.kh.practice7_3;

public class StudentRun {

	public static void main(String[] args) {

		Student Lee = new Student();
		
		Lee.setName("이씨");
		Lee.setGrade(2);
		Lee.setClassroom(3);
		Lee.setGender('남');
		Lee.setHeight(200);
		
		Lee.information();
	}

}
