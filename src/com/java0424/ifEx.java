package com.java0424;

import java.util.Scanner;

public class ifEx {

	public void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade = "";
		if(score <= 100 && score >= 90) {
			grade = "A";
			//System.out.println("A 학점 입니다.");
		}
		else if(score < 90 && score >= 80) {
			grade = "B";
			//System.out.println("B 학점입니다.");
		}
		else if(score < 80 && score >= 70) {
			grade = "C";
			//System.out.println("C 학점입니다.");
		}
		else if(score < 70 && score >= 60) {
			grade = "D";
			//System.out.println("D 학점입니다.");
		}
		else if(score < 60 && score >= 0) {
			grade = "F";
			//System.out.println("F 학점입니다.");
		}
		else {
			grade = "잘못된 입력입니다.";
			//System.out.println("다음에 다시 오세요");
		}
		System.out.println(grade + " 학점입니다. ");
	}

}
