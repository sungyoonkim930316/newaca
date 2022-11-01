package day03;

import java.util.Random;
import java.util.Scanner;

public class D_10홀짝게임 {

	public static void main(String[] args) {

		/*
		 * [문제]
			1. 1~10 사이의 숫자 중 랜덤으로 한 개의 숫자를 저장한다. 
			2. 랜덤 숫자가 홀수인지 짝수인지 맞추는 게임이다.
			3. 사용자에게 1.홀수 2.짝수
			4. 맞췄다! 틀렸다! 출력
		 */
		
//		Random r=new Random();
//		int randomNum=r.nextInt(10)+1;
//		System.out.printf("주어진 랜덤 넘버는 : %d입니다!\n",randomNum);
//		Scanner s=new Scanner(System.in);
//		System.out.print("홀짝을 맞춰보세요, 홀수 -> 1입력 / 짝수 -> 2입력 : ");
//		int userNum=s.nextInt();
//		boolean err=userNum<1||userNum>2;
//		if (err) {System.out.println("입력오류");}
//		if (!err) {
//			if(userNum==1) {
//				if(randomNum%2==0) {System.out.println("틀렸다!");}
//				if(randomNum%2==1) {System.out.println("맞췄다!");}
//			}
//			if(userNum==2) {
//				if(randomNum%2==0) {System.out.println("맞췄다!");}
//				if(randomNum%2==1) {System.out.println("틀렸다!");}
//			}
//		}
//		s.close();
		
		Random r=new Random();
		int randomNum=r.nextInt(10)+1;
		System.out.printf("주어진 랜덤 넘버는 : %d입니다!\n",randomNum);
		Scanner s=new Scanner(System.in);
		System.out.print("홀짝을 맞춰보세요, 홀수 -> 1입력 / 짝수 -> 2입력 : ");
		int userNum=s.nextInt();
		boolean err=userNum<1||userNum>2;
		if (err) {System.out.println("입력오류");}
		if (!err) {
			if(userNum==1) {
				if(randomNum%2==0) {System.out.println("틀렸다!");}
				if(randomNum%2==1) {System.out.println("맞췄다!");}
			}
			if(userNum==2) {
				if(randomNum%2==0) {System.out.println("맞췄다!");}
				if(randomNum%2==1) {System.out.println("틀렸다!");}
			}
		}
		s.close();

	}

}
