package day05;

import java.util.Random;
import java.util.Scanner;

public class D_08īī���ؽ� {

	public static void main(String[] args) {

		/*
		 * # īī�� �ý� 
		 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�. 
		 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�. 
		 * 3. �޴��� �Ʒ��� ����. 
		 * 1) �ӵ����� : 1~3������ ���� 
		 * 2) ���⼳�� : ��(1)��(2)��(3)��(4) 
		 * 3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵� 
		 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 */
		
		Random r=new Random();
		Scanner scan = new Scanner(System.in);
		

		// ������(destination)
//		int desX = 0;
//		int desY = 0;
		int desX=r.nextInt(21)-10;
		int desY=r.nextInt(21)-10;

		// ���� ��ġ
		int x = 0;
		int y = 0;

		// ����(direction)
		int dir = 0;

		// �ӵ�
		int speed = 0;

		// ���
		int fee = 0;

		boolean run = true;
		while (run) {

			System.out.println("= īī�� �ý� =");
			
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("============");
			while (true) {
				System.out.println("1.���⼳��");
				System.out.println("2.�ӵ�����");
				System.out.println("3.�̵��ϱ�");
				
				System.out.print("�޴� ���� : ");
				int sel = scan.nextInt();
				
				if (sel == 1) {
					System.out.print("�̵��� ������ �����ϼ���. ��[1] ��[2] ��[3] ��[4] : ");
					dir=scan.nextInt();
					//if(dir>4||dir<1) {continue;}
					if(dir==1) {dir=1;}
					if(dir==2) {dir=2;}
					if(dir==3) {dir=3;}
					if(dir==4) {dir=4;}
					break;
				} else if (sel == 2) {
					System.out.println("������ �ӵ��� �����ϼ���. [1] [2] [3]");
					speed=scan.nextInt();
					if(speed==1) {speed=1;}
					if(speed==2) {speed=2;}
					if(speed==3) {speed=3;}
					break;
				} else if (sel == 3) {
					if(dir==0||speed==0) {System.out.println("����� �ӵ��� �����Ͻÿ�.");}
					else {
						if(dir==1) {x=x+speed;}
						else if(dir==2) {x=x-speed;}
						else if(dir==3) {y=y-speed;}
						else if(dir==4) {y=y+speed;}
						break;
					}
				} else {System.out.println("�Է� ����");}
			}
			if(x==desX&&y==desY) {
				if(desX<0) {
					if(desY<0) {desY=desY*(-1);}
					desX=desX*(-1);
				} else if(desY<0) {
					if(desX<0) {desX=desX*(-1);}
					desY=desY*(-1);
				}
				fee=(desX+desY)*50;
				System.out.println("�������� �����ߴ�. �ýÿ�� = "+fee);
				run=false;
			}

		}
		scan.close();

	}

}
