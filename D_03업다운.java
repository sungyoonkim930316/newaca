package day05;

import java.util.Random;
import java.util.Scanner;

public class D_03���ٿ� {

	public static void main(String[] args) {

		/*
		 * # Up & Down ����[2�ܰ�] 
		 * 1. com �� �������� 1~100���̸� �����Ѵ�. 
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�. 
		 * 5. �ѹ��� ���߸� 100�� 1���� Ʋ�������� 20�� �����ȴ� 
		 * 6. 5�� Ʋ���� ���ӿ��� / ���߸� ���� ���� ���
		 */
		
		Random r=new Random();
		
		int com=r.nextInt(50)+1;
		//System.out.println("���Ѳ� �ѹ� : "+com);
		
		Scanner s=new Scanner(System.in);
		int me=1;
		int score=100;
		
		int trial=1;
		while(trial<=5) {
			System.out.print("���ڸ� ���纸���� : ");
			me=s.nextInt();
			boolean err=me>50||me<1;
			if(!err) {
				trial++;
				if(me>com) {System.out.println("ũ��.");score-=20;continue;}
				if(me<com) {System.out.println("�۴�.");score-=20;continue;}
				else {System.out.println("bingo. ����� ������ : "+score+"��");break;}
			}
			System.out.println("�Է¿���");continue;
		}
		if(trial==6) {System.out.println("���ӿ���");System.out.println("���� : "+com);}
		s.close();
		
//		Random rd = new Random();
//		Scanner sc = new Scanner(System.in);
//		
//		int com = rd.nextInt(100)+1;
//		int score = 100;
//		
//		System.out.println(" [ ���� ���� ] " + com);
//		while (true) {
//			System.out.print("�Է� >>");
//			int me = sc.nextInt();
//
//			if (me < 1 || me > 100) {
//				System.out.println("�Է� ���� : 1 - 100 ");
//			} else {
//
//				if (score == 0) {
//					System.out.println("[ ���� ���� ]");
//					break;
//				}
//				
//				if (me == com) {
//					System.out.println("[ �� �� ]!!");
//					System.out.printf("[ ����� ���� %d ��] \n", score);
//					break;
//					
//				} else if(me < com) {
//					System.out.println("[ Up ]!!");
//					score-=20;
//				}else {
//					System.out.println("[ Down ]!!");
//					score-=20;
//				}
//			}
//		}
	}
}
