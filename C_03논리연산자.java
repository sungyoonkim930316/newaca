package day02;

public class C_03논리연산자 {

	public static void main(String[] args) {

		// 비교연산자 => 두 값을 비교해서 논리(boolean)값이 나온다

		// 점수가 60점 이상이면 true 출력되게 하시오.
		int score = 55;
		System.out.println(score >= 60);
		score = 65;
		System.out.println(score >= 60);

		// 점수 0 - 100

		// 점수가 0부터 100 까지 유효범위 체크
		// System.out.println( 0 <= score <= 100 );

		// 논리연산자 : 두개이상의 비교연사자값을 비교한다

		score = -10;
		System.out.println("==========================");
		// false && true ==> false
		// false || true ==> true
		// !false => true
		System.out.println(0 <= score || score <= 100);

		/*
		 * 논리 연산자
		 * 
		 * 1. 종류 1) &&(and) : 양쪽 모두 참이어야, 참 그리고, 이고, 둘다 2) ||(or) : 양쪽중 어느 한쪽이라도 참이면, 참
		 * 또는 , 혹은 ,둘 중 한개
		 * 
		 * // ||의 키보드위치는 쉬프트 + 한글 원(돈) 표시이다.
		 * 
		 * 3) ! (not) : 참이면 거짓으로 변환 , 거짓이면 참으로 변환 (추후 사용된다.)
		 * 
		 * 2. 역할 1) 논리 연산자를 통해 여러개의 비교연산자를 연결할 수 있다. 2) 논리 연산자를 통해 범위 설정이 가능하다.
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
