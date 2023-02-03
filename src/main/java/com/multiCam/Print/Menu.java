package main.java.com.multiCam.Print;

import java.util.Scanner;

public class Menu {

	public static void printMenu() {
		System.out.print("\n\n");
		System.out.println("=============================");
		System.out.println("# # # 학생 성적 관리 프로그램 # # #");
		System.out.print("\n");
		System.out.println("-----------------------------");
		System.out.println("\t<< MENU >>");
		System.out.print("\n");
		System.out.println("      1. 학생 정보 입력");
		System.out.println("      2. 학생 정보 조회");
		System.out.println("      3. 성적 변경");
		System.out.println("      4. 학생 정보 삭제");
		System.out.println("      5. 프로그램 종료");
		System.out.println("-----------------------------");
		System.out.println("> 메뉴를 선택해 주세요.");
		System.out.print(">> ");
	}
	
	public static int DeleteStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.print("삭제할 학생의 학생 학번을 입력하세요 : ");
		int studentNumber = sc.nextInt();
		System.out.println("-----------------------------");
		
		return studentNumber;
	}
	
	public static int DeleteMenu(int studentNumber) {
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("%d학생의 정보를 삭제하시겠습니까? (yes: 1, No: 2)", studentNumber);
		int menu =  sc.nextInt();
		System.out.println("-----------------------------");
		System.out.println("=============================");
		
		return menu;
	}
	
}
