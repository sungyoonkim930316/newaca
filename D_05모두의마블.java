package day04;

import java.util.Random;

public class D_05����Ǹ��� {

	public static void main(String[] args) {

		/*
		[����]
			1. ö���� ���� ����� ���� ������ �ϰ��ִ�.
			2. ������ 0 ~ 20���� �̵��� �� �ִ� �Ÿ��� �ִ�.
			3. ���� ö���� �����̴�.
			4. ö���� ��ġ�� ���������κ��� 9��ŭ �̵��� �����̴�.
			5. 1 ~ 6�� ���ڰ� �ִ� �ֻ��� 2���� ������.
			6. �ֻ��� ������ �ո�ŭ �̵��� �� �ִ�.
			7. ���� �̵��� ö���� ��ġ�� ����Ͻÿ�.
			
			8. ����
				1) �� �ֻ��� ���ڰ� ���� �ٸ� ��쿡��
				   ���� ��ġ���� �ֻ��� ������ �ո�ŭ �̵��Ѵ�.
				   ��) 3, 5 => 8��ŭ �̵�
				2) �� �ֻ����� ���ڰ� ���� ��� ���ʽ��� �̵��Ÿ� 6�� �߰��ȴ�.
				   ��) 2, 2 => 4 + 6 ��ŭ �̵�
				3) 14, 15, 16 ���� ��ġ�� ������ �ִ�.
				   ������ �ɸ��� �ٽ� �ֻ��� 2���� ������
				   �� ���� 6�����̸� [�г�Ƽ] ó�� ��ġ(0)�� �̵��Ѵ�.
				   �� ���� 7�̻��̸� [�г�Ƽ ����] ������ Ż���Ѵ�.(�����ڸ� ����)
				4) 20 �̻��� ���� ������ "�¸�"�� ����Ѵ�.
		 */
		Random r=new Random();
		int diceOne=r.nextInt(6)+1;
		int diceTwo=r.nextInt(6)+1;
//		int diceOne=5;
//		int diceTwo=5;
		int location=9;
		int move=diceOne+diceTwo;
		if (diceOne==diceTwo) {move=move+6;} 
		int locationC=location+move;
		
		System.out.println("������ġ : "+location);
		System.out.println("�ֻ���1 : "+diceOne);
		System.out.println("�ֻ���2 : "+diceTwo);
		System.out.println("-------------------------");
		
		boolean trap=locationC==14||locationC==15||locationC==16;
		if(trap) {
			System.out.println("������ġ : "+locationC);
			System.out.println("������ �ɷȽ��ϴ�.");
			if(move>6) {System.out.println("�ֻ����� ���� 7�̻��̹Ƿ� [�г�Ƽ ����]. ������ġ : "+locationC);}
			else {
				locationC=locationC-locationC;
				System.out.println("�ֻ����� ���� 7�̸��̹Ƿ� [�г�Ƽ]�� ����, ������ġ : "+"'"+locationC+"'"+" ��");
			}
		} else if(!trap) {System.out.println("������ġ : "+locationC);}
		
		else if(locationC>=20) {System.out.println("�¸�");}
		
	}

}
