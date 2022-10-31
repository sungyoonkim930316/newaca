package day02;

import java.util.Scanner;

public class D_04구구단 {

	public static void main(String[] args) {

		/*
		 * [문제] 구구단 게임 
		 * 1. 구구단 문제를 출제하기 위해 숫자 2개를 입력받는다. 
		 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다. 
		 * 예) 3 x 7 = ? 
		 * 3. 문제에 해당하는 정답을 입력받는다. 
		 * 4. 정답을 비교해 "정답" 또는 "오답"을 출력한다.
		 * 
		 * 시작시간 : 16:57
		 * 종료시간 : 17:00
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1=s.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2=s.nextInt();
		
		System.out.printf("%d x %d = ?",num1,num2);
		System.out.println();
		System.out.print("정답을 입력하세요 : ");
		int ans=s.nextInt();
		boolean check=ans==num1*num2;
		
		if (check) { 
			System.out.println("정답");
		}
		if (!check) {
			System.out.println("오답");
		}
		s.close();

	}

}
