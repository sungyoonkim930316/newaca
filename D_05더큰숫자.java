package day02;

import java.util.Scanner;

public class D_05��ū���� {

	public static void main(String[] args) {

		/*
		 * [����] ���� 2���� �Է¹ް�, �� ū ������ ���� ����Ͻÿ�.
		 * 
		 * ��) ����1 �Է� : ����2 �Է� : �� ū ���ڴ� ? �Դϴ�.
		 * ��, �� ���ڰ� ������ ������ �����Դϴ�. ���
		 * ���۽ð� : 17:12
		 * ����ð� : 
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1=s.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2=s.nextInt();
		
		if (num1>num2) {
			System.out.printf("�� ū ���ڴ� %d�Դϴ�\n",num1);
		}
		if (num1<num2) {
			System.out.printf("�� ū ���ڴ� %d�Դϴ�\n",num2);
		}
		if (num1==num2) {
			System.out.println("������ �����Դϴ�.");
		}
		
		s.close();

	}

}
