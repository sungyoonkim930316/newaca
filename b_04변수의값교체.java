package day01;

public class b_04�����ǰ���ü {

	public static void main(String[] args) {

		// ������ �� ��ü �ſ� �߿�, �ϱ� �ʼ�
		
		int a=5;
		int b=10;
		System.out.printf("a=%d, b=%d\n", a,b);
		//a=b;
		//b=a;
		// a=10, b=5;
		System.out.printf("a=%d, b=%d\n", a,b);
		
		// �� �� ���� ���� �� ��, ���� ���� �� ��
		// �� ��ﵵ �긮������ �� ���� ��ü�Ͻÿ�.
		// ���ο� ���� ���� ���� �־��ָ� �ȴ�
		// ��Ʈ int temp
		
		int temp=a;
		a=b;
		b=temp;
		System.out.printf("a=%d, b=%d\n", a,b);
		
		// temp 5 a 0 b 10
		// temp 5 a 10 b 0
		
		
		/*
		int x = 5;
		int y = 10;
		int temp = x;
		x=y;
		y=temp;
		System.out.printf("x=%d, y=%d\n", x,y);
		*/
		
	}

}
