package day03;

import java.util.Random;
import java.util.Scanner;

public class D_12����������� {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * 1. 159 ~ 300 ������ ���� ���ڸ� �����Ѵ�. 
		 * 2. �������� ��� ���ڸ� �Է� : 
		 * 3. ���� ������ ��� ���ڸ� ���� �Է��Ͽ� ���ߴ� �����̴�. 
		 * ��) 249 => 4
		 */
		
		Random r=new Random();
		int ranNum=r.nextInt(142)+159;
		System.out.printf("�������� : %d\n",ranNum);
		Scanner s=new Scanner(System.in);
		System.out.print("���������� ��� ���ڸ� ���纸���� : ");
		int userNum=s.nextInt();
		boolean err1=userNum>9||userNum<0;
		if (err1) {System.out.println("�Է¿���");}
		if (!err1) {
			int middleNum=(ranNum%100)/10;
			if (middleNum==userNum) {System.out.println("����");}
			if (middleNum!=userNum) {System.out.println("����");}
		}
		s.close();
	}

}
