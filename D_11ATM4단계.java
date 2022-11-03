package day05;

import java.util.Scanner;

public class D_11ATM4단계 {

	public static void main(String[] args) {

		/*
		 * # ATM[종합] 
		 * 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 
		 * 2. 로그아웃 . 로그인 후 이용가능 
		 * 3. 입금 . 로그인 후 이용가능 
		 * 4. 출금 . 로그인 후 이용가능 
		 * 5. 이체 . 로그인 후 이용가능 
		 * 6. 조회 . 로그인 후 이용가능 
		 * 7. 종료
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
		// 이거 4개 써서 코드 줄여보기

		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;
		while (run) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if(log==-1) {
					while (true) {
						System.out.print("아이디를 입력하세요 : ");
						int userId=scan.nextInt();
						if(userId==dbAcc1) {
							System.out.print("비밀번호를 입력하세요 : ");
							int userPw=scan.nextInt();
							if(userPw==dbPw1) {System.out.println("[user1님 환영합니다!]");log=1;break;}
							else {System.out.println("비밀번호 오류");}
						} else if(userId==dbAcc2) {
							System.out.print("비밀번호를 입력하세요 : ");
							int userPw=scan.nextInt();
							if(userPw==dbPw2) {System.out.println("[user2님 환영합니다!]");log=2;break;}
							else {System.out.println("비밀번호 오류");}
						} else {System.out.println("존재하지 않는 계정입니다.");}
					}
				} else {System.out.println("error");}
			} else if (sel == 2) {
				if(log==1) {
					System.out.println("[로그아웃 성공, user1님 안녕히가십시오.]");
					log=-1;
				} else if(log==2) {
					System.out.println("[로그아웃 성공, user2님 안녕히가십시오.]");
					log=-1;
				} else {System.out.println("로그인 후 이용가능합니다.");}
			} else if (sel == 3) {
				if(log==-1) {System.out.println("로그인 후 이용가능합니다.");}
				else {
					System.out.print("입금하실 금액을 입력하세요. : ");
					myPlus=scan.nextInt();
					if(log==1) {
						if(myPlus>0) {
							dbMoney1+=myPlus;
							System.out.printf("[%d원 입금 완료! 현재 통장잔액 : %d원]\n",myPlus,dbMoney1);
						} else {System.out.println("입력오류");}
					} else if(log==2) {
						if(myPlus>0) {
							dbMoney2+=myPlus;
							System.out.printf("[%d원 입금 완료! 현재 통장잔액 : %d원]\n",myPlus,dbMoney2);
						} else {System.out.println("입력오류");}
					}
				}
			} else if (sel == 4) {
				if(log==-1) {System.out.println("로그인 후 이용가능합니다.");}
				else {
					while (true) {
						System.out.print("출금액 >> ");
						int money = scan.nextInt();
						if(log==1) {
							if (money <= 0 || money % 100 != 0) {
								System.out.println("[ 금액 오류 ]");
							} else if (dbMoney1 < money) {
								System.out.println("[ 출금 잔액 초과 ]");
							} else {

								dbMoney1 -= money;
								System.out.println("[출금 완료]");
								break;
							}
						} else if(log==2) {
							if (money <= 0 || money % 100 != 0) {
								System.out.println("[ 금액 오류 ]");
							} else if (dbMoney2 < money) {
								System.out.println("[ 출금 잔액 초과 ]");
							} else {
								dbMoney2 -= money;
								System.out.println("[출금 완료]");
								break;
							}
						} else {System.out.println("입력오류");}
					}
				}
			} else if (sel == 5) {
				if(log==-1) {System.out.println("로그인 후 이용가능합니다.");}
				else {
					System.out.println("이체 계좌 >> ");
					int account = scan.nextInt();
	                boolean check = false;
	                if(log==1) {
	                	if (account == dbAcc2) {
	    					check = true;
	    				} else {
	    					System.out.println("[ 없는 계좌 번호 ]");
	    				}
	    				while (check) {
	    					System.out.print("이체 금액 >> ");
	    					int money = scan.nextInt();
	    					if (money <= 0 || money % 100 != 0) {
	    						System.out.println("[ 금액 오류 ]");
	    					} else if (money > dbMoney1) {
	    						System.out.println("[ 이체 잔액 초과 ]");
	    					} else {
	    						dbMoney1 -= money;
	    						dbMoney2 += money;
	    						System.out.println("[이체 완료]");
	    						break;
	    					}
	    				}
	                } else if(log==2) {
	                	if (account == dbAcc1) {
	    					check = true;
	    				} else {
	    					System.out.println("[ 없는 계좌 번호 ]");
	    				}
	    				while (check) {
	    					System.out.print("이체 금액 >> ");
	    					int money = scan.nextInt();
	    					if (money <= 0 || money % 100 != 0) {
	    						System.out.println("[ 금액 오류 ]");
	    					} else if (money > dbMoney2) {
	    						System.out.println("[ 이체 잔액 초과 ]");
	    					} else {
	    						dbMoney2 -= money;
	    						dbMoney1 += money;
	    						System.out.println("[이체 완료]");
	    						break;
	    					}
	    				}
	                } 
				}
			} else if (sel == 6) {
				if(log==-1) {System.out.println("로그인 후 이용가능합니다.");}
				else {
					System.out.printf("[ user1 계좌 %d 원 ] \n", dbMoney1);
					System.out.printf("[ user2 계좌 %d 원 ] \n", dbMoney2);
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		scan.close();
	}

}
