package day01;

public class b_06�ڷ�����ȯ {

	public static void main(String[] args) {

		// �ڷ��� ��ȯ : Ÿ��ĳ����
		// �ڵ����� �ڷ��� ��ȯ
		
		System.out.println(10+3.0);
		
		// ���� �ڷ��� ��ȯ
		int a=10;
		System.out.println(a);
		
		double b=a;
		System.out.println(b);
		
		b=3.14;
		// ���� �ڷ��� ��ȯ
		a=(int)b;
		System.out.println(a);
		
		int sum=a+(int)b; // int 3 + double 3.14 = 13.14
		System.out.printf("a = %d, b=%d\n", a, (int)b);
		
		char c1='a'; // ������ �����ڵ�(ASCII code)
		System.out.println(" c1 = "+c1+" (int)c1 = "+(int)c1);
		c1='A';
		System.out.println(" c1 = "+c1+" (int)c1 = "+(int)c1);
		
		//c1='��'; -> �ѱ��� ASCII�ڵ尡 �ƴ� �����ڵ尡 ����
		//System.out.println(" c1 = "+c1+" (int)c1 = "+(int)c1);
		
		// �ڵ����� ������ �����ڵ带 65�����ͼ� +10 => 75
		System.out.println(c1+10);
		
		// int test=(int)true; > �̷� �� �ȵ�
		
	}

}
