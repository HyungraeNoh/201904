package com.java0425;

public class 반복문1 {
	/*********************************************
	 * for문 : for(1, 2, 3){실행문}
	 * 1) 초기화식 : for문에서 사용할 변수 선언 및 초기값 정의
	 * 2) 조건식 : if문과 동일하게 거짓을 찾기위한 조건
	 * 3) 증감식 : for문에서 사용할 변수를 변화를 주기 위한 식
	 *********************************************/

	public void t1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i); // 0 ~ 9
		}
	}

	public void t2(int s) {
		System.out.println("반복문 시작");
		for (int i = 0; i < s; i++) {
			System.out.println(i);
		}
		System.out.println("반복문 종료");
	}

	public void t3(int a, int b) {
		System.out.println("t3 반복문 시작");
		for (; a < b; a++) {
			System.out.println(a);
		}
		System.out.println("t3 반복문 종료");
	}

	public void t4(int s) {
		String num = "";
		for (int i = 0; i < s; i++) { // 0 ~ 4
			
			if (i % 2 == 0) {
				//System.out.print("★");
				num += "★";
			} else {
				//System.out.print("☆");
				num += "☆";	
			}
				System.out.println(num);
		}

	}
	
	public void t5() {
		for(int i = 0; i < 5; i++) { // 0 ~ 4
			
			for(int j = 0; j <= i; j++) {
				
				if (j % 2 == 0) {
					// j = 0, i = 0 >> ★					  || ★
					// j = 0, i = 1 >> ★ || j = 1 , i = 1 >> ☆  || ★☆
					// j = 1, i = 2 >> ★ || j = 1 , i = 1 >> ☆  || ★☆★
					//					 || j = 2 , i = 2 >> ★
					System.out.print("★");
				} 
				else {
					System.out.print("☆");	
				}
			}
			System.out.println("");
		}
	}
	
	public void t6() {
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j <= i; j++) {
				// 0 - 0 = 0 >> ★									|| ★
				// 1 - 0 = 1 >> ☆ || 1 - 1 = 0 >> ★					|| ☆★
				// 2 - 0 = 2 >> ★ || 2 - 1 = 1 >> ☆ || 2 - 2 = 0 >> ★ || ★☆★
				if((i-j) % 2 == 0) {
					System.out.print("★");
				}
				else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
	}
	
	public void t7() {
		int t = 0;
		for(int i = 0; i < 9; i++) { // 0,1,2,3,4,3,2,1,0
			if(i > 4) {
				t = t - 2;
			}
		
			for(int j = 0; j <= t; j++) {
					if((i-j) % 2 == 0) {
						System.out.print("★");
					}
					else {
						System.out.print("☆");
					}	
			}	
			t++;
			System.out.println("");
		}
	}
	public void t8() {
		int c = 0;
		for(int i = 0; i<5; i++) {
			for(int j= 0; j<i; j++) {
				if(j > 4) {
					c = c-2;
				}
				for(int k = 0; k<=c; k++) {
					if(k % 2 == 0) {
						System.out.print("★");
					}
					else {
						System.out.print("☆");
					}
				}
				c++;
				System.out.println("");
			}
		}
		
	}
	
}
