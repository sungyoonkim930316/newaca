package day02;

import java.util.Scanner;

public class C_10�հ� {

	public static void main(String[] args) {

		/*
		 * [����] ���������� �Է¹޴´�. ���� ������ 0�� �̸��̰ų� 100�� �ʰ��� �����̴�. �����̸� true, ������ �ƴϸ� false��
		 * ����Ͻÿ�. ���۽ð� : 15:42 ����ð� : 15:43
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("���������� �Է��ϼ��� : ");
		int score = s.nextInt();
		boolean check = score >= 0 && score <= 100;
		System.out.println(!check);
		// boolean check=score<0||score>100;
		// System.out.println(check);

		s.close();
	}

}
