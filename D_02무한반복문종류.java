package day05;

public class D_02���ѹݺ������� {

	public static void main(String[] args) {

		int i = 1;
		boolean run = true;
		while (run) {

			System.out.print(i + " ");
			if (i == 10) {
				run = false; // ���� �ݺ��� �� ����
			}

			i++;
		}
		System.out.println();
		System.out.println("�ݺ��� ���� i = " + i);

		System.out.println();

		i = 1;
		while (true) {

			System.out.print(i + " ");
			if (i == 10) {
				break; // ��� ����
			}
			i++;
		}
		System.out.println();
		System.out.println("�ݺ��� ���� i = " + i);

	}

}
