package day04;
import java.util.Random;
import java.util.Scanner;

public class F_12구구단3단계 {

	public static void main(String[] args) {

		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */
		
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int trial=1;
		int score=0;
		
		while(trial<=5) {
			int randomNum1=r.nextInt(8)+2;
			int randomNum2=r.nextInt(9)+1;
			int ans=randomNum1*randomNum2;
			
			System.out.println("==구구단 맞추기 게임==");
			System.out.printf("[%d] %d x %d = ",trial,randomNum1,randomNum2);
			int userNum=s.nextInt();
			boolean check=userNum==ans;
			
			if(check) {System.out.println("정답입니다. +20점");score+=20;System.out.println("현재 점수 : "+score+"점");System.out.println("=================");System.out.println();}
			else {System.out.println("틀렸습니다. +0점");score+=0;System.out.println("현재 점수 : "+score+"점");System.out.println("=================");System.out.println();}
			trial++;
		}
		System.out.println("최종점수 : "+score+"점");
		s.close();
	}

}
