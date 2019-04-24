package com.java0424;

import java.util.Scanner;

public class switchEx {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String msg = "";
		switch(score/10) {
		case 9:
			msg = score + " =  A 학점입니다. ";
			break;
		case 8:
			msg = score + " =  B 학점입니다. ";
			break;
		case 7:
			msg = score + " =  C 학점입니다. ";
			break;
		case 6:
			msg = score + " =  D 학점입니다. ";
			break;
		default:
			msg = score + " =  F 학점입니다. ";
			break;
		}
		System.out.println(msg);
	}

}
