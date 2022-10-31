package day02;

import java.util.Scanner;

public class C_07입력문제1 {

	public static void main(String[] args) {

		/*
		 * [문제] 숫자 2개를 입력받고, 그 합을 구하시오. 예) 3, 5 ==> 8
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("숫자 1 >> ");
		int num1 = s.nextInt();
		System.out.println("숫자 2 >> ");
		int num2 = s.nextInt();

		System.out.printf("두 숫자의 합은 = %d\n", num1 + num2);
		s.close();

	}

}
