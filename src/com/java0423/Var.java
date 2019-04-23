package com.java0423;

//import 다른 패키지에 있는 메소드를 불러올 수 있다.

public class Var {

	public Var() {
		var(); // Main에서 기본생성자만 생성하고 바로 출력하게 만들기위해 (var)메소드를 넣는다. (new Var();)
	} // 기본생성자 return유형이 없고 class와 같은 이름을 갖는다.

	// 리턴유형 함수명(매게변수) 로직 구현
	// void var () {}
	public void var() {
		/***********************************************
		 * 변수 사용법 
		 * 1. 변수 선언 
		 * 2. 변수에 데이터 대입(값 담기) 
		 * 3. 변수 사용
		 ***********************************************/
		int a; // 1
		a = 1; // 2
		System.out.println(a); // 3

		int b = 2; // 1, 2
		System.out.println(b); // 3

		int c, d, e; // 1
		c = a; // 2
		d = b; // 2
		e = c + d; // 2
		System.out.println(e); // 3

		int f;
		f = a;
		System.out.println(f);

		a = 10;
		System.out.println(a);
		System.out.println(f);
	}
}
