package day03;

import java.util.Scanner;

public class D_02���� {
	
	public static void main(String[] args) {

		/*
		 * [����] 1. ���������� �Է¹޴´�. 
		 * 2. ���������� �ش��ϴ� ������ ����Ѵ�. 
		 * 3. �Ʒ��� ����ǥ�̴�. 
		 * 91 ~ 100�� A���� 
		 * 81 ~ 90�� B���� 
		 * 80���� ����� 
		 * 4. ��, �����̰ų� A������ B������ ���� �ڸ��� 7�� �̻��̸�, +�� �߰��Ѵ�. A������ B������ ����
		 * �ڸ��� 3�� �����̸�, -�� �߰��Ѵ�.
		 * 
		 * ��) 100 => A+ 87 => B+ 82 => B- 23 => �����
		 */
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("���������� �Է��ϼ��� : ");
		int score=s.nextInt();
		
		boolean success=score>80;

		if(success) {
			int one=score%10;
			if(score>90) {System.out.print("A");}
			if(score>80&&score<=90) {System.out.print("B");}
			if(one>=7||one==0) {System.out.println("+");}
			if(one<=3&&one>0) {System.out.println("-");}
		}
		
		if(!success) {System.out.println("�����");}
		
		s.close();

	}

}
