package day03;

import java.util.Random;

public class D_14�����ֻ��� {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * ������ 1 ~ 6 �� �ֻ��� 2���� �ִ�. �ֻ��� 2���� ������ ���¼����� ���� ����Ͻÿ�. 
		 * �� �ֻ��������� ���� ���ٸ� �� ������ ���� �ι踦 ����Ͻÿ�. 
		 * [����] 
		 * 2, 3 : 5 
		 * 3, 3 : 6 * 2
		 */
		
		Random r=new Random();
		int diceOne=r.nextInt(6)+1;
		int diceTwo=r.nextInt(6)+1;
		int sum=diceOne+diceTwo;
		System.out.println("�� 1 = "+diceOne);
		System.out.println("�� 2 = "+diceTwo);
		
		boolean c=diceOne==diceTwo;
		
		if(c) {System.out.println("��� = "+(sum*2));}
		if(!c) {System.out.println("��� = "+sum);}
		
	}

}
