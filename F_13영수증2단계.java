import java.util.Scanner;

public class F_������2�ܰ� {

	public static void main(String[] args) {

		/*
		 * # ������ ���[2�ܰ�] 1. 5�� �ֹ��� �޴´�. 2. �ֹ��� ���� ��, ���� �Է¹޴´�. 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * ��, �޴� ������ ���� ���� Ƚ���� �����Ǹ� �ȵ�
		 * 
		 * ��) �޴� ���� : 1 �޴� ���� : 1 �޴� ���� : 2 �޴� ���� : 2 �޴� ���� : 3 �� �ݾ� = 31300�� ���� �Է� :
		 * 32000 === �Ե����� ������ === 1. �Ұ�� ���� : 2�� 2. ���� ���� : 2�� 3. �� �� : 1�� 4. �� �� �� :
		 * 31300�� 5. �� �� : 700��
		 */
		Scanner s = new Scanner(System.in);

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int choiceBul = 0;
		int choiceShi = 0;
		int choiceCoke = 0;

		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.���� ���� : " + price2 + "��");
		System.out.println("3.�ݶ� : " + price3 + "��");
		int i = 1;
		while (i <= 5) {
			System.out.println("--------------");
			System.out.print("�ֹ��Ͻ� �޴���ȣ�� �����ϼ��� : ");
			int choice = s.nextInt();
			boolean err = choice > 3 || choice < 1;
			if (err) {
				System.out.println("�Է¿���, �ٽ� �������ּ���.");
				i -= 1;
			} else {
				System.out.printf("%d��° ���ø޴� : %d\n", i, choice);
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
		System.out.println("�ֹ��Ͻ� �� �ݾ��� : "+totalPrice+"�Դϴ�.");
		System.out.print("�ݾ��� �����Ͽ��ּ��� : ");
		int money = s.nextInt();

		System.out.println("=== �Ե����� ������ ===");
		if (choiceBul != 0) {
			System.out.printf("1. �Ұ�� ���� : %d��\n", choiceBul);
		}
		if (choiceShi != 0) {
			System.out.printf("2. ���� ���� : %d��\n", choiceShi);
		}
		if (choiceCoke != 0) {
			System.out.printf("3. �ݶ� : %d��\n", choiceCoke);
		}
		System.out.printf("4. �ѱݾ� : %d��\n", totalPrice);
		
		if(money>=totalPrice) {
			System.out.printf("5. �ܵ� : %d��\n", money - totalPrice);
		} else {System.out.println("�����Ͻ� �ݾ� : "+money+"��");System.out.println("�ݾ��� �����մϴ�.");}

		s.close();

	}
}
