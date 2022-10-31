package day02;

import java.util.Scanner;

public class D_05더큰숫자 {

	public static void main(String[] args) {

		/*
		 * [문제] 정수 2개를 입력받고, 더 큰 숫자의 값을 출력하시오.
		 * 
		 * 예) 숫자1 입력 : 숫자2 입력 : 더 큰 숫자는 ? 입니다.
		 * 단, 두 숫자가 같으면 동일한 숫자입니다. 출력
		 * 시작시간 : 17:12
		 * 종료시간 : 
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1=s.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2=s.nextInt();
		
		if (num1>num2) {
			System.out.printf("더 큰 숫자는 %d입니다\n",num1);
		}
		if (num1<num2) {
			System.out.printf("더 큰 숫자는 %d입니다\n",num2);
		}
		if (num1==num2) {
			System.out.println("동일한 숫자입니다.");
		}
		
		s.close();

	}

}
