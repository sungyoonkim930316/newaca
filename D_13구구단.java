package day03;

import java.util.Random;
import java.util.Scanner;

public class D_13������ {

	public static void main(String[] args) {

		/*
		 * [����] 
		 * 1. ������ ������ �����ϱ� ���� ���� 2���� �����ϰ� �����Ѵ�. 
		 * 2. ������ ������ ����Ѵ�. 
		 * ��) 3 x 7 = ? 
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�. 
		 * 4. ������ ���� "����" �Ǵ� "����"�� ����Ѵ�.
		 * 
		 * 2~9�ܱ���
		 * 2*1 ~2*9 1~9���� ��
		 */
		
		Random r=new Random();
		int firstRanNum=r.nextInt(8)+2;
		int secondRanNum=r.nextInt(9)+1;
		System.out.printf("%d x %d = ?\n",firstRanNum,secondRanNum);
		
		Scanner s=new Scanner(System.in);
		int ans=s.nextInt();
		boolean err=ans<2||ans>81;
		if (err) {System.out.println("�Է¿���");}
		if (!err) {
			int mult=firstRanNum*secondRanNum;
			if (mult==ans) {System.out.println("����");}
			if (mult!=ans) {System.out.println("����");}
		}
		s.close();
	}

}
