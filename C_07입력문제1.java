package day02;

import java.util.Scanner;

public class C_07�Է¹���1 {

	public static void main(String[] args) {

		/*
		 * [����] ���� 2���� �Է¹ް�, �� ���� ���Ͻÿ�. ��) 3, 5 ==> 8
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("���� 1 >> ");
		int num1 = s.nextInt();
		System.out.println("���� 2 >> ");
		int num2 = s.nextInt();

		System.out.printf("�� ������ ���� = %d\n", num1 + num2);
		s.close();

	}

}
