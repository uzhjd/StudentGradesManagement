package main.java.com.multiCam.model;

import main.java.com.multiCam.Memory.StudentList;

import java.util.Scanner;

public class InfoInput {
	private String name;
	private int studentNumber;
	private String sex;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	InfoInput(){
		writeInfo();
	}
	
	private void writeInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("     [학생 정보 기입]");
		System.out.println("점수는 국어, 영어, 수학, 과학 순으로 기입해주세요!!");
		System.out.println();
		System.out.println("이  름 : ");
		name = sc.next();
		System.out.println("학  번 : ");
		studentNumber = sc.nextInt();
		System.out.println("성  별 : ");
		sex = sc.next();
		System.out.println("국어 점수 : ");
		korean = sc.nextInt();
		System.out.println("영어 점수 : ");
		english = sc.nextInt();
		System.out.println("수학 점수 : ");
		math = sc.nextInt();
		System.out.println("과학 점수 : ");
		science = sc.nextInt();
		System.out.println("=============================");
		
		save();
	}
	
	private void save() {
		StudentList student = new StudentList(name, studentNumber, sex, korean, english, math, science);
	}
}
