package com.java0430;

public class Main2 extends Method{

	public static void main(String[] args) {
		Method method = new Method();
		method.A();
		method.A(1);
		method.A("1");
		
		// 오버로딩(동일 메소드에 매개변수를 다르게 준다.) == 오버라이딩(상속받아 재구성해 사용)
		
//		A(true); //static을 써줘야 실행 가능하다.
	}
	
//	static int a;
	
//	public static void A(boolean a) {
//		System.out.println("Main2 A() 호출");
//	}
}
