package main.java.com.multiCam;

import main.java.com.multiCam.Print.Menu;
import main.java.com.multiCam.Print.Notice;
import main.java.com.multiCam.model.ChangeScore;
import main.java.com.multiCam.model.DeleteInfo;
import main.java.com.multiCam.model.InfoInput;
import main.java.com.multiCam.model.InfoInquire;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		InfoInput infoInput;
		InfoInquire infoInquire;
		ChangeScore changeScore;
		DeleteInfo deleteInfo;
		
		while(true) {
			Menu.printMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				infoInput = new InfoInput();
				break;
				
			case 2:
				infoInquire = new InfoInquire();
				break;
				
			case 3:
				changeScore = new ChangeScore();
				break;
			case 4:
				deleteInfo = new DeleteInfo();
				break;
				
			case 5:
				Notice.printOver();
				return;
				
			default:
				Notice.printNoMenu();
				break;
			}
		}
	}
}
