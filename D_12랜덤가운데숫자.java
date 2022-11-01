package day03;

import java.util.Random;
import java.util.Scanner;

public class D_12랜덤가운데숫자 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 1. 159 ~ 300 사이의 랜덤 숫자를 저장한다. 
		 * 2. 랜덤값의 가운데 숫자를 입력 : 
		 * 3. 랜덤 숫자의 가운데 숫자를 직접 입력하여 맞추는 게임이다. 
		 * 예) 249 => 4
		 */
		
		Random r=new Random();
		int ranNum=r.nextInt(142)+159;
		System.out.printf("랜덤숫자 : %d\n",ranNum);
		Scanner s=new Scanner(System.in);
		System.out.print("랜덤숫자의 가운데 숫자를 맞춰보세요 : ");
		int userNum=s.nextInt();
		boolean err1=userNum>9||userNum<0;
		if (err1) {System.out.println("입력오류");}
		if (!err1) {
			int middleNum=(ranNum%100)/10;
			if (middleNum==userNum) {System.out.println("정답");}
			if (middleNum!=userNum) {System.out.println("오답");}
		}
		s.close();
	}

}
