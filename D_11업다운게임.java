package day03;

import java.util.Random;
import java.util.Scanner;

public class D_11���ٿ���� {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * 1. 10-60 ������ �������� com�� ���� 
		 * 2. ����ڿ��� �� �Է� �ޱ� 
		 * 3. ����ڰ� �Է��� ���� com ���� ũ�� down
		 * ����ڰ� �Է��� ���� com ���� ������ up ���߸� bingo!
		 */
		
		Random r=new Random();
		int com=r.nextInt(51)+10;
		System.out.printf("���Ѳ� ��ȣ�� : %d\n",com);
		Scanner s=new Scanner(System.in);
		System.out.print("10~60������ ������ �Է��ϼ��� : ");
		int userNum=s.nextInt();
		boolean err=userNum<10||userNum>60;
		if (err) {System.out.println("�Է¿���");}
		if (!err) {
			if (com>userNum) {System.out.println("up");}
			if (com<userNum) {System.out.println("down");}
			if (com==userNum) {System.out.println("bingo");}
		}
		s.close();
	}

}
