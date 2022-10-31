package day02;

public class C_04논리연산자문제 {

	public static void main(String[] args) {

		int a = 3;
		int b = 1;
		System.out.println(a + b == 4 && a - b == 2);
		int c = -2;
		int d = -7;
		System.out.println(3 * c - d == 1 && -2 * c + d == -3);
		int e = 2;
		int f = 4;
		System.out.println(5 * e - 2 * f == 2 && e + 3 * f == 14);

		System.out.println("---------------------------------------------------------");

		// 문제) 점수1이 60 이상이고 100이하이면 true를 출력하시오.
		int score1 = 78;

		System.out.println(60 <= score1 && score1 <= 100);

		// 문제) 점수2가 0보다 작거나 100보다크면 true를 출력하시오.
		int score2 = -1;

		System.out.println(score2 < 0 || score2 > 100);

		System.out.println("---------------------------------------------------------");

		// 문제1) 숫자1이 3의 배수이면서, 짝수입니까?
		int num1 = 12;
		System.out.println(num1 % 3 == 0 && num1 % 2 == 0);
		// true

		num1 = 5;
		System.out.println(num1 % 3 == 0 && num1 % 2 == 0);
		// false

		num1 = 20;
		System.out.println(num1 % 3 == 0 && num1 % 2 == 0);
		// false

		// 문제2) 숫자2가 홀수이거나 5의 배수입니까?
		int num2 = 50;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// true

		num2 = 4;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// false

		num2 = 15;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// true

		num2 = 23;
		System.out.println(num2 % 2 != 0 || num2 % 5 == 0);
		// true

	}

}
