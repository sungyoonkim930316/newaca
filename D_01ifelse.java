package day04;

public class D_01ifelse {

	public static void main(String[] args) {

		/*
		 * () => �Ұ�ȣ {} => �߰�ȣ [] => ���ȣ
		 */

		// if(���ǽ�){ }
		// ���࿡ ���ǽ��� true ��� { }�� ������

		int a = 10;
		int b = 10;

		if (a == b) {
			System.out.println("a�� b�� ����");
			System.out.println(a);
		}

		// if ���� ���� �����̸� { }(�߰�ȣ ) �������� �ϴ� => ����
		if (a != b)
			System.out.println("a�� b�� �ٸ���");
		System.out.println("dd");

		// if(���ǽ�){ } else{ }
		// ���࿡ ���ǽ��� true�� if ���� ����
		// else �׷��������� else ������ ����

		// �Ʒ��� ������ �߻���Ų��.
		System.out.println(">>> ���Ǳ� <<<");
		System.out.println("[1.���� 2.����� 3.���]");
		System.out.println("��ȣ�� �Է��ϼ��� : 1");
		int select = 2;

		if (select == 1) {
			System.out.println("1.����");
		}
		if (select == 2) {
			System.out.println("2.�����");
		}
		if (select == 3) {
			System.out.println("3.���");
		} else {
			System.out.println("����");
		}

		System.out.println("-------------------------------");

		System.out.println(">>> ���Ǳ� <<<");
		System.out.println("[1.���� 2.����� 3.���]");

		System.out.println("��ȣ�� �Է��ϼ��� : 1");
		select = 1;

		if (select == 1) {
			System.out.println("1.����");
		} else if (select == 2) {
			System.out.println("2.�����");
		} else if (select == 3) {
			System.out.println("3.���");
		} else {
			System.out.println("����");
		}

	}

}
