package day05;

import java.util.Scanner;

public class D_09ATM2�ܰ� {

	public static void main(String[] args) {

		/*
		 * # ATM 2�ܰ� 
		 * 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 
		 * 2. �α׾ƿ� . �α��� �� �̿밡��
		 */
		
		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		int id = 0;
		int pw = 0;

		int log = -1; // -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)

		boolean run = true;
		while (run) {

			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				// �α���
//			       if(dbAcc1 == id && dbPw1 == pw ||dbAcc2 == id && dbPw2 == pw ) {
//			         System.out.println("�̹� �α����� ���� ");
//			        }

				// ���� ��ſ� �̷��� log �� Ȱ���� �� �ִ�.
				if (log != -1) {
					System.out.println("�̹� �α����� ����");
					continue;
				}
				// log == -1
				System.out.println("id >> ");
				id = scan.nextInt();
				System.out.println("pw >> ");
				pw = scan.nextInt();

				if (id == dbAcc1 && pw == dbPw1) {
					System.out.println("dbAcc1�� �α��� ���� ");
					log = 1;
				} else if(id == dbAcc2 && pw == dbPw2) {
					System.out.println("dbAcc2�� �α��� ���� ");
					log = 2;
				} else {System.out.println("[error]");}

			} else if (sel == 2) {
				if(log!=-1) {
					System.out.println("�α׾ƿ��Ϸ�.");
					log=-1;
				} else {System.out.println("�α��� �� �̿밡���մϴ�.");}
				// �α׾���
			} else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			} else {System.out.println("�Է¿���");}
		}
		scan.close();
	}
}
