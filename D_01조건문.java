package day02;
import java.util.Scanner;

public class D_01���ǹ� {

	public static void main(String[] args) {

		// ��� : ���ǹ�, �ݺ���
		// �ڵ��� �帧(�� -> �Ʒ� )�� �����Ѵ�

		// if ����
		// 1. if => Ű����
		// 2. (���ǽ�==>boolean ��) : �񱳿����� , ��������
		// 3. { } : �� , �ٵ� , ����

		System.out.println("���ǹ� ��1 ");

		if (true) {
			System.out.println("���� O");
		}

		System.out.println("���ǹ� ��2 ");

		// if ������ false �̸� �ڵ� �帧 �ǳʶٱ�
		if (false) {
			System.out.println("���� X");

		}

		System.out.println("���ǹ� ��3 ");

		int a = 10;
		int b = 11;

		if (a == b) {
			System.out.println("����2 O");
		}

		if (a != b) {
			System.out.println("����2 X"); // �̺κ��� ������ �ȵȴ�.
		}

		System.out.println("���ǹ� ��4 ");
		
		// ����ڿ��� �� 1���� �Է¹ް� ¦���� ¦�� ���
		// Ȧ���� Ȧ�� ���
		
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num=s.nextInt();
		boolean check=num%2==0;
		
		if (check) {
			System.out.println("¦��");
		}
		
		if (!check) {
			System.out.println("Ȧ��");
		}
		
		s.close();

	}

}
