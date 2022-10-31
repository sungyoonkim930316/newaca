package day01;

public class b_06자료형변환 {

	public static void main(String[] args) {

		// 자료형 변환 : 타입캐스팅
		// 자동으로 자료형 변환
		
		System.out.println(10+3.0);
		
		// 강제 자료형 변환
		int a=10;
		System.out.println(a);
		
		double b=a;
		System.out.println(b);
		
		b=3.14;
		// 강제 자료형 변환
		a=(int)b;
		System.out.println(a);
		
		int sum=a+(int)b; // int 3 + double 3.14 = 13.14
		System.out.printf("a = %d, b=%d\n", a, (int)b);
		
		char c1='a'; // 문자의 숫자코드(ASCII code)
		System.out.println(" c1 = "+c1+" (int)c1 = "+(int)c1);
		c1='A';
		System.out.println(" c1 = "+c1+" (int)c1 = "+(int)c1);
		
		//c1='가'; -> 한글은 ASCII코드가 아닌 유니코드가 적용
		//System.out.println(" c1 = "+c1+" (int)c1 = "+(int)c1);
		
		// 자동으로 문자의 숫자코드를 65가져와서 +10 => 75
		System.out.println(c1+10);
		
		// int test=(int)true; > 이런 건 안됨
		
	}

}
