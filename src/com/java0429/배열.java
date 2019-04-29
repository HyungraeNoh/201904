package com.java0429;

import java.util.Scanner;

public class 배열 {

	public void t1() {
		boolean[][] 표 = new boolean[5][5];
		표[0][0] = false;
		표[0][1] = false;
		표[0][2] = false;
		표[0][3] = false;
		표[0][4] = false;

		표[1][0] = true;
		표[1][1] = true;
		표[1][2] = true;
		표[1][3] = true;
		표[1][4] = true;

		표[2][0] = false;
		표[2][1] = false;
		표[2][2] = false;
		표[2][3] = false;
		표[2][4] = false;

		표[3][0] = true;
		표[3][1] = true;
		표[3][2] = true;
		표[3][3] = true;
		표[3][4] = true;

		표[4][0] = false;
		표[4][1] = false;
		표[4][2] = false;
		표[4][3] = false;
		표[4][4] = false;

		for (int y = 0; y < 표.length; y++) { // 행

			for (int x = 0; x < 표[y].length; x++) { // 열
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
	}

	public void t2() {
		int[][] 표 = new int[5][5];
		//배열에 값 설정하기<단, 패턴이 있을때만 사용가능>
		for (int y = 0; y < 표.length; y++) {
			for (int x = 0; x < 표[y].length; x++) {
				if (y % 2 == 0) { // 짝수 (0, 2, 4...)
					표[y][x] = 0;
				} else { // 홀수 (1, 3, 5...)
					표[y][x] = 1;
				}
			}
		}
		//출력문
		for (int y = 0; y < 표.length; y++) { // 행

			for (int x = 0; x < 표[y].length; x++) { // 열
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t3() {
		boolean[][] 표 = new boolean[5][5];
		for (int y = 0; y < 표.length; y++) {
			for (int x = 0; x < 표[y].length; x++) {
				if (y == x || (y+x) == (표[y].length-1)) { 		
					표[y][x] = true;
				} else { 
					표[y][x] = false;
				}
			}
		}
		
		for (int y = 0; y < 표.length; y++) { // 행

			for (int x = 0; x < 표[y].length; x++) { // 열
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
	}
	public boolean t4(int aX, int aY, int bX, int bY) {
		boolean result = false;
		int[][] 맵 = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,1,1,1,1,1,1,1,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,0,0,0,1,1,1,0},
				{0,1,0,0,0,0,1,0,1,0},
				{0,1,0,0,1,0,1,0,1,0},
				{0,1,1,1,1,1,1,0,1,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		for (int y = 0; y < 맵.length; y++) {
			for (int x = 0; x < 맵[y].length; x++) {
				
				if(맵[aY][aX] == 0) {
					aY = bY;
					aX = bX;
					result = true;
				}
				
				if(y == aY && x == aX) {
					System.out.print(" ㉿ ");
				}
				else if (맵[y][x] == 1) { 
					System.out.print(" □ ");
					
				} else { 
					System.out.print(" ■ ");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void t5() {
		Scanner scan = new Scanner(System.in);
		int aX = 1; 
		int aY = 1; 
		int bX = 1; 
		int bY = 1;
		t4(aX, aY, bX, bY); //시작을 위하여 필요한 호출 부분
		while(true) { //while문 무한반복
			String input = scan.next();
			
			switch(input.toUpperCase()) { //toUpperCase()문자열의 값을 대문자로 바꾼다.
			case "W": //위
				aY--;
				break;
			case "S": //아래
				aY++;
				break;
			case "A": //왼쪽
				aX--;
				break;
			case "D": //오른쪽
				aX++;
				break;
			default: 
				break;
			}
			if(aX == 8 && aY == 8) {
				break;
			}
			System.out.println(aY+","+ aX+","+ bY+","+ bX);
			if(t4(aX, aY, bX, bY)) { //이동을 위하여 호출 부분
				aX = bX; //앞으로 가면서 지나간 방향의 좌표를 넣어준다.
				aY = bY;
			}
			else {
				bX = aX;
				bY = aY;
			}
		}
	}
}
