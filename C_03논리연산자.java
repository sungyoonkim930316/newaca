package day02;

public class C_03�������� {

	public static void main(String[] args) {

		// �񱳿����� => �� ���� ���ؼ� ��(boolean)���� ���´�

		// ������ 60�� �̻��̸� true ��µǰ� �Ͻÿ�.
		int score = 55;
		System.out.println(score >= 60);
		score = 65;
		System.out.println(score >= 60);

		// ���� 0 - 100

		// ������ 0���� 100 ���� ��ȿ���� üũ
		// System.out.println( 0 <= score <= 100 );

		// �������� : �ΰ��̻��� �񱳿����ڰ��� ���Ѵ�

		score = -10;
		System.out.println("==========================");
		// false && true ==> false
		// false || true ==> true
		// !false => true
		System.out.println(0 <= score || score <= 100);

		/*
		 * �� ������
		 * 
		 * 1. ���� 1) &&(and) : ���� ��� ���̾��, �� �׸���, �̰�, �Ѵ� 2) ||(or) : ������ ��� �����̶� ���̸�, ��
		 * �Ǵ� , Ȥ�� ,�� �� �Ѱ�
		 * 
		 * // ||�� Ű������ġ�� ����Ʈ + �ѱ� ��(��) ǥ���̴�.
		 * 
		 * 3) ! (not) : ���̸� �������� ��ȯ , �����̸� ������ ��ȯ (���� ���ȴ�.)
		 * 
		 * 2. ���� 1) �� �����ڸ� ���� �������� �񱳿����ڸ� ������ �� �ִ�. 2) �� �����ڸ� ���� ���� ������ �����ϴ�.
		 */

		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 9 && 3 == 3);
		System.out.println(10 == 10 && 3 != 2);
		System.out.println(10 != 9 && 3 != 2);

		System.out.println("--------------------");

		int a = 10;
		int b = 3;

		System.out.println(a == a || b == b);
		System.out.println(a != a || b == b);
		System.out.println(a == a || b != b);
		System.out.println(a == a || b != b);

		System.out.println("--------------------");

		System.out.println(true);
		System.out.println(!false);

	}

}
