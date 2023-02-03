package main.java.com.multiCam.model;

import main.java.com.multiCam.Memory.StudentList;

import java.util.Scanner;

public class ChangeScore {
	ChangeScore() {
		selectStudent();
	}
	
	private void selectStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("=============================");
		System.out.println("성적 변경을 원하는 학생의 학번을 입력하세요.");
		int studentNumber = sc.nextInt();

		System.out.println("변경을 원하는 과목을 입력하세요");
		String subject = sc.next();

		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		StudentList studentList = new StudentList();
		studentList.changeScore(studentNumber, subject, score);
		
	}
}
