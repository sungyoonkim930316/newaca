package day02;

public class C_04�������ڹ��� {

	public static void main(String[] args) {

		int a = 3;
		int b = 1;
		System.out.println(a + b == 4 && a - b == 2);
		int c = -2;
		int d = -7;
		System.out.println(3 * c - d == 1 && -2 * c + d == -3);
		int e = 2;
		int f = 4;
		System.out.println(5 * e - 2 * f == 2 && e + 3 * f == 14);

		System.out.println("---------------------------------------------------------");

		// ����) ����1�� 60 �̻��̰� 100�����̸� true�� ����Ͻÿ�.
		int score1 = 78;

		System.out.println(60 <= score1 && score1 <= 100);

		// ����) ����2�� 0���� �۰ų� 100����ũ�� true�� ����Ͻÿ�.
		int score2 = -1;

		System.out.println(score2 < 0 || score2 > 100);

		System.out.println("---------------------------------------------------------");

		// ����1) ����1�� 3�� ����̸鼭, ¦���Դϱ�?
		int num1 = 12;
		System.out.println(num1 % 3 == 0 && num1 % 2 == 0);
		// true

		num1 = 5;
		System.out.println(num1 % 3 == 0 && num1 % 2 == 0);
		// false

		num1 = 20;
		System.out.println(num1 % 3 == 0 && num1 % 2 == 0);
		// false

		// ����2) ����2�� Ȧ���̰ų� 5�� ����Դϱ�?
		int num2 = 50;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// true

		num2 = 4;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// false

		num2 = 15;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// true

		num2 = 23;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// true

	}

}
