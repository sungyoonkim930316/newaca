package day03;

import java.util.Random;

public class D_15랜덤369 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 1. 1~50 사이의 랜덤 숫자를 저장한다. 
		 * 2. 랜덤 숫자 중에서 3이나 6이나 9의 개수가 2개면, 짝짝을 출력한다. 
		 * 3. 랜덤 숫자 중에서 3이나 6이나 9의 개수가 1개면, 짝을 출력한다. 
		 * 4. 랜덤 숫자 중에서 3이나 6이나 9의 개수가 0이면, 해당 숫자를 출력한다. 
		 * 예) 33 => 짝짝 16 => 짝 7 => 7
		 */
		
//		Random r=new Random();
//		int num=r.nextInt(50)+1;
//		System.out.println("랜덤숫자 : "+num);
//		boolean check1=num==3||num==6||num==9;
//		
//		if(num<10) {
//			if(check1) {System.out.println("결과 : 짝");}
//			if(!check1) {System.out.println("결과 : "+num);}
//		}
//		if(num>=10) {
//			boolean check2=num%10==3||num%10==6||num%10==9;
//			if(num/10==3) {
//				if(check2) {System.out.println("결과 : 짝짝");}
//				if(!check2) {System.out.println("결과 : 짝");}
//			}
//			if(num/10!=3) {
//				if(check2) {System.out.println("결과 : 짝");}
//				if(!check2) {System.out.println("결과 : "+num);}
//			}
//		}
		
		Random r=new Random();
		//int num=r.nextInt(50)+1;
		int num = 31;
		System.out.println("랜덤숫자 : "+num);
		
		int rsTens=num/10;
		int rsUnits=num%10;
		
		boolean tensCheck=rsTens==3;
		boolean unitsCheck=rsUnits==3||rsUnits==6||rsUnits==9;
		
		if(unitsCheck) {
			if(tensCheck) {System.out.println("결과 : 짝짝");}
			if(!tensCheck) {System.out.println("결과 : 짝");}
		}
		if(!unitsCheck) {
			System.out.println("결과 : "+num);
		}
		
		
	}
}
