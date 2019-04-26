package com.java0426;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class 배열 {

	public void t1() {
		int a; // 변수 선언
		int[] aa; // 배열 선언

		a = 1;

		aa = new int[5]; // 배열의 초기값설정 (공간확보) 배열 생성 및 크기 설정
		aa[0] = 1;		// 배열 특정 위치에 값 담기

		int[] bb = new int[2];
		bb[0] = 0;
		bb[1] = 1;

		System.out.println(a);
		System.out.println(aa);
		System.out.println(bb);

		System.out.println(aa[0]);	//배열 특정 위치 값 사용
		System.out.println(bb[0]);
		System.out.println(bb[1]);

	}
	
	public void t2() {
		int[] one단 = new int[9];
		one단[0] = (1*1);
		one단[1] = (1*2);
		one단[2] = (1*3);
		one단[3] = (1*4);
		one단[4] = (1*5);
		one단[5] = (1*6);
		one단[6] = (1*7);
		one단[7] = (1*8);
		one단[8] = (1*9);
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		//  0  1  2  3  4  5  6  7  8     << 위차값(인덱스)
		
		System.out.println("1 * 5 = "+ one단[4]);
	}
	
	public void t3() {
		int[] 단 = new int[9];
		for(int i = 1; i < 10; i++) { // 정수 배열에 값 담기 반복문 실행
			int val = (1 * i);
			int index = (i-1); // 0, 1, 2, 3, 4, 5, 6, 7, 8
			단[index] = val;
		}
		
		for(int i = 0; i < 단.length; i++) {
			int 수 = (i+1);
			System.out.println(" 1 * " + 수 + "  = " + 단[i]);
		}
	}
	
	public void t4() {
		String[] 요일 = new String[7];
		요일[0] = "일";
		요일[1] = "월";
		요일[2] = "화";
		요일[3] = "수";
		요일[4] = "목";
		요일[5] = "금";
		요일[6] = "토";
		
		// 일 > 화 > 목> 토
		
		for(int i = 0; i < 요일.length; i++) { // 7번 돈다
			if(i % 2 == 0) {
				System.out.print(요일[i]);
				continue;
			}
			System.out.print(" > ");
		}
		/*for(int i = 0; i < 요일.length; i = i+2){
		 * 	System.out.print(요일[i]);
		 * } //4번 돈다
		 */
	}
	
	public void t5() {
		int[][] 빙고 = new int[5][5];
		빙고[0][0] = 5; 
		빙고[0][1] = 3;
		빙고[0][2] = 1;
		빙고[0][3] = 6;
		빙고[0][4] = 7;
		빙고[1][0] = 8;
		빙고[1][1] = 9;
		빙고[1][2] = 5;
		빙고[1][3] = 3;
		빙고[1][4] = 1;
		빙고[2][0] = 2;
		빙고[2][1] = 2;
		빙고[2][2] = 4;
		빙고[2][3] = 7;
		빙고[2][4] = 8;
		빙고[3][0] = 5;
		빙고[3][1] = 3;
		빙고[3][2] = 2;
		빙고[3][3] = 1;
		빙고[3][4] = 3;
		빙고[4][0] = 4;
		빙고[4][1] = 7;
		빙고[4][2] = 8;
		빙고[4][3] = 9;
		빙고[4][4] = 9;
		
		
		for(int i = 0; i < 빙고.length; i++) {
			for(int j = 0; j < 빙고[i].length; j++) {
				System.out.print(빙고[i][j]);
				
			}
			System.out.println();
		}
		
	}
	
	public void t6() {
		String[][] 요일 = new String[5][7];
		요일[0][0] = "1"; 요일[0][1] = "2"; 요일[0][2] = "3"; 요일[0][3] = "4"; 요일[0][4] = "5"; 요일[0][5] = "6"; 요일[0][6] = "7";
		요일[1][0] = "8"; 요일[1][1] = "9"; 요일[1][2] = "10"; 요일[1][3] = "11"; 요일[1][4] = "12"; 요일[1][5] = "13"; 요일[1][6] = "14";
		요일[2][0] = "15"; 요일[2][1] = "16"; 요일[2][2] = "17"; 요일[2][3] = "18"; 요일[2][4] = "19"; 요일[2][5] = "20"; 요일[2][6] = "21";
		요일[3][0] = "22"; 요일[3][1] = "23"; 요일[3][2] = "24"; 요일[3][3] = "25"; 요일[3][4] = "26"; 요일[3][5] = "27"; 요일[3][6] = "28";
		요일[4][0] = "29"; 요일[4][1] = "30"; 요일[4][2] = "31";
		
		String[] 날짜 = new String[7];
		날짜[0] = "일";
		날짜[1] = "월";
		날짜[2] = "화";
		날짜[3] = "수";
		날짜[4] = "목";
		날짜[5] = "금";
		날짜[6] = "토";
		// 현재 달의 달력 데이터를 요일 배열에 데이터를 담아 보세요.
		// 출력 오늘 요일을 표현 할것.
		for(int num = 0; num < 7; num++) {
			System.out.print(날짜[num] + " ");
		}
		System.out.println();
		for(int x = 1; x <= (요일.length+1); x++) {
			
			for(int y = 1; y < 6; y++) {
				if(y == 31) {
					break;
				}
				
				System.out.print(요일[x][y]+ " ");
			}
			System.out.println();
		}
		
	}
	
	public void t7() {
		int[] arr1;
		int arr2[];
		arr1 = new int[5];
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println("개선된 for 구문 이용 출력");
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
