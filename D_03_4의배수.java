package day02;

import java.util.Scanner;

public class D_03_4�ǹ�� {

	public static void main(String[] args) {

		/*
		 * [����] ������ �Է¹޾� �� ������ ���� 4�� ��������� Ȯ���� "4�� ����Դϴ�." �Ǵ� "4�� ����� �ƴմϴ�."�� ����Ͻÿ�.
		 * ���۽ð� : 16:47
		 * ����ð� : 16:49
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num=s.nextInt();
		boolean check=num%4==0;
		
		if (check) {
			System.out.println("�ش� ������ 4�� ����Դϴ�.");
		}
		
		if (!check) {
			System.out.println("�ش� ������ 4�� ����� �ƴմϴ�.");
		}
		
		s.close();

	}

}
