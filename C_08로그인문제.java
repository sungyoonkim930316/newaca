package day02;

import java.util.Scanner;

public class C_08�α��ι��� {

	public static void main(String[] args) {

		/*
		 * [����] ö���� �α����� �Ϸ��� �Ѵ�. ���̵�� ��й�ȣ�� �Է¹޴´�. ���̵�� ��й�ȣ �� �� �ϳ��� Ʋ���� �α����� �����Ѵ�.
		 * joinId�� joinPw�� ö���� �̹� ������ ���̵�� ��й�ȣ�̴�. ���۽ð� : 14:58 ����ð� : 15:05
		 */

		Scanner s = new Scanner(System.in);

		// ȸ������
		// ����ڰ� �Է��� ���� ������ id, pwd�� ����� ��
		System.out.println("ȸ�������Ͻ� ���̵� �Է��ϼ���");
		int joinId = s.nextInt();
		System.out.println("ȸ�������Ͻ� ��й�ȣ�� �Է��ϼ���");
		int joinPw = s.nextInt();
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		System.out.println("----------------------------");

		// �α��� ���ǽ� �����
		System.out.println("�α���");
		System.out.println("ID�� �Է��ϼ���");
		int inputId = s.nextInt();
		System.out.println("PW�� �Է��ϼ���");
		int inputPw = s.nextInt();

		boolean check = inputId == joinId && inputPw == joinPw;
		System.out.println(check);

		s.close();

	}

}
