package day02;

import java.util.Scanner;

public class C_11Ȧ�� {

	public static void main(String[] Args) {

		/*
		 * [����] ���� 2���� �Է¹޴´�. �� ������ ���� Ȧ������ ���θ� �Ǵ��� true �Ǵ� false�� ǥ���Ͻÿ�. ���۽ð� : 15:52
		 * ����ð� : 15:54
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int num1 = s.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int num2 = s.nextInt();

		boolean check = (num1 + num2) % 2 == 1;
		System.out.println(check);
		s.close();

	}

}
