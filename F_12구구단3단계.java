package day04;
import java.util.Random;
import java.util.Scanner;

public class F_12������3�ܰ� {

	public static void main(String[] args) {

		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */
		
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		int trial=1;
		int score=0;
		
		while(trial<=5) {
			int randomNum1=r.nextInt(8)+2;
			int randomNum2=r.nextInt(9)+1;
			int ans=randomNum1*randomNum2;
			
			System.out.println("==������ ���߱� ����==");
			System.out.printf("[%d] %d x %d = ",trial,randomNum1,randomNum2);
			int userNum=s.nextInt();
			boolean check=userNum==ans;
			
			if(check) {System.out.println("�����Դϴ�. +20��");score+=20;System.out.println("���� ���� : "+score+"��");System.out.println("=================");System.out.println();}
			else {System.out.println("Ʋ�Ƚ��ϴ�. +0��");score+=0;System.out.println("���� ���� : "+score+"��");System.out.println("=================");System.out.println();}
			trial++;
		}
		System.out.println("�������� : "+score+"��");
		s.close();
	}

}
