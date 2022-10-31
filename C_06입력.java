package day02;

import java.util.Scanner; // 클래스 위에 패키지 아래 

public class C_06입력 {

	public static void main(String[] args) {

		System.out.println("test");
		// scanner + ctrl + space ==> 자동으로 import 됨

		// Scanner 객체 사용 => 공장을 만든다
		// 사용자에게 입력을 받을 수 있는 Scanner 객체를 생성한다
		// 그 객체 이름은 scan로 Scanner 클래스의 기능 사용할 수 있다

		// 1. Scanner 공장 만들기
		Scanner scan = new Scanner(System.in);
		// 2. 입력받을 안내 출력문 만들기
		System.out.println("숫자 1를 입력 >> ");
		// 3. 입력 받기 => 변수를 생성하기
		int number1 = scan.nextInt(); // 콘솔에서 숫자값 한개를 받아옴

		// 4. 결과 출력
		System.out.println("number1 = " + number1);
		// 공장 한번 만들면 여러번 사용 가능
		System.out.println("숫자 2를 입력 >> ");
		int number2 = scan.nextInt(); // 콘솔에서 숫자값 한개를 받아옴
		System.out.println("number2 = " + number2);

		// 5. 공장 닫기
		scan.close();
		System.out.println("==프로그램 종료==");
	}

}