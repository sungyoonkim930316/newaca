package day05;

import java.util.Random;

public class D_06�����л� {

	public static void main(String[] args) {

		/*
		 * # �����л�
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . ������(10��)�� ������ ����� ����Ѵ�.
		 * . �հ��� ���� ����Ѵ�.
		 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */
		
		Random r=new Random();
		int stuScore=0;
		int totScore=0;
		int success=0;
		int god=0;
		int godNumber=0;
		
		int i=1;
		while(i<=10) {
			int score=r.nextInt(100)+1;
			System.out.print(score+"�� ");
			stuScore=score;
			if(i==1) {god=score;} 
			else {if (god<score) {god=score;godNumber=i;}}
			if(stuScore>=60) {success++;}
			if (god<score) {god=score;}
			totScore+=stuScore;
			i++;
		}
		System.out.println();
		System.out.println("������ ���� : "+totScore+"��");
		System.out.println("������ ������� : "+(double)totScore/10.0+"��");
		System.out.println("�հ��� �� : "+success+"��");
		System.out.println("1�� �л� ��ȣ : "+godNumber+"��");
		System.out.println("1�� �л� ���� : "+god+"��");
	}
}
