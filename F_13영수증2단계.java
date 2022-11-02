import java.util.Scanner;

public class F_영수증2단계 {

	public static void main(String[] args) {

		/*
		 * # 영수증 출력[2단계] 1. 5번 주문을 받는다. 2. 주문이 끝난 후, 돈을 입력받는다. 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 단, 메뉴 오류가 떴을 때는 횟수가 차감되면 안됨
		 * 
		 * 예) 메뉴 선택 : 1 메뉴 선택 : 1 메뉴 선택 : 2 메뉴 선택 : 2 메뉴 선택 : 3 총 금액 = 31300원 현금 입력 :
		 * 32000 === 롯데리아 영수증 === 1. 불고기 버거 : 2개 2. 새우 버거 : 2개 3. 콜 라 : 1개 4. 총 금 액 :
		 * 31300원 5. 잔 돈 : 700원
		 */
		Scanner s = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int choiceBul = 0;
		int choiceShi = 0;
		int choiceCoke = 0;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우 버거 : " + price2 + "원");
		System.out.println("3.콜라 : " + price3 + "원");
		int i = 1;
		while (i <= 5) {
			System.out.println("--------------");
			System.out.print("주문하실 메뉴번호를 선택하세요 : ");
			int choice = s.nextInt();
			boolean err = choice > 3 || choice < 1;
			if (err) {
				System.out.println("입력오류, 다시 선택해주세요.");
				i -= 1;
			} else {
				System.out.printf("%d번째 선택메뉴 : %d\n", i, choice);
				if (choice == 1) {
					choiceBul += 1;
				} else if (choice == 2) {
					choiceShi += 1;
				} else {
					choiceCoke += 1;
				}
			}
			i++;
		}
		int totalPrice=(choiceBul * price1) + (choiceShi * price2) + (choiceCoke * price3);
		System.out.println("주문하신 총 금액은 : "+totalPrice+"입니다.");
		System.out.print("금액을 지불하여주세요 : ");
		int money = s.nextInt();

		System.out.println("=== 롯데리아 영수증 ===");
		if (choiceBul != 0) {
			System.out.printf("1. 불고기 버거 : %d개\n", choiceBul);
		}
		if (choiceShi != 0) {
			System.out.printf("2. 새우 버거 : %d개\n", choiceShi);
		}
		if (choiceCoke != 0) {
			System.out.printf("3. 콜라 : %d개\n", choiceCoke);
		}
		System.out.printf("4. 총금액 : %d원\n", totalPrice);
		
		if(money>=totalPrice) {
			System.out.printf("5. 잔돈 : %d원\n", money - totalPrice);
		} else {System.out.println("지불하신 금액 : "+money+"원");System.out.println("금액이 부족합니다.");}

		s.close();

	}
}
