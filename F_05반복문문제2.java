package day04;

public class F_05�ݺ�������2 {

	public static void main(String[] args) {

		/*	 
		 [����1] 1~10���� �߿��� 3�̸� 7�̻��� ���� ����Ͻÿ�.
		       1 + 2 + 7 + 8 + 9 + 10
		 [����1] 37


		 [����2] 1~10���� �߿��� 3�̸� 7�̻��� ������ ����Ͻÿ�. 
				 1,2,7,8,9,10 ==> 6�� 
		 [����2] 6
		 
		*/
		
		// ���� 1�� Ǯ��
		int i=1;
		int sum=0;
		int cnt=0;
		while(i<=10) {if(i<3||i>=7) {sum+=i;cnt++;}i++;}
		System.out.println(sum);
		System.out.println(cnt);
	}
}
