package day03;

import java.util.Scanner;

public class D_07������ {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * 1. �޴����� ����Ѵ�. 
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�. 
		 * ��, 1-3 �ƴ� ��ȣ�� �Է��ϸ� �Է¿��� ���
		 * 3. ������ �Է¹޴´�. 
		 * 4. �Է¹��� ���ݰ� �޴������� Ȯ���� �������� ����Ѵ�. 
		 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */
		
//		int price1 = 8700;
//		int price2 = 6200;
//		int price3 = 1500;
//		
//		System.out.println("=== �Ե����� ===");
//		System.out.println("1.�Ұ����� : " + price1 + "��");
//		System.out.println("2.������� : " + price2 + "��");
//		System.out.println("3.�ݶ� : " + price3 + "��");
//		System.out.println();
//		
//		Scanner s=new Scanner(System.in);
//		System.out.print("���Ͻô� �޴��� ��ȣ�� �Է��ϼ���. : ");
//		int menu=s.nextInt();
//		if(menu!=1&&menu!=2&&menu!=3) {System.out.println("�Է¿���");}
//		System.out.print("�����Ͻ� ����(��)�� �Է��ϼ���. : ");
//		int orderPrice=s.nextInt();
//		if(orderPrice<0) {System.out.println("�Է¿���");}
//		System.out.println();
//		
//		boolean c=orderPrice==price1||orderPrice==price2||orderPrice==price3;
//		
//		if(c) {
//			System.out.println("=== ������ ===");
//			System.out.println("�ֹ��Ͻ� �޴� ��ȣ : "+menu);
//			System.out.println("�����Ͻ� �ݾ� : "+orderPrice);
//		}
//		if(!c) {
//			if(orderPrice<price1||orderPrice<price2||orderPrice<price3) {System.out.println("������ �����մϴ�.");}
//			if(orderPrice>price1||orderPrice>price2||orderPrice>price3) {System.out.println("�Ž������� �޾��ּ���.");}
//		}
//		s.close();
		
		/*
		 * [����] 1. �޴����� ����Ѵ�. 
		 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�. 
		 * �� 1-3 �ƴ� ��ȣ�� �Է��ϸ� �Է� ���� ���
		 * 
		 * 3. ������ �Է¹޴´�.
		 *  4. �Է¹��� ���ݰ� �޴������� Ȯ���� �������� ����Ѵ�.
		 *   5. ��, ������ ������ ���
		 * "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int price = 0;

		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����   ���� : " + price2 + "��");
		System.out.println("3.��      �� : " + price3 + "��");

		System.out.print("�޴� ��ȣ >> ");
		int menu = sc.nextInt();
		boolean error = menu > 3 || menu < 1;
		if (error) {
			System.out.println("�Է� ����: 1,2,3 �� �Է�");
		}
		if (!error) {
			System.out.print("���� >> ");
			int money = sc.nextInt();
			boolean cashErr = false;
			if(menu == 1) {
				price = price1;
			}
			if(menu == 2) {
				price = price2;
			}
			if(menu == 3) {
				price = price3;
			}
			
			if(money < price) {
				cashErr = true;
			}
			if(cashErr) {
				System.out.println("������ �����մϴ�.");
			}
			if(!cashErr) {
				System.out.println("==== ������ ==== ");
				System.out.println("��  �� " + price + " ��");
				System.out.println("��  �� " + money +" ��");
				System.out.println("��  �� " + (money-price) + " ��");
			}
			

		}
		
		
	}

}
