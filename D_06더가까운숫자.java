package day02;

import java.util.Scanner;

public class D_06���������� {

	public static void main(String[] args) {

		/*
		 * [����] a �� c �� ����ڰ� b �� ��������� ����Ͻÿ�. 
		 * [���] a �� �� ������. c �� �� ������. a �� c �� �Ȱ���.
		 * ���۽ð� : 
		 * ����ð� : 
		 */
		int a = 96;
		int b = 100;
		int c = 102;
		
		int gap1=b-a;
		int gap2=c-b;
		
		if (gap1==gap2) {
			System.out.println("a �� c �� �Ȱ���.");
		}
		if (gap1<gap2) {
			System.out.println("a�� �� ������.");
		}
		if (gap2<gap1) {
			System.out.println("c�� �� ������.");
		}

	}

}
