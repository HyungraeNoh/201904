package com.java0423;

public class A {
	public A() {
		new B("안녕"); // B클래스 생성자 생성
	}//기본 생성자
	public A(String msg) {
		System.out.println("B class : " + msg);
	}
}
