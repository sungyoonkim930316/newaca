package day03;

import java.util.Scanner;

public class D_05���������� {

	public static void main(String[] args) {

		/*
		 * [����] ����(0) ����(1) ��(2) ���� 
		 * 1. player1�� 0~2 ������ ���ڸ� �Է¹޴´�. 
		 * 2. player2�� 0~2 ������ ���ڸ� �Է¹޴´�. 
		 * 3. ����, ����, ���� 0, 1, 2, ���ڷ� ��� ǥ���Ѵ�. 
		 * 4. player1�� player2�� ���ؼ� "���", "�¸�", "�й�"�� ����Ѵ�.
		 */
		
//		Scanner s=new Scanner(System.in);
//		System.out.print("����(0) ����(1) ��(2) player1 : ");
//		int playerOne=s.nextInt();
//		System.out.print("����(0) ����(1) ��(2) player2 : ");
//		int playerTwo=s.nextInt();
//		
//		boolean err=playerOne>2||playerOne<0||playerTwo>2||playerTwo<0;
//		
//		if (!err) {
//			if(playerOne==playerTwo) {System.out.println("player1 ���");}
//			if(playerOne==2&&playerTwo==0) {System.out.println("player1 �й�");}
//			if(playerOne==2&&playerTwo==1) {System.out.println("player1 �¸�");}
//			if(playerOne==1&&playerTwo==2) {System.out.println("player1 �й�");}
//			if(playerOne==1&&playerTwo==0) {System.out.println("player1 �¸�");}
//			if(playerOne==0&&playerTwo==1) {System.out.println("player1 �й�");}
//			if(playerOne==0&&playerTwo==2) {System.out.println("player1 �¸�");}
//		}
//		if (err) {System.out.println("�Է¿���");}
//		
//		s.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" P1 ����(0) ����(1) ��(2) ");
		int p1 = sc.nextInt();
		if(p1!=0&&p1!=1&&p1!=2) {System.out.println("�Է¿���");}
		System.out.println(" P2 ����(0) ����(1) ��(2) ");
		int p2 = sc.nextInt();
		if(p2!=0&&p2!=1&&p2!=2) {System.out.println("�Է¿���");}

		int win = 0; // 0 ��� 1 p1�¸� 2 p2�¸�

		if (p1 != p2) {
       // ����� �ʴ� ���� �� p1 �¸��� p2 �¸� �� �� �Ѱ� 
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
			System.out.println("���");
		}
		if (win == 1) {
			System.out.println("p1 �¸�");
		}
		if (win == 2) {
			System.out.println("p2 �¸�");
		}
		sc.close();

	}

}
