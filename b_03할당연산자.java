package day01;

public class b_03�Ҵ翬���� {

	public static void main(String[] args) {

		int num=10;
		
		System.out.println(num); // 10
		System.out.println(num+1); // 11
		System.out.println(num); // 10
		// ���� = ���� �����ڰ� �־������ ���Ҵ� ���� : �� ���� ����
		num = num+1; // ���Ҵ�
		// ������ �켱���� : ��������ڰ� �Ҵ翬���ں��� ������ �ִ� -> ��ǻ� �Ҵ翬���ڰ� ��κ��� ��Ȳ���� ���� �������� ó���ȴ�. 
		System.out.println(num); // 11
		
		int temp = num; // �����ʿ� �ִ� ���� ��(11)�� ���� temp �޸𸮹濡 ����
		//int temp = 11;
	}

}
