package day02;

import java.util.Scanner; // Ŭ���� ���� ��Ű�� �Ʒ� 

public class C_06�Է� {

	public static void main(String[] args) {

		System.out.println("test");
		// scanner + ctrl + space ==> �ڵ����� import ��

		// Scanner ��ü ��� => ������ �����
		// ����ڿ��� �Է��� ���� �� �ִ� Scanner ��ü�� �����Ѵ�
		// �� ��ü �̸��� scan�� Scanner Ŭ������ ��� ����� �� �ִ�

		// 1. Scanner ���� �����
		Scanner scan = new Scanner(System.in);
		// 2. �Է¹��� �ȳ� ��¹� �����
		System.out.println("���� 1�� �Է� >> ");
		// 3. �Է� �ޱ� => ������ �����ϱ�
		int number1 = scan.nextInt(); // �ֿܼ��� ���ڰ� �Ѱ��� �޾ƿ�

		// 4. ��� ���
		System.out.println("number1 = " + number1);
		// ���� �ѹ� ����� ������ ��� ����
		System.out.println("���� 2�� �Է� >> ");
		int number2 = scan.nextInt(); // �ֿܼ��� ���ڰ� �Ѱ��� �޾ƿ�
		System.out.println("number2 = " + number2);

		// 5. ���� �ݱ�
		scan.close();
		System.out.println("==���α׷� ����==");
	}

}