package day05;

import java.util.Scanner;

public class D_01�ݺ������� {

	public static void main(String[] args) {

		// Ƚ���� �ִ� �ݺ���
		// ��𼭺��� ������ ���
		// �ʱ�� ���ǽ� ������
		// �ݺ����� i j k

		int i = 1;
		while (i <= 10) {

			i++;
		}

		// Ƚ���� ���� �ݺ��� // 1.���� ���ǽ� 2. ������ ���ǽ�

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int price = 10000;

		while (run) {
			System.out.println("���� �Է� >> ");
			int money = sc.nextInt();

			if (money >= price) { // �ݺ��� ������ ���ǽ�
				run = false;
			} else {
				System.out.println("�Է¿��� ");
			}
		}

		System.out.println(" �ݺ��� ���� ");

		while (true) {
			System.out.println("���� �Է� >> ");
			int money = sc.nextInt();
			if (money >= price) { // �ݺ��� ������ ���ǽ�
				break; // �ݺ��� ��� ����
			} else {
				System.out.println("�Է¿��� ");
			}
		}
		System.out.println(" �ݺ��� ���� ");

	}

}
