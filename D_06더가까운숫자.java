package day02;

import java.util.Scanner;

public class D_06더가까운숫자 {

	public static void main(String[] args) {

		/*
		 * [문제] a 와 c 중 어떤숫자가 b 와 더가까운지 출력하시오. 
		 * [결과] a 가 더 가깝다. c 가 더 가깝다. a 와 c 가 똑같다.
		 * 시작시간 : 
		 * 종료시간 : 
		 */
		int a = 96;
		int b = 100;
		int c = 102;
		
		int gap1=b-a;
		int gap2=c-b;
		
		if (gap1==gap2) {
			System.out.println("a 와 c 가 똑같다.");
		}
		if (gap1<gap2) {
			System.out.println("a가 더 가깝다.");
		}
		if (gap2<gap1) {
			System.out.println("c가 더 가깝다.");
		}

	}

}
