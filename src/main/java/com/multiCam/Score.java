package main.java.com.multiCam;

public class Score {
	private int[] score;
	
	Score(int korean, int english, int math, int science){
		this.score = new int[4];
		this.score[0] = korean;
		this.score[1] = english;
		this.score[2] = math;
		this.score[3] = science;
	}

	public int getScore(int i) {
		return this.score[i];
	}
}
