package day04;

import java.util.Random;

public class D_03연속짝수복권 {

	public static void main(String[] args) {

		/*
		[학습목표]
			랜덤을 활용해서 조건문을 학습한다.
		[문제]
		[연속짝수복권]
			100~900 사이의 랜덤숫자를 출력한다. 
			세자리의 숫자를 전부 한자리씩 분리한다.		
		[규칙]
			[1] 세자리모두 짝수이면 "1등"을 출력한다.
			[2] 두자리가 짝수이고, 짝수인숫자가 연속이면 "2등"을 출력한다. 
			[3] 그외는 "꽝"을 출력한다. 
			[4] 단, 0은 짝수이다.
		[예시]
			462 : 4,6,2 세자리 모두 짝수이므로 "1등"
			245 : 2,4,5 두자리가 짝수이고 2,4연속이므로 "2등"
			456 : 4,5,6 두자리가 짝수이지만 연속이 아니므로 "꽝"
			782 : 7,8,2 두자리가 짝수이고 8,2연속이므로 "2등" 	
		 */
		
		Random r=new Random();
		int num=r.nextInt(801)+100;
		int hundreds=num/100;
		int tens=(num%100)/10;
		int units=num%10;
		System.out.println("랜덤숫자 : "+num);
		boolean check1=hundreds%2==0&&tens%2==0;
		boolean check2=tens%2==0&&units%2==0;
		
		if(check1&&check2) {System.out.println("1등");}
		else if(check1||check2) {System.out.println("2등");}
		else {System.out.println("꽝");}
		
	}

}
