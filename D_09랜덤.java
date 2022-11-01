package day03;

import java.util.Random;

public class D_09랜덤 {

	public static void main(String[] args) {

		Random r=new Random();
		int randomNum = r.nextInt(); // 무작위의 정수범위에 있는 값 1개를 가져온다.
		
		System.out.println("무작위 정수 1개 : "+randomNum);
		
		// 0~2 0 1 2
					// 무조건 시작범위는 0
					// nextInt(랜덤값 갯수)
		int player1=r.nextInt(3); // 0 1 2
		System.out.println(player1);
		
		// 1~10
		int num=r.nextInt(10)+1; // 이 문장의 맨 뒤에 있는 +1은 시작값이라고 생각하면 좋다.
		System.out.println(num);
		
		// -3~3
		int num2=r.nextInt(7)-3;
		System.out.println(num2);
		
		// 150~250
		int num3=r.nextInt(101)+150;
		System.out.println(num3);
		
	}

}
