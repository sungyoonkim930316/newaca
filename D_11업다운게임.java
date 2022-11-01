package day03;

import java.util.Random;
import java.util.Scanner;

public class D_11업다운게임 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 1. 10-60 사이의 랜덤값을 com에 저장 
		 * 2. 사용자에게 값 입력 받기 
		 * 3. 사용자가 입력한 값이 com 보다 크면 down
		 * 사용자가 입력한 값이 com 보다 작으면 up 맞추면 bingo!
		 */
		
		Random r=new Random();
		int com=r.nextInt(51)+10;
		System.out.printf("병뚜껑 번호는 : %d\n",com);
		Scanner s=new Scanner(System.in);
		System.out.print("10~60사이의 정수를 입력하세요 : ");
		int userNum=s.nextInt();
		boolean err=userNum<10||userNum>60;
		if (err) {System.out.println("입력오류");}
		if (!err) {
			if (com>userNum) {System.out.println("up");}
			if (com<userNum) {System.out.println("down");}
			if (com==userNum) {System.out.println("bingo");}
		}
		s.close();
	}

}
