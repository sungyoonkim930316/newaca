package day03;

import java.util.Random;

public class D_09���� {

	public static void main(String[] args) {

		Random r=new Random();
		int randomNum = r.nextInt(); // �������� ���������� �ִ� �� 1���� �����´�.
		
		System.out.println("������ ���� 1�� : "+randomNum);
		
		// 0~2 0 1 2
					// ������ ���۹����� 0
					// nextInt(������ ����)
		int player1=r.nextInt(3); // 0 1 2
		System.out.println(player1);
		
		// 1~10
		int num=r.nextInt(10)+1; // �� ������ �� �ڿ� �ִ� +1�� ���۰��̶�� �����ϸ� ����.
		System.out.println(num);
		
		// -3~3
		int num2=r.nextInt(7)-3;
		System.out.println(num2);
		
		// 150~250
		int num3=r.nextInt(101)+150;
		System.out.println(num3);
		
	}

}
