package day03;

import java.util.Scanner;

public class D_08택시요금 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 택시 기본요금은 10,000원이다. 기본 요금으로 10km까지 이동할 수 있다. 10km이상 이동 시 추가요금이 발생한다.
		 * 추가요금은 3km를 이동할 때마다 2,300원씩 요금이 추가된다. 이동거리를 입력받고 요금을 출력하시오.
		 * 
		 * 예) 8km => 10,000원 11km => 12,300원 16km => 14,600원
		 * 
		 * 단 사용자에게 이동거리를 입력받을 때 0km이하 값을 입력받으면 입력 오류 출력
		 */

		Scanner s=new Scanner(System.in);
		int base=10000;
		
		System.out.print("이동한 거리(km)는 ... : ");
		int distance=s.nextInt();
		boolean err=distance<=0;
		if(err) {System.out.println("입력오류");}
		if(!err) {
			if(distance<=10) {System.out.println("요금 : "+base+"원");}
			if(distance>10&&distance<=13) {System.out.printf("요금 : %d원\n",base+2300);}
			if(distance>13) {
				int add=((distance-10)/3)*2300;
				int money=base+add;
				System.out.println("요금 : "+money+"원");
			}
		}
		s.close();
		
		
	}

}
