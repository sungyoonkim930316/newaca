package day03;

import java.util.Random;
import java.util.Scanner;

public class D_16�����ڱ�ȣ {

	public static void main(String[] args) {

		/*
		[����]
			1. 1~10 ������ ���� ���� 2���� x, y ������ ���� �����Ѵ�.
				��) x = 3, y = 4
			2. 1~4 ������ ���� ���� 1���� op ������ �����Ѵ�.
				��) op = 4
			3. op�� ���� ������ ��ȣ�� �ش�ȴ�.
			   1. +		2. -	3. *	4.%
				��) op�� ���� 3�̸� ���ϱ��̴�.
			4. ȭ�鿡 ���� 2���� ���� ����Ѵ�.
			   ��, ��ȣ�� ����ϸ� �ȵȴ�.
			   ��) 3 ? 4 = 12
			       1. +		2. -	3. *
			5. ����ڴ� ��ȣ�� ���߸� �ȴ�.
			   ��) 3 ==> ����
	*/
		Random r=new Random();
		int x=r.nextInt(10)+1;
		int y=r.nextInt(10)+1;
		int op=r.nextInt(4)+1;
		if(op==1) {System.out.printf("%d ? %d = %d\n",x,y,x+y);}
		if(op==2) {System.out.printf("%d ? %d = %d\n",x,y,x-y);}
		if(op==3) {System.out.printf("%d ? %d = %d\n",x,y,x*y);}
		if(op==4) {System.out.printf("%d ? %d = %d\n",x,y,x%y);}
		System.out.println();
		System.out.println("���ڸ� �Է��Ͽ� ?�� �˸´� ��ȣ�� �Է��ϼ���");
		
		Scanner s=new Scanner(System.in);
		System.out.print("(1 = +, 2 = -, 3 = *, 4 = %) : ");
		int ans=s.nextInt();
		boolean err=ans>4||ans<1;
		if(err) {System.out.println("�Է¿���");}
		if(!err) {
			if(ans==op) {System.out.println("�����Դϴ�.");}
			if(ans!=op) {
				System.out.println("�����Դϴ�.");
				System.out.println();
				System.out.println("==����==");
				System.out.println(op);
			}
		}
		
		
		s.close();
		
		// x=2 y=2�϶� ������ 4�� ans�� 1�� �ǰ� 3�� �ž��ϴµ� ��ؾ� �� �� �°��� �� �ִ��� ã�ƺ���
	
	}

}
