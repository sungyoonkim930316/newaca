package day05;

import java.util.Random;
import java.util.Scanner;

public class D_03업다운 {

	public static void main(String[] args) {

		/*
		 * # Up & Down 게임[2단계] 
		 * 1. com 은 랜덤으로 1~100사이를 저장한다. 
		 * 2. me 는 1~100사이를 입력한다. 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다. 
		 * 5. 한번에 맞추면 100점 1번씩 틀릴때마다 20점 감점된다 
		 * 6. 5번 틀리면 게임오버 / 맞추면 최종 점수 출력
		 */
		
		Random r=new Random();
		
		int com=r.nextInt(50)+1;
		//System.out.println("병뚜껑 넘버 : "+com);
		
		Scanner s=new Scanner(System.in);
		int me=1;
		int score=100;
		
		int trial=1;
		while(trial<=5) {
			System.out.print("숫자를 맞춰보세요 : ");
			me=s.nextInt();
			boolean err=me>50||me<1;
			if(!err) {
				trial++;
				if(me>com) {System.out.println("크다.");score-=20;continue;}
				if(me<com) {System.out.println("작다.");score-=20;continue;}
				else {System.out.println("bingo. 당신의 점수는 : "+score+"점");break;}
			}
			System.out.println("입력오류");continue;
		}
		if(trial==6) {System.out.println("게임오버");System.out.println("정답 : "+com);}
		s.close();
		
//		Random rd = new Random();
//		Scanner sc = new Scanner(System.in);
//		
//		int com = rd.nextInt(100)+1;
//		int score = 100;
//		
//		System.out.println(" [ 게임 시작 ] " + com);
//		while (true) {
//			System.out.print("입력 >>");
//			int me = sc.nextInt();
//
//			if (me < 1 || me > 100) {
//				System.out.println("입력 오류 : 1 - 100 ");
//			} else {
//
//				if (score == 0) {
//					System.out.println("[ 게임 오버 ]");
//					break;
//				}
//				
//				if (me == com) {
//					System.out.println("[ 빙 고 ]!!");
//					System.out.printf("[ 당신의 점수 %d 점] \n", score);
//					break;
//					
//				} else if(me < com) {
//					System.out.println("[ Up ]!!");
//					score-=20;
//				}else {
//					System.out.println("[ Down ]!!");
//					score-=20;
//				}
//			}
//		}
	}
}
