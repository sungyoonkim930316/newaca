package day04;

public class F_11�����ڸ� {

	public static void main(String[] args) {
		
		/*
		 * [����] 
		 * 	9�� ����� ���� �ڸ��� 6�� ù��° ��� ����Ͻÿ�.
		 *  �� : 36
		 */
		
		int i=1;
		while(i<=100) {
			if(i%9==0) {
				if(i%10==6) {System.out.println(i);}
			}
			i++;
		}
		
		int j=9;
		while(j%10!=6) {j+=9;}
		System.out.println(j);
	}
}
