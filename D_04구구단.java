package day02;

import java.util.Scanner;

public class D_04������ {

	public static void main(String[] args) {

		/*
		 * [����] ������ ���� 
		 * 1. ������ ������ �����ϱ� ���� ���� 2���� �Է¹޴´�. 
		 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�. 
		 * ��) 3 x 7 = ? 
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�. 
		 * 4. ������ ���� "����" �Ǵ� "����"�� ����Ѵ�.
		 * 
		 * ���۽ð� : 16:57
		 * ����ð� : 17:00
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1=s.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2=s.nextInt();
		
		System.out.printf("%d x %d = ?",num1,num2);
		System.out.println();
		System.out.print("������ �Է��ϼ��� : ");
		int ans=s.nextInt();
		boolean check=ans==num1*num2;
		
		if (check) { 
			System.out.println("����");
		}
		if (!check) {
			System.out.println("����");
		}
		s.close();

	}

}
