package day03;

import java.util.Scanner;

public class D_08�ýÿ�� {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * �ý� �⺻����� 10,000���̴�. �⺻ ������� 10km���� �̵��� �� �ִ�. 10km�̻� �̵� �� �߰������ �߻��Ѵ�.
		 * �߰������ 3km�� �̵��� ������ 2,300���� ����� �߰��ȴ�. �̵��Ÿ��� �Է¹ް� ����� ����Ͻÿ�.
		 * 
		 * ��) 8km => 10,000�� 11km => 12,300�� 16km => 14,600��
		 * 
		 * �� ����ڿ��� �̵��Ÿ��� �Է¹��� �� 0km���� ���� �Է¹����� �Է� ���� ���
		 */

		Scanner s=new Scanner(System.in);
		int base=10000;
		
		System.out.print("�̵��� �Ÿ�(km)�� ... : ");
		int distance=s.nextInt();
		boolean err=distance<=0;
		if(err) {System.out.println("�Է¿���");}
		if(!err) {
			if(distance<=10) {System.out.println("��� : "+base+"��");}
			if(distance>10&&distance<=13) {System.out.printf("��� : %d��\n",base+2300);}
			if(distance>13) {
				int add=((distance-10)/3)*2300;
				int money=base+add;
				System.out.println("��� : "+money+"��");
			}
		}
		s.close();
		
		
	}

}
