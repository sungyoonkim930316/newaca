package day03;

import java.util.Random;
import java.util.Scanner;

public class D_10Ȧ¦���� {

	public static void main(String[] args) {

		/*
		 * [����]
			1. 1~10 ������ ���� �� �������� �� ���� ���ڸ� �����Ѵ�. 
			2. ���� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
			3. ����ڿ��� 1.Ȧ�� 2.¦��
			4. �����! Ʋ�ȴ�! ���
		 */
		
//		Random r=new Random();
//		int randomNum=r.nextInt(10)+1;
//		System.out.printf("�־��� ���� �ѹ��� : %d�Դϴ�!\n",randomNum);
//		Scanner s=new Scanner(System.in);
//		System.out.print("Ȧ¦�� ���纸����, Ȧ�� -> 1�Է� / ¦�� -> 2�Է� : ");
//		int userNum=s.nextInt();
//		boolean err=userNum<1||userNum>2;
//		if (err) {System.out.println("�Է¿���");}
//		if (!err) {
//			if(userNum==1) {
//				if(randomNum%2==0) {System.out.println("Ʋ�ȴ�!");}
//				if(randomNum%2==1) {System.out.println("�����!");}
//			}
//			if(userNum==2) {
//				if(randomNum%2==0) {System.out.println("�����!");}
//				if(randomNum%2==1) {System.out.println("Ʋ�ȴ�!");}
//			}
//		}
//		s.close();
		
		Random r=new Random();
		int randomNum=r.nextInt(10)+1;
		System.out.printf("�־��� ���� �ѹ��� : %d�Դϴ�!\n",randomNum);
		Scanner s=new Scanner(System.in);
		System.out.print("Ȧ¦�� ���纸����, Ȧ�� -> 1�Է� / ¦�� -> 2�Է� : ");
		int userNum=s.nextInt();
		boolean err=userNum<1||userNum>2;
		if (err) {System.out.println("�Է¿���");}
		if (!err) {
			if(userNum==1) {
				if(randomNum%2==0) {System.out.println("Ʋ�ȴ�!");}
				if(randomNum%2==1) {System.out.println("�����!");}
			}
			if(userNum==2) {
				if(randomNum%2==0) {System.out.println("�����!");}
				if(randomNum%2==1) {System.out.println("Ʋ�ȴ�!");}
			}
		}
		s.close();

	}

}
