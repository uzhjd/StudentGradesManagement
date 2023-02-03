package main.java.com.multiCam.Memory;

import main.java.com.multiCam.Exception.EmptyException;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
	private Student student;
	static private ArrayList<Student> studentList = new ArrayList<Student>();
	
	StudentList() {
	}
	
	StudentList(String name, int studentNumber, String sex, int korean, int english, int math, int science) {
		student = new Student(name, studentNumber, sex, korean, english, math, science);
		studentList.add(student);
	}
	
	public static ArrayList<Student> allStudent(){
		try {
			return studentList;
		} catch (EmptyException e){
			throw new EmptyException("학생 정보가 없습니다.");
		}
	}
	
	public static Student studentInformation (int studentNumber) {
			for(Student studentList : studentList) {
				if(studentList.getStudentNumber() == studentNumber) {
					return studentList;
				}
			}
			throw new EmptyException("입력하신 학생 정보가 없습니다."); 
		
	}
	
	public void deleteStudent(int studentNumber) {
		try {
			for(Iterator<Student> iterator = studentList.iterator(); iterator.hasNext();) {
				Student student = iterator.next();
				if(student.getStudentNumber() == studentNumber) {
					iterator.remove();
				}
			}
		} catch (EmptyException e){
			throw new EmptyException("학생 정보가 없습니다."); //////////////////////////////////
		}
	}
	
	public void changeScore(int studentNumber, String subject, int score) {
		int i = 0;
		int subjectIndex = 0;
		try {
			if(subject == "국어")			subjectIndex = 0;
			else if(subject == "영어")	subjectIndex = 1;
			else if(subject == "수학")	subjectIndex = 2;
			else if(subject == "과학")	subjectIndex = 3;
			
			for(Student studentList : studentList) {
				if(studentList.getStudentNumber() == studentNumber) {
					studentList.getScore()[subjectIndex] = score;
					this.studentList.set(i, studentList);
				}
				i++;
			}
			

			
		} catch (EmptyException e){
			throw new EmptyException("학생 정보가 없습니다."); //////////////////////////////////
		}
	}
	
}
