package day03;

import java.util.Random;

public class D_15����369 {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�. 
		 * 2. ���� ���� �߿��� 3�̳� 6�̳� 9�� ������ 2����, ¦¦�� ����Ѵ�. 
		 * 3. ���� ���� �߿��� 3�̳� 6�̳� 9�� ������ 1����, ¦�� ����Ѵ�. 
		 * 4. ���� ���� �߿��� 3�̳� 6�̳� 9�� ������ 0�̸�, �ش� ���ڸ� ����Ѵ�. 
		 * ��) 33 => ¦¦ 16 => ¦ 7 => 7
		 */
		
//		Random r=new Random();
//		int num=r.nextInt(50)+1;
//		System.out.println("�������� : "+num);
//		boolean check1=num==3||num==6||num==9;
//		
//		if(num<10) {
//			if(check1) {System.out.println("��� : ¦");}
//			if(!check1) {System.out.println("��� : "+num);}
//		}
//		if(num>=10) {
//			boolean check2=num%10==3||num%10==6||num%10==9;
//			if(num/10==3) {
//				if(check2) {System.out.println("��� : ¦¦");}
//				if(!check2) {System.out.println("��� : ¦");}
//			}
//			if(num/10!=3) {
//				if(check2) {System.out.println("��� : ¦");}
//				if(!check2) {System.out.println("��� : "+num);}
//			}
//		}
		
		Random r=new Random();
		//int num=r.nextInt(50)+1;
		int num = 31;
		System.out.println("�������� : "+num);
		
		int rsTens=num/10;
		int rsUnits=num%10;
		
		boolean tensCheck=rsTens==3;
		boolean unitsCheck=rsUnits==3||rsUnits==6||rsUnits==9;
		
		if(unitsCheck) {
			if(tensCheck) {System.out.println("��� : ¦¦");}
			if(!tensCheck) {System.out.println("��� : ¦");}
		}
		if(!unitsCheck) {
			System.out.println("��� : "+num);
		}
		
		
	}
}
