package day02;

import java.util.Scanner;

public class D_03_4의배수 {

	public static void main(String[] args) {

		/*
		 * [문제] 정수를 입력받아 그 숫자의 값이 4의 배수인지를 확인해 "4의 배수입니다." 또는 "4의 배수가 아닙니다."를 출력하시오.
		 * 시작시간 : 16:47
		 * 종료시간 : 16:49
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num=s.nextInt();
		boolean check=num%4==0;
		
		if (check) {
			System.out.println("해당 정수는 4의 배수입니다.");
		}
		
		if (!check) {
			System.out.println("해당 정수는 4의 배수가 아닙니다.");
		}
		
		s.close();

	}

}
