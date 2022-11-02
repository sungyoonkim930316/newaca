package day04;

import java.util.Scanner;

public class D_04ATM {

	public static void main(String[] args) {

		/*
		 * [����] ATM ��� �� �α��� ����� �����Ѵ�.
		 * 
		 * 1. ���� ���� 
		 * cash : �������ִ� ���� 
		 * balance : ���� 
		 * joinId : ������ ���̵� 
		 * joinPw : ������ �н�����
		 * 
		 * 2. ��ɼ��� 
		 * 1) ���� �޴� ���� [1.�α��� 0.����] 
		 * 2) �α����� ������ ���, ���̵�� ��й�ȣ�� �Է¹ް� �����ϸ�
		 * "�α��� ����" �޼����� ����ϰ� [1.�Ա� 2.���]�� ���ο� �޴��� ����
		 * 
		 * 2-1) �Ա��� ������ ��� �Ա��� ���� �Է¹ް� ������ �پ��� ������ �þ��. 2-2) ����� ������ ��� ����� ���� �Է¹ް�
		 * ������ �پ��� ������ �þ��.
		 * 
		 * 3) �α��ο� ������ ��� "�α��� ����" �޼��� ���
		 */
		Scanner scan = new Scanner(System.in);

		int cash = 20000;
		int balance = 30000;

		int joinId = 1111;
		int joinPw = 1234;

		System.out.println("=== [ATM] ===");
		System.out.println("[1.�α��� 0.����]");

		int select = scan.nextInt();
		boolean inputErr=select>1||select<0;

		if(!inputErr) {
			if (select == 1) {
				System.out.print("���̵� �Է� : ");
				int loginId=scan.nextInt();
				if(loginId==joinId) {
					System.out.print("��й�ȣ�� �Է� : ");
					int loginPw=scan.nextInt();
					if(loginPw==joinPw) {
						System.out.println("�α��� ����");
						System.out.println("-------------");
						System.out.println("[1.�Ա� 2.���]");
						int mainMenu=scan.nextInt();
						boolean menuErr=mainMenu>2||mainMenu<1;
						if(!menuErr) {
							if (mainMenu==1) {
								System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
								int plus=scan.nextInt();
								if(plus<=cash) {
									cash-=plus;
									balance+=plus;
									System.out.println(plus+"���� �ԱݵǾ����ϴ�. ���� : "+(balance)+"��");
									System.out.println("���� ���� : "+(cash)+"��");
								}
								else {System.out.println("���������� �����մϴ�. ���α׷��� �����մϴ�.");}
							} else if (mainMenu==2) {
								System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� : ");
								int minus=scan.nextInt();
								if(minus<=balance) {
									cash+=minus;
									balance-=minus;
									System.out.println(minus+"���� ��ݵǾ����ϴ�. ���� : "+(balance)+"��");
									System.out.println("���� ���� : "+(cash)+"��");
								}
								else {System.out.println("�ܾ��� �����մϴ�. ���α׷��� �����մϴ�.");}
							}
						} else {System.out.println("�Է¿���");}
					} else {System.out.println("��й�ȣ�� �߸��Է��ϼ̽��ϴ�, �α��ν���.");}
				} else {System.out.println("�������� �ʴ� ���̵��Դϴ�, �α��ν���.");}
				
			} else if (select == 0) {System.out.println("���α׷��� �����մϴ�.");}
		} else {System.out.println("�Է¿���");}
		scan.close();
		System.out.printf("[ ���� : %d ���� : %d ]", cash,balance);

	}

}
