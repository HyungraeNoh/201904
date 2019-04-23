package com.java0423;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("특수 문자 출력");
		/***************************************
		 * 특수문자 >> \
		 * \n  : 한줄 이동
		 * \' : '  > 문자 : ''
		 * \uD63D : 홍
		 ***************************************/
		String a = "\\";
		System.out.println(a);
//		char C = u005c;
//		System.out.println(C);
		System.out.println("\u005c\u005c");
		
	}

}
