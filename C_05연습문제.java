package day02;

public class C_05�������� {

	public static void main(String[] args) {

		/*
		 * [����] �Ʒ� ���� a, b, c �߿��� a�� ���� ū ������ ���θ� true �Ǵ� false�� ǥ���Ͻÿ�. [����] true
		 */
		int a = 100;
		int b = 2;
		int c = 5;

		boolean check1 = a > c && a > b;

		System.out.println(check1);

		a = 3;

		boolean check2 = a > c && a > b;

		System.out.println(check2);

		System.out.println("----------------------------------------");

		/*
		 * [����] 3������ ����� 60�� �̻��̸� �հ��̴�. ��, ��� �� ������ 50�� �̸��̸� ���հ��̴�. �Ʒ� ���������� �հ����� ���θ�
		 * �Ǵ��� true �Ǵ� false�� ǥ���Ͻÿ�. [����] false
		 */

		int kor = 100;
		int eng = 87;
		int math = 49;

		double avg = (kor + eng + math) / 3;

		boolean check3 = avg >= 60 && kor >= 50 && eng >= 50 && math >= 50;
		System.out.println(check3);

		System.out.println("----------------------------------------");

		/*
		 * [����] ��ӹ����� Ÿ�� ������ �������Ѵ�. ��߽ð����� 1�ð� ������ �ִ�. ��ӹ������� ������ �ü� 3km�� �ɾ �պ��� �ϰ� 10��
		 * ���� ������ ��ٰ� �ϸ� ������ 1.3km ������ ������ �ٳ�� �� �ִ��� ���θ� �Ǵ��� true �Ǵ� false�� ǥ���Ͻÿ�. [����]
		 * false
		 */

		int entireTime = 60;
		int shoppingTime = 10;
		int walkPerMin = 3000 / 60;
		int takenTime = 1300 / walkPerMin;

		boolean check4 = entireTime > (takenTime * 2) + shoppingTime;

		System.out.println(check4);

	}

}
