package main.java.com.multiCam;

public class DeleteInfo {
	int menu;
	int studentNumber;
	StudentList studentList = new StudentList();
	
	DeleteInfo(){
		studentNumber = Menu.DeleteStudent();		
		menu = Menu.DeleteMenu(studentNumber);
		
		switch(menu) {
		case 1:
			delete();
			break;
			
		case 2:
			System.out.println("취소되었습니다.");
			return;
		}
		
	}
	
	private void delete() {
		studentList.deleteStudent(studentNumber);
	}

}
