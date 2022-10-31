package day02;

import java.util.Scanner;

public class D_07업다운 {

	public static void main(String[] args) {

		/*
		 * [문제] Up & Down 게임 
		 * 1. com은 8이다. 
		 * 2. me는 숫자 하나를 입력한다. 
		 * 3. com과 me를 비교해 다음과 같은
		 * 메세지를 출력한다. 
		 * 1) me < com : Up! 
		 * 2) me > com : Down! 
		 * 3) me == com : Bingo!
		 * 시작시간 : 17:45
		 * 종료시간 : 17:48
		 */

		Scanner s=new Scanner(System.in);
		
		int com=8;
		
		System.out.println("===업다운게임===");
		System.out.print("숫자를 맞춰보세요 : ");
		int me=s.nextInt();
		if(me>com) {
			System.out.println("Down!");
		}
		if(me<com) {
			System.out.println("Up!");
		}
		if(me==com) {
			System.out.println("Bingo!");
		}
		s.close();
	}

}
