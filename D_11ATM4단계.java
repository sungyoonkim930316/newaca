package day05;

import java.util.Scanner;

public class D_11ATM4�ܰ� {

	public static void main(String[] args) {

		/*
		 * # ATM[����] 
		 * 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 
		 * 2. �α׾ƿ� . �α��� �� �̿밡�� 
		 * 3. �Ա� . �α��� �� �̿밡�� 
		 * 4. ��� . �α��� �� �̿밡�� 
		 * 5. ��ü . �α��� �� �̿밡�� 
		 * 6. ��ȸ . �α��� �� �̿밡�� 
		 * 7. ����
		 */
		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int myPlus=0;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
//		int myAcc=0;
//		int yourAcc=0;
//		int myMoney=0;
//		int yourMoney=0;
		// �̰� 4�� �Ἥ �ڵ� �ٿ�����

		int log = -1; // -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)

		boolean run = true;
		while (run) {

			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(log==-1) {
					while (true) {
						System.out.print("���̵� �Է��ϼ��� : ");
						int userId=scan.nextInt();
						if(userId==dbAcc1) {
							System.out.print("��й�ȣ�� �Է��ϼ��� : ");
							int userPw=scan.nextInt();
							if(userPw==dbPw1) {System.out.println("[user1�� ȯ���մϴ�!]");log=1;break;}
							else {System.out.println("��й�ȣ ����");}
						} else if(userId==dbAcc2) {
							System.out.print("��й�ȣ�� �Է��ϼ��� : ");
							int userPw=scan.nextInt();
							if(userPw==dbPw2) {System.out.println("[user2�� ȯ���մϴ�!]");log=2;break;}
							else {System.out.println("��й�ȣ ����");}
						} else {System.out.println("�������� �ʴ� �����Դϴ�.");}
					}
				} else {System.out.println("error");}
			} else if (sel == 2) {
				if(log==1) {
					System.out.println("[�α׾ƿ� ����, user1�� �ȳ������ʽÿ�.]");
					log=-1;
				} else if(log==2) {
					System.out.println("[�α׾ƿ� ����, user2�� �ȳ������ʽÿ�.]");
					log=-1;
				} else {System.out.println("�α��� �� �̿밡���մϴ�.");}
			} else if (sel == 3) {
				if(log==-1) {System.out.println("�α��� �� �̿밡���մϴ�.");}
				else {
					System.out.print("�Ա��Ͻ� �ݾ��� �Է��ϼ���. : ");
					myPlus=scan.nextInt();
					if(log==1) {
						if(myPlus>0) {
							dbMoney1+=myPlus;
							System.out.printf("[%d�� �Ա� �Ϸ�! ���� �����ܾ� : %d��]\n",myPlus,dbMoney1);
						} else {System.out.println("�Է¿���");}
					} else if(log==2) {
						if(myPlus>0) {
							dbMoney2+=myPlus;
							System.out.printf("[%d�� �Ա� �Ϸ�! ���� �����ܾ� : %d��]\n",myPlus,dbMoney2);
						} else {System.out.println("�Է¿���");}
					}
				}
			} else if (sel == 4) {
				if(log==-1) {System.out.println("�α��� �� �̿밡���մϴ�.");}
				else {
					while (true) {
						System.out.print("��ݾ� >> ");
						int money = scan.nextInt();
						if(log==1) {
							if (money <= 0 || money % 100 != 0) {
								System.out.println("[ �ݾ� ���� ]");
							} else if (dbMoney1 < money) {
								System.out.println("[ ��� �ܾ� �ʰ� ]");
							} else {

								dbMoney1 -= money;
								System.out.println("[��� �Ϸ�]");
								break;
							}
						} else if(log==2) {
							if (money <= 0 || money % 100 != 0) {
								System.out.println("[ �ݾ� ���� ]");
							} else if (dbMoney2 < money) {
								System.out.println("[ ��� �ܾ� �ʰ� ]");
							} else {
								dbMoney2 -= money;
								System.out.println("[��� �Ϸ�]");
								break;
							}
						} else {System.out.println("�Է¿���");}
					}
				}
			} else if (sel == 5) {
				if(log==-1) {System.out.println("�α��� �� �̿밡���մϴ�.");}
				else {
					System.out.println("��ü ���� >> ");
					int account = scan.nextInt();
	                boolean check = false;
	                if(log==1) {
	                	if (account == dbAcc2) {
	    					check = true;
	    				} else {
	    					System.out.println("[ ���� ���� ��ȣ ]");
	    				}
	    				while (check) {
	    					System.out.print("��ü �ݾ� >> ");
	    					int money = scan.nextInt();
	    					if (money <= 0 || money % 100 != 0) {
	    						System.out.println("[ �ݾ� ���� ]");
	    					} else if (money > dbMoney1) {
	    						System.out.println("[ ��ü �ܾ� �ʰ� ]");
	    					} else {
	    						dbMoney1 -= money;
	    						dbMoney2 += money;
	    						System.out.println("[��ü �Ϸ�]");
	    						break;
	    					}
	    				}
	                } else if(log==2) {
	                	if (account == dbAcc1) {
	    					check = true;
	    				} else {
	    					System.out.println("[ ���� ���� ��ȣ ]");
	    				}
	    				while (check) {
	    					System.out.print("��ü �ݾ� >> ");
	    					int money = scan.nextInt();
	    					if (money <= 0 || money % 100 != 0) {
	    						System.out.println("[ �ݾ� ���� ]");
	    					} else if (money > dbMoney2) {
	    						System.out.println("[ ��ü �ܾ� �ʰ� ]");
	    					} else {
	    						dbMoney2 -= money;
	    						dbMoney1 += money;
	    						System.out.println("[��ü �Ϸ�]");
	    						break;
	    					}
	    				}
	                } 
				}
			} else if (sel == 6) {
				if(log==-1) {System.out.println("�α��� �� �̿밡���մϴ�.");}
				else {
					System.out.printf("[ user1 ���� %d �� ] \n", dbMoney1);
					System.out.printf("[ user2 ���� %d �� ] \n", dbMoney2);
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
		scan.close();
	}

}
