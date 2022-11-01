package day03;

import java.util.Scanner;

public class D_05가위바위보 {

	public static void main(String[] args) {

		/*
		 * [문제] 가위(0) 바위(1) 보(2) 게임 
		 * 1. player1은 0~2 사이의 숫자를 입력받는다. 
		 * 2. player2는 0~2 사이의 숫자를 입력받는다. 
		 * 3. 가위, 바위, 보를 0, 1, 2, 숫자로 대신 표현한다. 
		 * 4. player1과 player2를 비교해서 "비김", "승리", "패배"를 출력한다.
		 */
		
//		Scanner s=new Scanner(System.in);
//		System.out.print("가위(0) 바위(1) 보(2) player1 : ");
//		int playerOne=s.nextInt();
//		System.out.print("가위(0) 바위(1) 보(2) player2 : ");
//		int playerTwo=s.nextInt();
//		
//		boolean err=playerOne>2||playerOne<0||playerTwo>2||playerTwo<0;
//		
//		if (!err) {
//			if(playerOne==playerTwo) {System.out.println("player1 비김");}
//			if(playerOne==2&&playerTwo==0) {System.out.println("player1 패배");}
//			if(playerOne==2&&playerTwo==1) {System.out.println("player1 승리");}
//			if(playerOne==1&&playerTwo==2) {System.out.println("player1 패배");}
//			if(playerOne==1&&playerTwo==0) {System.out.println("player1 승리");}
//			if(playerOne==0&&playerTwo==1) {System.out.println("player1 패배");}
//			if(playerOne==0&&playerTwo==2) {System.out.println("player1 승리");}
//		}
//		if (err) {System.out.println("입력오류");}
//		
//		s.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" P1 가위(0) 바위(1) 보(2) ");
		int p1 = sc.nextInt();
		if(p1!=0&&p1!=1&&p1!=2) {System.out.println("입력오류");}
		System.out.println(" P2 가위(0) 바위(1) 보(2) ");
		int p2 = sc.nextInt();
		if(p2!=0&&p2!=1&&p2!=2) {System.out.println("입력오류");}

		int win = 0; // 0 비김 1 p1승리 2 p2승리

		if (p1 != p2) {
       // 비기지 않는 조건 즉 p1 승리나 p2 승리 둘 중 한개 
			win = 2;
			
			if ((p1 == 0 && p2 == 2)||(p1 == 1 && p2 == 0) || (p1 == 2 && p2 == 1)  ) {
				win = 1;
			}
//			if (p1 == 1 && p2 == 0) {
//				win = 1;
//			}
//			if (p1 == 2 && p2 == 1) {
//				win = 1;
//			}


		}

		if (win == 0) {
			System.out.println("비김");
		}
		if (win == 1) {
			System.out.println("p1 승리");
		}
		if (win == 2) {
			System.out.println("p2 승리");
		}
		sc.close();

	}

}
