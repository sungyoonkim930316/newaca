package day01;

public class b_01���� {

	public static void main(String[] args) {
		// int double char String boolean
		
		// data type : �ڷ���
		
		// ���� : ���� �� �ִ� �� => ���� �� 1�� �����ϴ� ��
		// ������ ����, �ʱⰪ
		// ���� => �޸� ���� �� �Ҵ�
		
		// ���� =? �Ҽ��� �ִ� ��, �Ҽ����� ���� ��
		
		// 1. ���� : �Ҽ����� ���� �� int
		
		// ������ ���� : �ڷ���Ÿ�� + �ĺ��� (�޸𸮹��� �̸�)
		int num;
		// ������ �ʱⰪ ����
		num = 10; // 10�̶�� ���� num�̶�� ������ �Ҵ��Ѵ�. ���⼭ ��ȣ�� equal�� �ƴ϶� �Ҵ� �����ڶ�� �����ؾ��Ѵ�.(�־��ش�), �� ó���� �־��ִ� ��(10) => �ʱⰪ
		System.out.println(num); // num�ȿ� ����ִ� ���� ���
		
		int age = 30;
		age = 40; // ���� ���Ҵ�, ������ 30�� ������ 40���� ����
		
		// int age = 10; ���� �̸��� ���� ���� �Ұ���
		// age = "50"; ������ȯ -> age�� int�� ����Ǿ��� ������ ������ ���� String�� double������ �� �� ����.
		
		// 2. �Ǽ� double
		double dNum = 3.14; // ������ ����� �ʱⰪ
		System.out.println("dNum = "+dNum);
		
		// 3. ���� �Ѱ� char ''
		char c1='a';
		char c2='��';
		char c3='1';
		
		System.out.printf("c1=%c, c2=%c, c3=%c\n",c1,c2,c3);
		
		// 4. ���� ������ String ""
		String str1="java";
		String name="�輺��";
		System.out.println(str1+" "+name);
		
		// 5. ���� ���� boolean �Ҵ�� true/false
		
		boolean result = true;
		result = false;
		
	}

}
