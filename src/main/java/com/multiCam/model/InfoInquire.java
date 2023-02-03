package main.java.com.multiCam.model;

import main.java.com.multiCam.Memory.Student;
import main.java.com.multiCam.Memory.StudentList;

import java.util.Scanner;

public class InfoInquire {
	Scanner sc = new Scanner(System.in);
	int menuNum;
	
	InfoInquire(){
		menuNum = 0;
		menu();
	}
	
	private void menu() {
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("-----------------------------");
		System.out.println("\t[학생 정보 조회 메뉴]");
		System.out.println("         1. 전체 학생 조회");
		System.out.println("       2. 학생 정보 상세 조회");
		System.out.println("-----------------------------");
		System.out.print(" >> ");
		menuNum = sc.nextInt();
		System.out.println("+++++++++++++++++++++++++++++");
		
		select();
	}
	
	private void select() {
		switch(menuNum) {
		
		case 1:
			System.out.println("---------------------------------------------------------");
			System.out.println("|  성  명  |  학 번  |  성 별  |  국 어  |  영 어  |  수 학  |  과 학  |");
			StudentList.allStudent().forEach(student -> System.out.printf("|%8s|%8d|%8s|%8d|%8d|%8d|%8d|\n", student.getName(), student.getStudentNumber(), student.getSex(),
																			student.getScore()[0], student.getScore()[1], student.getScore()[2], student.getScore()[3]));
			System.out.println("---------------------------------------------------------");
			break;
			
		case 2:
			System.out.println("---------------------------------------------------------");
			System.out.println("조회를 원하시는 학생의 학번을 입력하세요.");
			System.out.printf(">> ");
			int studentNumber = sc.nextInt();
			
			Student student = StudentList.studentInformation(studentNumber);
			String name = student.getName();
			String sex = student.getSex();
			int korean = student.getScore()[0];
			int english = student.getScore()[1];
			int math = student.getScore()[2];
			int science = student.getScore()[3];
			
			System.out.println("---------------------------------------------------------");
			System.out.println("|  성  명  |  학 번  |  성 별  |  국 어  |  영 어  |  수 학  |  과 학  |");
			System.out.printf("|%8s|%8d|%8s|%8d|%8d|%8d|%8d|\n", name, studentNumber, sex, korean, english, math, science);
			break;
			
		default:
			System.out.println(">>> 없는 메뉴 입니다. <<<");
			menu();
			break;
		}
	}
}
