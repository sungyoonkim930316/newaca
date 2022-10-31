package day01;

public class b_04변수의값교체 {

	public static void main(String[] args) {

		// 변수의 값 교체 매우 중요, 암기 필수
		
		int a=5;
		int b=10;
		System.out.printf("a=%d, b=%d\n", a,b);
		//a=b;
		//b=a;
		// a=10, b=5;
		System.out.printf("a=%d, b=%d\n", a,b);
		
		// 두 컵 우유 가득 든 컵, 물이 가득 든 컵
		// 한 방울도 흘리지말고 두 컵을 교체하시오.
		// 새로운 컵을 만들어서 값을 넣어주면 된다
		// 힌트 int temp
		
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
