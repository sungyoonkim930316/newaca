package day04;

public class F_08�ݺ������3 {

	public static void main(String[] args) {
		/*
		 * [����] 
		 * 50���� 100���� �ڿ����߿��� 9�� ����� ������ ����Ͻÿ�. 
		 * [��] (54 63 72 81 90 99) 6 ��
		 */
		int i=50;
		int cnt=0;
		System.out.print("(");
		while (i<=100) {
			if(i%9==0) {
				System.out.print(i+" ");
				cnt++;
			}
			i++;
		}
		System.out.print(") "+cnt+"��");
		
	}
}
