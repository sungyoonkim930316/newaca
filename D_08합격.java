package day02;

import java.util.Scanner;

public class D_08�հ� {

	public static void main(String[] args) {

		/*
		 * [����] ���� ��ȿ�� �˻� 
		 * 1. ���� 2���� �Է¹޾� ����� ���Ѵ�. 
		 * 2. ����� 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�. 
		 * 3.
		 * ����1) �Է¹��� ������ �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�. 
		 * ��) ������ �� �� �Է��߽��ϴ�. 
		 * 4. 
		 * ����2) ����� 60�� �̻��̶� �� �����̶� 50�� �̸��̸�, ���հ��� ����Ѵ�.
		 * ���۽ð� : 17:53
		 * ����ð� : 18:06
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("����1 : ");
		int score1=s.nextInt();
		System.out.print("����2 : ");
		int score2=s.nextInt();
		
		boolean err=score1<0||score2<0||score1>100||score2>100;
		
		if(err) {
			System.out.println("������ �� �� �Է��Ͽ����ϴ�.");
		}
		// ��ø if�� : if���� if
		if(!err) {
			double avg=(score1+score2)/2.0;
			boolean pass=avg>=60&&score1>=50&&score2>=50;
			if(pass) {
				System.out.println("�հ�");
			}
			if(!pass) {
				System.out.println("���հ�");
			}
		}
		
		s.close();

	}

}
