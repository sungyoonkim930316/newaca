package day02;

import java.util.Scanner;

public class C_09���л� {

	public static void main(String[] args) {

		/*
		 * [����] ���������� 100���̰ų� ���������� 100���̸� ���л��̴�. ���������� ���������� �Է¹ް� ���л��̸� true�� ����Ͻÿ�.
		 * ���۽ð� : 15:17 ����ð� : 15:18
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("���������� �Է��ϼ��� : ");
		int kor = s.nextInt();
		System.out.print("���������� �Է��ϼ��� : ");
		int math = s.nextInt();

		boolean korCheck = kor >= 0 && kor <= 100;
		boolean mathCheck = math >= 0 && math <= 100;

		boolean check = korCheck && mathCheck && kor == 100 || math == 100;
		System.out.println(check);

		s.close();

	}

}
