package day03;

import java.util.Scanner;

public class D_06�ִ밪 {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * 1. ���� 3���� �Է¹޴´�. 
		 * 2. �Է¹��� 3���� ���ڸ� ���Ѵ�. 
		 * 3. ���� ū ��(max)�� ����Ѵ�.
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.println("���� �ٸ� 3���� ������ �Է��ϼ��� : ");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
//		System.out.println("����1 : ");
//		int num1=s.nextInt();
//		System.out.println("����2 : ");
//		int num2=s.nextInt();
//		System.out.println("����3 : ");
//		int num3=s.nextInt();
		
//		boolean err=num1==num2||num1==num3||num2==num3;
//		int max=num1;
//		if(max<num2) {
//			max=num2;
//		}
//		if(max<num3) {
//			max=num3;
//		}
//		
//		if(err) {System.out.println("�Է¿���");}
//		if(!err) {System.out.println("���� ū ���� "+max+"�Դϴ�.");}
		
		boolean err=num1==num2||num1==num3||num2==num3;
		int min=num1;
		if(min>num2) {
			if(num2>num3) {min=num3;}
			min=num2;
		}
		if(min>num3) {
			if(num3>num2) {min=num2;}
			min=num3;
		}
		
		if(err) {System.out.println("�Է¿���");}
		if(!err) {System.out.println("���� ���� ���� "+min+"�Դϴ�.");}
		
		s.close();

	}

}
