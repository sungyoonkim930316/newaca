package day02;

import java.util.Scanner;

public class D_07���ٿ� {

	public static void main(String[] args) {

		/*
		 * [����] Up & Down ���� 
		 * 1. com�� 8�̴�. 
		 * 2. me�� ���� �ϳ��� �Է��Ѵ�. 
		 * 3. com�� me�� ���� ������ ����
		 * �޼����� ����Ѵ�. 
		 * 1) me < com : Up! 
		 * 2) me > com : Down! 
		 * 3) me == com : Bingo!
		 * ���۽ð� : 17:45
		 * ����ð� : 17:48
		 */

		Scanner s=new Scanner(System.in);
		
		int com=8;
		
		System.out.println("===���ٿ����===");
		System.out.print("���ڸ� ���纸���� : ");
		int me=s.nextInt();
		if(me>com) {
			System.out.println("Down!");
		}
		if(me<com) {
			System.out.println("Up!");
		}
		if(me==com) {
			System.out.println("Bingo!");
		}
		s.close();
	}

}
