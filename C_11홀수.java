package day02;

import java.util.Scanner;

public class C_11홀수 {

	public static void main(String[] Args) {

		/*
		 * [문제] 숫자 2개를 입력받는다. 그 숫자의 합이 홀수인지 여부를 판단해 true 또는 false로 표현하시오. 시작시간 : 15:52
		 * 종료시간 : 15:54
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = s.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = s.nextInt();

		boolean check = (num1 + num2) % 2 == 1;
		System.out.println(check);
		s.close();

	}

}
