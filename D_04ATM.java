package day04;

import java.util.Scanner;

public class D_04ATM {

	public static void main(String[] args) {

		/*
		 * [문제] ATM 기능 중 로그인 기능을 구현한다.
		 * 
		 * 1. 변수 설명 
		 * cash : 가지고있는 현금 
		 * balance : 예금 
		 * joinId : 가입한 아이디 
		 * joinPw : 가입한 패스워드
		 * 
		 * 2. 기능설명 
		 * 1) 메인 메뉴 선택 [1.로그인 0.종료] 
		 * 2) 로그인을 선택한 경우, 아이디와 비밀번호를 입력받고 성공하면
		 * "로그인 성공" 메세지를 출력하고 [1.입금 2.출금]의 새로운 메뉴가 등장
		 * 
		 * 2-1) 입금을 선택한 경우 입금할 돈을 입력받고 현금이 줄어들고 예금이 늘어난다. 2-2) 출금을 선택한 경우 출금할 돈을 입력받고
		 * 예금이 줄어들고 현금이 늘어난다.
		 * 
		 * 3) 로그인에 실패한 경우 "로그인 실패" 메세지 출력
		 */
		Scanner scan = new Scanner(System.in);

		int cash = 20000;
		int balance = 30000;

		int joinId = 1111;
		int joinPw = 1234;

		System.out.println("=== [ATM] ===");
		System.out.println("[1.로그인 0.종료]");

		int select = scan.nextInt();
		boolean inputErr=select>1||select<0;

		if(!inputErr) {
			if (select == 1) {
				System.out.print("아이디를 입력 : ");
				int loginId=scan.nextInt();
				if(loginId==joinId) {
					System.out.print("비밀번호를 입력 : ");
					int loginPw=scan.nextInt();
					if(loginPw==joinPw) {
						System.out.println("로그인 성공");
						System.out.println("-------------");
						System.out.println("[1.입금 2.출금]");
						int mainMenu=scan.nextInt();
						boolean menuErr=mainMenu>2||mainMenu<1;
						if(!menuErr) {
							if (mainMenu==1) {
								System.out.print("입금하실 금액을 입력하세요 : ");
								int plus=scan.nextInt();
								if(plus<=cash) {
									cash-=plus;
									balance+=plus;
									System.out.println(plus+"원이 입금되었습니다. 예금 : "+(balance)+"원");
									System.out.println("남은 현금 : "+(cash)+"원");
								}
								else {System.out.println("보유현금이 부족합니다. 프로그램을 종료합니다.");}
							} else if (mainMenu==2) {
								System.out.print("출금하실 금액을 입력하세요 : ");
								int minus=scan.nextInt();
								if(minus<=balance) {
									cash+=minus;
									balance-=minus;
									System.out.println(minus+"원이 출금되었습니다. 예금 : "+(balance)+"원");
									System.out.println("남은 현금 : "+(cash)+"원");
								}
								else {System.out.println("잔액이 부족합니다. 프로그램을 종료합니다.");}
							}
						} else {System.out.println("입력오류");}
					} else {System.out.println("비밀번호를 잘못입력하셨습니다, 로그인실패.");}
				} else {System.out.println("존재하지 않는 아이디입니다, 로그인실패.");}
				
			} else if (select == 0) {System.out.println("프로그램을 종료합니다.");}
		} else {System.out.println("입력오류");}
		scan.close();
		System.out.printf("[ 현금 : %d 계좌 : %d ]", cash,balance);

	}

}
