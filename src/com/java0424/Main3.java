package com.java0424;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int a = scan.nextInt();
		
		System.out.print("연산을 입력하시오 : ");
		String 연산 = scan.next();
		
		System.out.print("숫자를 입력하시오 : ");
		int b = scan.nextInt();
		
		계산기 calc = new 계산기();
		String msg = "";
		
		switch(연산) {
		case "+":
			msg = a + "+" + b + "=" + calc.덧셈(a, b);
			break;
		case "-":
			msg = a + "-" + b + "=" + calc.뺄셈(a, b);
			break;
		case "*":
			msg = a + "*" + b + "=" + calc.곱셈(a, b);
			break;
		case "/":
			msg = a + "/" + b + "=" + calc.나눗셈(a, b);
			break;
		default:
			msg = "계산 할 수 없습니다.";
			break;
		}
		
		scan.close();
		System.out.println(msg);
		
		
	}
	
}
