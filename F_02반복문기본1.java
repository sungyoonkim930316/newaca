package day04;

public class F_02�ݺ����⺻1 {

	public static void main(String[] args) {
		/*
		 * [����1] 1~10���� �ݺ��� 5~9 ��� 
		 * [����1] 5, 6, 7, 8, 9
		 * 
		 * [����2] 10~1���� �ݺ��� 6~3 �Ųٷ� ��� 
		 * [����2] 6, 5, 4, 3
		 * 
		 * [����3] 1~10���� �ݺ��� ¦���� ��� 
		 * [����3] 2, 4, 6, 8, 10
		 */
		
		int i=1;
		while(i<=10) {
			if(i>=5&&i<10) {
				if(i<9) {System.out.print(i+", ");}
				else {System.out.print(i);}
			}
			i++;
		}

		System.out.println();
		System.out.println("========");

		i=10;
		while(i>=1) {
			if(i<=6&&i>=3) {System.out.print(i+" ");}
			i--;
		}

		System.out.println();
		System.out.println("========");

		i=1;
		while(i<=10) {
			if(i%2==0) {System.out.print(i +" ");}
			i++;
		}

		System.out.println();
	}

}
