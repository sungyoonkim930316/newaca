package day05;

import java.util.Scanner;

public class D_07���θ��ڷΰ��� {

	public static void main(String[] args) {

		/*
		 * # ���θ� �ڷΰ���
		 * 
		 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� �ڷΰ��� ������������ �����Ƿ� ������ �� �����ҷ����Ѵ�. 
		 * ��Ʈ) ���� ���� �ݺ����� �߰����ָ� �ȴ�. 
		 * 1. �����Ƿ� 1) Ƽ���� 2) ���� 3) �ڷΰ��� 
		 * 2. �����Ƿ� 1) ����� 2) ġ�� 3) �ڷΰ��� 
		 * 3. ����
		 */

		Scanner scan=new Scanner(System.in);

		boolean run=true;
		while(run) {

			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");

			System.out.print("�޴� ���� : ");
			int sel=scan.nextInt();

			if(sel==1) {
				System.out.println("==============");
				while(true) {
					System.out.println("1)Ƽ����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");
					System.out.print("������ ���� : ");
					int male=scan.nextInt();
					if(male==1) {System.out.println("Ƽ���� ����!");System.out.println("==============");}
					else if(male==2) {System.out.println("���� ����!");System.out.println("==============");}
					else {System.out.println("==============");break;}
				}
			} else if(sel==2) {
				System.out.println("==============");
				while(true) {
					System.out.println("1)�����");
					System.out.println("2)ġ��");
					System.out.println("3)�ڷΰ���");
					System.out.print("������ ���� : ");
					int female=scan.nextInt();
					if(female==1) {System.out.println("����� ����!");System.out.println("==============");}
					else if(female==2) {System.out.println("ġ�� ����!");System.out.println("==============");}
					else {System.out.println("==============");break;}
				}
			} else if(sel==3) {
				run=false;
				System.out.println("���α׷� ����");
			}
		}
		scan.close();
	}
}
