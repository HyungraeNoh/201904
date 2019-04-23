package com.java0423;

//클래스이용한 계산기
class Calc1 {

	int 더하기(int a, int b) {

		return a + b;
	}

	int 빼기(int a, int b) {

		return a - b;
	}

	int 곱하기(int a, int b) {

		return a * b;
	}

	int 나누기(int a, int b) {

		return a / b;
	}
	
	int 나머지(int a, int b) {

		return a % b;
	}
}

public class Calc {

	public static void main(String[] args) {
		//클래스이용한 계산기
		Calc1 c = new Calc1();

		System.out.println("a+b = " + c.더하기(5, 2));
		System.out.println("a-b = " + c.빼기(5, 2));
		System.out.println("a*b = " + c.곱하기(5, 2));
		System.out.println("a/b = " + c.나누기(5, 2));
		System.out.println("a%b = " + c.나머지(5, 2));
		/* 메소드이용한 계산기
		System.out.println(더하기(2,3));
		System.out.println(빼기(2,3));
		System.out.println(곱하기(2,3));
		System.out.println(나누기(2,3));
		System.out.println(나머지(2,3));
		*/
	}
	/*메소드이용한 계산기
	static int 더하기(int a, int b) {
		return a+b;
	}
	static int 빼기(int a, int b) {
		return a-b;
	}
	static int 곱하기(int a, int b) {
		return a*b;
	}
	static int 나누기(int a, int b) {
		return a/b;
	}
	static int 나머지(int a, int b) {
		return a%b;
	}
	*/
}
