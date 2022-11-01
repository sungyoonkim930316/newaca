package day03;

import java.util.Scanner;

public class D_07영수증 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 1. 메뉴판을 출력한다. 
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다. 
		 * 단, 1-3 아닌 번호를 입력하면 입력오류 출력
		 * 3. 현금을 입력받는다. 
		 * 4. 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다. 
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */
		
//		int price1 = 8700;
//		int price2 = 6200;
//		int price3 = 1500;
//		
//		System.out.println("=== 롯데리아 ===");
//		System.out.println("1.불고기버거 : " + price1 + "원");
//		System.out.println("2.새우버거 : " + price2 + "원");
//		System.out.println("3.콜라 : " + price3 + "원");
//		System.out.println();
//		
//		Scanner s=new Scanner(System.in);
//		System.out.print("원하시는 메뉴의 번호를 입력하세요. : ");
//		int menu=s.nextInt();
//		if(menu!=1&&menu!=2&&menu!=3) {System.out.println("입력오류");}
//		System.out.print("지불하실 현금(원)을 입력하세요. : ");
//		int orderPrice=s.nextInt();
//		if(orderPrice<0) {System.out.println("입력오류");}
//		System.out.println();
//		
//		boolean c=orderPrice==price1||orderPrice==price2||orderPrice==price3;
//		
//		if(c) {
//			System.out.println("=== 영수증 ===");
//			System.out.println("주문하신 메뉴 번호 : "+menu);
//			System.out.println("지불하신 금액 : "+orderPrice);
//		}
//		if(!c) {
//			if(orderPrice<price1||orderPrice<price2||orderPrice<price3) {System.out.println("현금이 부족합니다.");}
//			if(orderPrice>price1||orderPrice>price2||orderPrice>price3) {System.out.println("거스름돈을 받아주세요.");}
//		}
//		s.close();
		
		/*
		 * [문제] 1. 메뉴판을 출력한다. 
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다. 
		 * 단 1-3 아닌 번호를 입력하면 입력 오류 출력
		 * 
		 * 3. 현금을 입력받는다.
		 *  4. 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다.
		 *   5. 단, 현금이 부족한 경우
		 * "현금이 부족합니다."라는 메세지를 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int price = 0;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜      라 : " + price3 + "원");

		System.out.print("메뉴 번호 >> ");
		int menu = sc.nextInt();
		boolean error = menu > 3 || menu < 1;
		if (error) {
			System.out.println("입력 오류: 1,2,3 중 입력");
		}
		if (!error) {
			System.out.print("현금 >> ");
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
				System.out.println("현금이 부족합니다.");
			}
			if(!cashErr) {
				System.out.println("==== 영수증 ==== ");
				System.out.println("합  계 " + price + " 원");
				System.out.println("현  금 " + money +" 원");
				System.out.println("잔  돈 " + (money-price) + " 원");
			}
			

		}
		
		
	}

}
