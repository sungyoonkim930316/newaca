package day05;

import java.util.Scanner;

public class D_05�ִ밪���ϱ� {

	public static void main(String[] args) {

		/*
		 * # �ִ밪 ���ϱ�[2�ܰ�]
		 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
		 */
		
//		Scanner s=new Scanner(System.in);
//		
//		int i=1;
//		int score=0;
//		int rs1=0;
//		int rs2=0;
//		int rs3=0;
//		
//		while(true) {
//			System.out.print("������ �Է��ϼ��� : ");
//			score=s.nextInt();
//			if(i==1) {
//				rs1=score;
//			}
//			else if(i==2) {
//				rs2=score;
//			}
//			else if(i==3) {
//				rs3=score;
//				break;
//			}
//			i++
//		}
//		if(rs1>rs2&&rs2>rs3) {System.out.printf("ù ��° ���� %d�� �� ��° ���� %d�� �� ��° ���� %d�� ���� ū ���ڴ� %d�Դϴ�.",rs1,rs2,rs3,rs1);}
//		else if(rs2>rs1&&rs2>rs3) {System.out.printf("ù ��° ���� %d�� �� ��° ���� %d�� �� ��° ���� %d�� ���� ū ���ڴ� %d�Դϴ�.",rs1,rs2,rs3,rs2);}
//		else {System.out.printf("ù ��° ���� %d�� �� ��° ���� %d�� �� ��° ���� %d�� ���� ū ���ڴ� %d�Դϴ�.",rs1,rs2,rs3,rs3);}
//		
//		s.close();
		
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int max=0;
		while(i<=3) {
			System.out.printf("[%d] ���� >> ",i);
			int num=s.nextInt();
			if(i==1) {
				max=num;
			}
			
			if(max>num) {
				max=num;
			}
			i++;
		}
		System.out.println("�ּҰ� = "+max);
		s.close();
	}
}
