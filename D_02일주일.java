package day04;

import java.util.Random;

public class D_02������ {

	public static void main(String[] args) {

		/*
		 * 0 �� 1ȭ 2�� 3�� 4�� 5�� 6�� 
		 * [����] 
		 * 2023�� 03�� �̹��� 1���� �������̶�� �� �� �������� 1 ~ 31�� �����ϰ� �ش� ������ ����Ͻÿ�.
		 * 
		 * ��) 3�� ==> �ݿ���
		 * 
		 * 16�� ==> �����
		 */
		
//		Random r=new Random();
//		int day=r.nextInt(31)+1;
//		System.out.println(day+"���� ���������ΰ���?");
//		
//		if (day==1||day==8||day==15||day==22||day==29) {System.out.println("������");} 
//		else if (day==2||day==9||day==16||day==23||day==30) {System.out.println("�����");}
//		else if (day==3||day==10||day==17||day==24||day==31) {System.out.println("�ݿ���");}
//		else if (day==4||day==11||day==18||day==25) {System.out.println("�����");}
//		else if (day==5||day==12||day==19||day==26) {System.out.println("�Ͽ���");}
//		else if (day==6||day==13||day==20||day==27) {System.out.println("������");}
//		else {System.out.println("ȭ����");}
		
//		int day = 1;
//		int week = 2; // ������
		
		Random rd = new Random();
		int day = rd.nextInt(31)+1; // 4  // 1 -31
		int week = (day+1) % 7; // ������ (0 - 6) + 1  (1- 7)
		
		System.out.print("Day " + day +" : ");
		if(week == 0) {
			System.out.println("������");
		}else if(week == 1) {
			System.out.println("ȭ����");
		}else if(week == 2) {
			System.out.println("������");
		}else if(week == 3) {
			System.out.println("�����");
		}else if(week == 4) {
			System.out.println("�ݿ���");
		}else if(week == 5) {
			System.out.println("�����");
		}else{
			System.out.println("�Ͽ���");
		}
		
		
	}

}
