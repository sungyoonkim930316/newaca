package day01;

public class a_07�̽����������� {

	public static void main(String[] args) {

		// �̽������� ����
		// 1. \n : �� �� ����
		// 2. \t : tap Ű
		// 3. \", \" => " ' Ư�� ��� ���� �׳� ���� ���
		
		System.out.println("�ȳ� \n �ϼ��� %d");
		System.out.println(" \" �ȳ� �ϼ��� \" ");
		System.out.println(" \' �ȳ� �ϼ��� \' ");
		
		// ���� ������
		System.out.println(10+3);
		
		// ���� ������
		System.out.println("�ȳ�" + "�ϼ���.");
		
		// ���� + ����
		System.out.println(10+"3"); // 103
		
		// ����� ���� �Ѱ� ������ '' �� ���� ���ڴ� ==> ���� : �����ν�
		System.out.println(10+'3'); // 61 ���� �Ѱ� Ÿ�� ���� ���� Ÿ�� '3'�� ASCII CODE�� �ν���
		
		// ���� + ����
		System.out.println("10"+3+3);
		// System.out.println("10"+"3"+"3"); // 1033
		System.out.println("10" + (3+3));
		
		 /*
		[����]
			���ΰ� 3�̰� ���ΰ� 7�� �ﰢ���� ���̸� ���Ͻÿ�.
			��, �Ҽ��� �ڸ��� �� �ڸ����� ���Ͻÿ�.
		[����]
			�ﰢ�� ���� = 10.50
		 */
		System.out.printf("�ﰢ�� ���� = %.2f\n", 3.0*7.0/2.0);
	}

}
