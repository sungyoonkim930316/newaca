package day05;

import java.util.Scanner;

public class D_04소수찾기1단계 {

	public static void main(String[] args) {
		
		/*
		 * # 소수찾기[1단계]
		 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
		 * 2. 예) 2, 3, 5, 7, 11, 13, ..
		 * 3. 힌트
		 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
		 * 2) 나머지가 0일 때마다 카운트를 센다.
		 * 3) 그 카운트 값이 2이면 소수이다.
		 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
		 * 
		 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("판별하고 싶은 숫자를 입력하시오. : ");
		int num=s.nextInt();
		
		int trial=num;
		int cnt=0;
		boolean run=true;
		while(run) {
			if(trial>=1) { 
				if(num%trial==0) {cnt++;}
				trial--;
				continue;
			}
			run=false;
		}
		if(cnt==2) {System.out.println("해당 숫자는 소수입니다.");}
		else {System.out.println("해당 숫자는 소수가 아닙니다.");}
		s.close();
		
//		Scanner sc = new Scanner(System.in);
//
//		while (true) {
//
//			System.out.println("양수 입력 >> [종료 : -100]");
//			int num = sc.nextInt();
//			if(num == -100) {
//				System.out.println("종료");
//				break;
//			}
//			if(num <= 1) {
//				System.out.println("입력 오류 ");
//				continue;
//			}
//			
//			int count = 0;
//
//			int i = 1;
//			while (i <= num) {
//				System.out.printf("%d/%d ", num, i);
//				if (num % i == 0) {
//					count++;
//				}
//				i++;
//			}
//			System.out.println(" cnt =" + count);
//			// System.out.println("count=" + count);
//			if (count == 2) {
//				System.out.println("소수입니다");
//			} else {
//				System.out.println("소수가 아닙니다");
//			}
		
	}

}
