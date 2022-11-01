package day03;

import java.util.Random;
import java.util.Scanner;

public class D_13구구단 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 1. 구구단 문제를 출제하기 위해 정수 2개를 랜덤하게 저장한다. 
		 * 2. 구구단 문제를 출력한다. 
		 * 예) 3 x 7 = ? 
		 * 3. 문제에 해당하는 정답을 입력받는다. 
		 * 4. 정답을 비교해 "정답" 또는 "오답"을 출력한다.
		 * 
		 * 2~9단까지
		 * 2*1 ~2*9 1~9까지 곱
		 */
		
		Random r=new Random();
		int firstRanNum=r.nextInt(8)+2;
		int secondRanNum=r.nextInt(9)+1;
		System.out.printf("%d x %d = ?\n",firstRanNum,secondRanNum);
		
		Scanner s=new Scanner(System.in);
		int ans=s.nextInt();
		boolean err=ans<2||ans>81;
		if (err) {System.out.println("입력오류");}
		if (!err) {
			int mult=firstRanNum*secondRanNum;
			if (mult==ans) {System.out.println("정답");}
			if (mult!=ans) {System.out.println("오답");}
		}
		s.close();
	}

}
