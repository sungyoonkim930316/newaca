package day03;

import java.util.Random;
import java.util.Scanner;

public class D_16연산자기호 {

	public static void main(String[] args) {

		/*
		[문제]
			1. 1~10 사이의 랜덤 숫자 2개를 x, y 변수에 각각 저장한다.
				예) x = 3, y = 4
			2. 1~4 사이의 랜덤 숫자 1개를 op 변수에 저장한다.
				예) op = 4
			3. op의 값은 연산자 기호에 해당된다.
			   1. +		2. -	3. *	4.%
				예) op의 값이 3이면 곱하기이다.
			4. 화면에 숫자 2개와 답을 출력한다.
			   단, 기호는 출력하면 안된다.
			   예) 3 ? 4 = 12
			       1. +		2. -	3. *
			5. 사용자는 기호를 맞추면 된다.
			   예) 3 ==> 정답
	*/
		Random r=new Random();
		int x=r.nextInt(10)+1;
		int y=r.nextInt(10)+1;
		int op=r.nextInt(4)+1;
		if(op==1) {System.out.printf("%d ? %d = %d\n",x,y,x+y);}
		if(op==2) {System.out.printf("%d ? %d = %d\n",x,y,x-y);}
		if(op==3) {System.out.printf("%d ? %d = %d\n",x,y,x*y);}
		if(op==4) {System.out.printf("%d ? %d = %d\n",x,y,x%y);}
		System.out.println();
		System.out.println("숫자를 입력하여 ?에 알맞는 기호를 입력하세요");
		
		Scanner s=new Scanner(System.in);
		System.out.print("(1 = +, 2 = -, 3 = *, 4 = %) : ");
		int ans=s.nextInt();
		boolean err=ans>4||ans<1;
		if(err) {System.out.println("입력오류");}
		if(!err) {
			if(ans==op) {System.out.println("정답입니다.");}
			if(ans!=op) {
				System.out.println("오답입니다.");
				System.out.println();
				System.out.println("==정답==");
				System.out.println(op);
			}
		}
		
		
		s.close();
		
		// x=2 y=2일때 정답이 4면 ans가 1도 되고 3도 돼야하는데 어떡해야 둘 다 맞게할 수 있는지 찾아볼것
	
	}

}
