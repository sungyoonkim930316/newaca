package day03;

import java.util.Scanner;

public class D_06최대값 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 1. 숫자 3개를 입력받는다. 
		 * 2. 입력받은 3개의 숫자를 비교한다. 
		 * 3. 가낭 큰 수(max)를 출력한다.
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.println("서로 다른 3개의 정수를 입력하세요 : ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
//		System.out.println("정수1 : ");
//		int num1=s.nextInt();
//		System.out.println("정수2 : ");
//		int num2=s.nextInt();
//		System.out.println("정수3 : ");
//		int num3=s.nextInt();
		
//		boolean err=num1==num2||num1==num3||num2==num3;
//		int max=num1;
//		if(max<num2) {
//			max=num2;
//		}
//		if(max<num3) {
//			max=num3;
//		}
//		
//		if(err) {System.out.println("입력오류");}
//		if(!err) {System.out.println("가장 큰 수는 "+max+"입니다.");}
		
		boolean err=num1==num2||num1==num3||num2==num3;
		int min=num1;
		if(min>num2) {
			if(num2>num3) {min=num3;}
			min=num2;
		}
		if(min>num3) {
			if(num3>num2) {min=num2;}
			min=num3;
		}
		
		if(err) {System.out.println("입력오류");}
		if(!err) {System.out.println("가장 작은 수는 "+min+"입니다.");}
		
		s.close();

	}

}
