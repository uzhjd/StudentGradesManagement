package main.java.com.multiCam.Memory;

public class Student {
	private String name;
	private int studentNumber;
	private String sex;
	private Score score;
	
	Student(String name, int studentNumber, String sex, int korean, int english, int math, int science) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.sex = sex;
		this.score = new Score(korean, english, math, science);
	}

	public String getName() {
		return this.name;
	}
	
	public int getStudentNumber() {
		return this.studentNumber;
	}
	
	public String getSex() {
		return this.sex;
		
	}
	
	public int[] getScore() {
		int[] result = new int[4];
		
		for(int i = 0; i < 4; i++) {
			result[i] = score.getScore(i);
		}
		
		return result;
	}
}
