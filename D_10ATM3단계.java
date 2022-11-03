package day05;

import java.util.Scanner;

public class D_10ATM3단계 {

	public static void main(String[] args) {

		/*
		 * # ATM 
		 * 1. 입금 . 입금할 금액을 입력받아, myMoney에 입금 
		 * 2. 출금 . 출금할 금액을 입력받아, myMoney에서 출금 .
		 * 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가 
		 * 3. 이체 . yourAcc 계좌번호를 입력받아, 이체 . 
		 * 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가 . 
		 * 이체 후 yourMoney 잔액 증가 
		 * 4. 조회 . myMoney와 yourMoney 잔액모두 출력
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
//			System.out.println("1.입금");
//			System.out.println("2.출금");
//			System.out.println("3.이체");
//			System.out.println("4.조회");
//			System.out.println("0.종료");
//
//			System.out.print("메뉴 선택 : ");
//			int sel = scan.nextInt();
//
//			if (sel == 1) {
//				System.out.print("입금하실 금액을 입력하세요. : ");
//				myPlus=scan.nextInt();
//				if(myPlus>0) {
//					myMoney+=myPlus;
//					System.out.printf("[%d원 입금 완료! 현재 통장잔액 : %d원]\n",myPlus,myMoney);
//				} else {System.out.println("입력오류");}
//			} else if (sel == 2) {
//				System.out.print("출금하실 금액을 입력하세요. : ");
//				myMinus=scan.nextInt();
//				if(myMinus>0) {
//					if(myMinus<=myMoney) {
//						myMoney-=myMinus;
//						System.out.printf("[%d원 출금 완료! 현재 통장잔액 : %d원]\n",myMinus,myMoney);
//					} else {System.out.println("잔액이 부족합니다.");}
//				} else {System.out.println("입력오류");}
//			} else if (sel == 3) {
//				System.out.print("이체하실 계좌를 입력하세요 : ");
//				accCheck=scan.nextInt();
//				if(accCheck==yourAcc) {
//					System.out.print("이체하실 금액을 입력하세요 : ");
//					send=scan.nextInt();
//					if(send>0) {
//						if(send<=myMoney) {
//							myMoney-=send;
//							yourMoney+=send;
//							System.out.printf("[%d원 이체 완료! 현재 통장잔액 : %d원]\n",send,myMoney);
//						} else {System.out.println("잔액이 부족합니다.");}
//					} else {System.out.println("입력오류");}
//				} else if(accCheck==myAcc) {
//					System.out.print("이체하실 금액을 입력하세요 : ");
//					send=scan.nextInt();
//					if(send>0) {
//						if(send<=yourMoney) {
//							yourMoney-=send;
//							myMoney+=send;
//							System.out.printf("[%d원 이체 완료! 현재 통장잔액 : %d원]\n",send,yourMoney);
//						} else {System.out.println("잔액이 부족합니다.");}
//					} else {System.out.println("입력오류");}
//				} 
//				else {System.out.println("입력오류");}
//			} else if (sel == 4) {
//				System.out.printf("user1의 잔액 조회 : %d\n",myMoney);
//				System.out.printf("user2의 잔액 조회 : %d\n",yourMoney);
//			} else if (sel == 0) {
//				run = false;
//				System.out.println("프로그램 종료");
//			}
//		}
//		scan.close();
		
		Scanner scan = new Scanner(System.in);

		// dbAcc1 로그인한 상태
		int myAcc = 1111;
		int myMoney = 50000;

		// dbAcc2
		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {

			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				// 입금
				while (true) {
					System.out.print("입금액 >> ");
					int money = scan.nextInt();
					if (money <= 0 || money % 100 != 0) {
						System.out.println("[ 금액 오류 ]");
					} else {
						myMoney += money;
						System.out.println("[입금 완료]");
						break;
					}
				}

			} else if (sel == 2) {
				// 출금
				while (true) {
					System.out.print("출금액 >> ");
					int money = scan.nextInt();
					if (money <= 0 || money % 100 != 0) {
						System.out.println("[ 금액 오류 ]");
					} else if (myMoney < money) {
						System.out.println("[ 출금 잔액 초과 ]");
					} else {

						myMoney -= money;
						System.out.println("[출금 완료]");
						break;
					}
				}
			} else if (sel == 3) {
				// 이체
				System.out.println("이체 계좌 >> ");
				int account = scan.nextInt();
                boolean check = false;
				if (account == yourAcc) {
					check = true;
				} else {
					System.out.println("[ 없는 계좌 번호 ]");
				}
				while (check) {
					System.out.print("이체 금액 >> ");
					int money = scan.nextInt();
					if (money <= 0 || money % 100 != 0) {
						System.out.println("[ 금액 오류 ]");
					} else if (money > myMoney) {
						System.out.println("[ 이체 잔액 초과 ]");
					} else {
						myMoney -= money;
						yourMoney += money;
						System.out.println("[이체 완료]");
						break;
					}
				}

			} else if (sel == 4) {
				// 조회
				System.out.printf("[ 내 계좌 %d 원 ] \n", myMoney);
				System.out.printf("[상대 계좌 %d 원 ] \n", yourMoney);
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
