package day04;

public class F_10�ݺ������1 {

	public static void main(String[] args) {

		/*
		[����]
			48�� ����� ���� ����Ͻÿ�.
			�����? 0 ���� ū �� �߿��� � ���� ������ �������� �ϴ� ���� �� ���� ������ �Ѵ�.
			��) 8�� ��� => 1, 2, 4, 8
		[����]
			1, 2, 3, 4, 6, 8, 12, 16, 24, 48
		 */
		
		int i=1;
		while(i<=48) {
			if(48%i==0) {
				if(i==48) {System.out.print(i+" ");}
				else {System.out.print(i+", ");}
			}
			i++;
		}
	}
}