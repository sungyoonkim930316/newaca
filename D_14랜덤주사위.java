package day03;

import java.util.Random;

public class D_14랜덤주사위 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 눈금이 1 ~ 6 인 주사위 2개가 있다. 주사위 2개를 던저서 나온숫자의 합을 출력하시오. 
		 * 단 주사위눈금이 서로 같다면 그 숫자의 합의 두배를 출력하시오. 
		 * [예시] 
		 * 2, 3 : 5 
		 * 3, 3 : 6 * 2
		 */
		
		Random r=new Random();
		int diceOne=r.nextInt(6)+1;
		int diceTwo=r.nextInt(6)+1;
		int sum=diceOne+diceTwo;
		System.out.println("값 1 = "+diceOne);
		System.out.println("값 2 = "+diceTwo);
		
		boolean c=diceOne==diceTwo;
		
		if(c) {System.out.println("결과 = "+(sum*2));}
		if(!c) {System.out.println("결과 = "+sum);}
		
	}

}
