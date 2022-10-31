package day02;
import java.util.Scanner;

public class D_01조건문 {

	public static void main(String[] args) {

		// 제어문 : 조건문, 반복문
		// 코드의 흐름(위 -> 아래 )을 제어한다

		// if 구조
		// 1. if => 키워드
		// 2. (조건식==>boolean 값) : 비교연산자 , 논리연산자
		// 3. { } : 블럭 , 바디 , 영역

		System.out.println("조건문 밖1 ");

		if (true) {
			System.out.println("실행 O");
		}

		System.out.println("조건문 밖2 ");

		// if 조건이 false 이면 코드 흐름 건너뛰기
		if (false) {
			System.out.println("실행 X");

		}

		System.out.println("조건문 밖3 ");

		int a = 10;
		int b = 11;

		if (a == b) {
			System.out.println("실행2 O");
		}

		if (a != b) {
			System.out.println("실행2 X"); // 이부분은 실행이 안된다.
		}

		System.out.println("조건문 밖4 ");
		
		// 사용자에게 값 1개를 입력받고 짝수면 짝수 출력
		// 홀수면 홀수 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=s.nextInt();
		boolean check=num%2==0;
		
		if (check) {
			System.out.println("짝수");
		}
		
		if (!check) {
			System.out.println("홀수");
		}
		
		s.close();

	}

}
