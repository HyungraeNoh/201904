package com.java0425;

import java.util.Scanner;

public class Test2 {

	public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("첫 번째 숫자는 : ");
		a = scan.nextInt();
		System.out.println("두 번째 숫자는 : ");
		b = scan.nextInt();
		System.out.println("세 번째 숫자는 : ");
		c = scan.nextInt();

		if (a > b && b >= c) {
			System.out.println("정렬한 결과 : " + a + " " + b + " " + c + " 입니다.");
		} else if (b > c && c >= a) {
			System.out.println("정렬한 결과 : " + b + " " + c + " " + a + " 입니다.");
		} else if (c > a && a >= b) {
			System.out.println("정렬한 결과 : " + c + " " + a + " " + b + " 입니다.");
		} else if (a > c && c >= b) {
			System.out.println("정렬한 결과 : " + a + " " + c + " " + b + " 입니다.");
		} else if (b > a && a >= c) {
			System.out.println("정렬한 결과 : " + b + " " + a + " " + c + " 입니다.");
		} else if (c > b && b >= a) {
			System.out.println("정렬한 결과 : " + c + " " + b + " " + a + " 입니다.");
		} else {
			System.out.println("정렬한 결과 : " + a + " " + b + " " + c + " 모두 같습니다.");
		}

		scan.close();
	}

}