package day04;

public class F_04�ݺ�������1 {

	public static void main(String[] args) {
		/*
		 * [����] �Ʒ� ������ �����ϴ� ���� �ۼ��Ͻÿ�. 
		 * ����1) 1~10���� �ݺ����� �����Ѵ�. 
		 * ����2) ���ڰ� ¦���� �� "¦��"�� ����Ѵ�.
		 * ����3) ���ڰ� Ȧ���� �� "Ȧ��"�� ����Ѵ�.
		 */
		int i=1;
		while(i<=10) {
			if(i%2==0) {System.out.print(i+"(¦��) ");}
			else {System.out.print(i+"(Ȧ��) ");}
			i++;
		}
	}
}
