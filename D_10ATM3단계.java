package day05;

import java.util.Scanner;

public class D_10ATM3�ܰ� {

	public static void main(String[] args) {

		/*
		 * # ATM 
		 * 1. �Ա� . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա� 
		 * 2. ��� . ����� �ݾ��� �Է¹޾�, myMoney���� ��� .
		 * ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ� 
		 * 3. ��ü . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü . 
		 * ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ� . 
		 * ��ü �� yourMoney �ܾ� ���� 
		 * 4. ��ȸ . myMoney�� yourMoney �ܾ׸�� ���
		 */
//		Scanner scan = new Scanner(System.in);
//
//		int myAcc = 1111;
//		int myMoney = 50000;
//		
//		int myPlus=0;
//		int myMinus=0;
//		int accCheck=0;
//		int send=0;
//
//		int yourAcc = 2222;
//		int yourMoney = 70000;
//
//		boolean run = true;
//		while (run) {
//
//			System.out.println("1.�Ա�");
//			System.out.println("2.���");
//			System.out.println("3.��ü");
//			System.out.println("4.��ȸ");
//			System.out.println("0.����");
//
//			System.out.print("�޴� ���� : ");
//			int sel = scan.nextInt();
//
//			if (sel == 1) {
//				System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ���. : ");
//				myPlus=scan.nextInt();
//				if(myPlus>0) {
//					myMoney+=myPlus;
//					System.out.printf("[%d�� �Ա� �Ϸ�! ���� �����ܾ� : %d��]\n",myPlus,myMoney);
//				} else {System.out.println("�Է¿���");}
//			} else if (sel == 2) {
//				System.out.print("����Ͻ� �ݾ��� �Է��ϼ���. : ");
//				myMinus=scan.nextInt();
//				if(myMinus>0) {
//					if(myMinus<=myMoney) {
//						myMoney-=myMinus;
//						System.out.printf("[%d�� ��� �Ϸ�! ���� �����ܾ� : %d��]\n",myMinus,myMoney);
//					} else {System.out.println("�ܾ��� �����մϴ�.");}
//				} else {System.out.println("�Է¿���");}
//			} else if (sel == 3) {
//				System.out.print("��ü�Ͻ� ���¸� �Է��ϼ��� : ");
//				accCheck=scan.nextInt();
//				if(accCheck==yourAcc) {
//					System.out.print("��ü�Ͻ� �ݾ��� �Է��ϼ��� : ");
//					send=scan.nextInt();
//					if(send>0) {
//						if(send<=myMoney) {
//							myMoney-=send;
//							yourMoney+=send;
//							System.out.printf("[%d�� ��ü �Ϸ�! ���� �����ܾ� : %d��]\n",send,myMoney);
//						} else {System.out.println("�ܾ��� �����մϴ�.");}
//					} else {System.out.println("�Է¿���");}
//				} else if(accCheck==myAcc) {
//					System.out.print("��ü�Ͻ� �ݾ��� �Է��ϼ��� : ");
//					send=scan.nextInt();
//					if(send>0) {
//						if(send<=yourMoney) {
//							yourMoney-=send;
//							myMoney+=send;
//							System.out.printf("[%d�� ��ü �Ϸ�! ���� �����ܾ� : %d��]\n",send,yourMoney);
//						} else {System.out.println("�ܾ��� �����մϴ�.");}
//					} else {System.out.println("�Է¿���");}
//				} 
//				else {System.out.println("�Է¿���");}
//			} else if (sel == 4) {
//				System.out.printf("user1�� �ܾ� ��ȸ : %d\n",myMoney);
//				System.out.printf("user2�� �ܾ� ��ȸ : %d\n",yourMoney);
//			} else if (sel == 0) {
//				run = false;
//				System.out.println("���α׷� ����");
//			}
//		}
//		scan.close();
		
		Scanner scan = new Scanner(System.in);

		// dbAcc1 �α����� ����
		int myAcc = 1111;
		int myMoney = 50000;

		// dbAcc2
		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {

			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				// �Ա�
				while (true) {
					System.out.print("�Աݾ� >> ");
					int money = scan.nextInt();
					if (money <= 0 || money % 100 != 0) {
						System.out.println("[ �ݾ� ���� ]");
					} else {
						myMoney += money;
						System.out.println("[�Ա� �Ϸ�]");
						break;
					}
				}

			} else if (sel == 2) {
				// ���
				while (true) {
					System.out.print("��ݾ� >> ");
					int money = scan.nextInt();
					if (money <= 0 || money % 100 != 0) {
						System.out.println("[ �ݾ� ���� ]");
					} else if (myMoney < money) {
						System.out.println("[ ��� �ܾ� �ʰ� ]");
					} else {

						myMoney -= money;
						System.out.println("[��� �Ϸ�]");
						break;
					}
				}
			} else if (sel == 3) {
				// ��ü
				System.out.println("��ü ���� >> ");
				int account = scan.nextInt();
                boolean check = false;
				if (account == yourAcc) {
					check = true;
				} else {
					System.out.println("[ ���� ���� ��ȣ ]");
				}
				while (check) {
					System.out.print("��ü �ݾ� >> ");
					int money = scan.nextInt();
					if (money <= 0 || money % 100 != 0) {
						System.out.println("[ �ݾ� ���� ]");
					} else if (money > myMoney) {
						System.out.println("[ ��ü �ܾ� �ʰ� ]");
					} else {
						myMoney -= money;
						yourMoney += money;
						System.out.println("[��ü �Ϸ�]");
						break;
					}
				}

			} else if (sel == 4) {
				// ��ȸ
				System.out.printf("[ �� ���� %d �� ] \n", myMoney);
				System.out.printf("[��� ���� %d �� ] \n", yourMoney);
			} else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}

}
