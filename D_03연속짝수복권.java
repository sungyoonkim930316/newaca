package day04;

import java.util.Random;

public class D_03����¦������ {

	public static void main(String[] args) {

		/*
		[�н���ǥ]
			������ Ȱ���ؼ� ���ǹ��� �н��Ѵ�.
		[����]
		[����¦������]
			100~900 ������ �������ڸ� ����Ѵ�. 
			���ڸ��� ���ڸ� ���� ���ڸ��� �и��Ѵ�.		
		[��Ģ]
			[1] ���ڸ���� ¦���̸� "1��"�� ����Ѵ�.
			[2] ���ڸ��� ¦���̰�, ¦���μ��ڰ� �����̸� "2��"�� ����Ѵ�. 
			[3] �׿ܴ� "��"�� ����Ѵ�. 
			[4] ��, 0�� ¦���̴�.
		[����]
			462 : 4,6,2 ���ڸ� ��� ¦���̹Ƿ� "1��"
			245 : 2,4,5 ���ڸ��� ¦���̰� 2,4�����̹Ƿ� "2��"
			456 : 4,5,6 ���ڸ��� ¦�������� ������ �ƴϹǷ� "��"
			782 : 7,8,2 ���ڸ��� ¦���̰� 8,2�����̹Ƿ� "2��" 	
		 */
		
		Random r=new Random();
		int num=r.nextInt(801)+100;
		int hundreds=num/100;
		int tens=(num%100)/10;
		int units=num%10;
		System.out.println("�������� : "+num);
		boolean check1=hundreds%2==0&&tens%2==0;
		boolean check2=tens%2==0&&units%2==0;
		
		if(check1&&check2) {System.out.println("1��");}
		else if(check1||check2) {System.out.println("2��");}
		else {System.out.println("��");}
		
	}

}
