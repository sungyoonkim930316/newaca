package day03;

public class D_01변수의생명주기 {

	public static void main(String[] args) {

		// 비교연산자 : 값 두개를 비교 => true/false
		// < > <= >= == !=

		// 논리연산자 : 비교연산자 두개를 비교 => true/false
		// && : and 그리고 이면서 이고 : 조건 모두 충족 => true
		// || : or 또는, 혹은, 이거나 : 조건 중 한개만 충족 => true : 모두 거짓일때만 false
		// ! : not true <-> false false <-> true

		// 제어문 => 조건문
		// 조건식 : 비교연산자 논리연산자 => boolean 값이 나오는 식
		// if(조건식) { }

		// scope 범위 영역

		int x = 10; // 메인 영역 안에만 살아있는 변수

		// 변수를 생성한다 => 데이터타입 변수이름 초기값

		if (x == 10) {
			// if 조건이 true일때 만 실행
			int y = 5; // if문 안에서 생성된 변수는 if문 안에서만 존재
		}
		// if문이 끝나면 y 변수 메모리방은 소멸되서 없어진다

		// System.out.println(y);
		int z = 5;

		if (x == 10) {
			// x == 10을 만족할때만 들어옴
			if (z % 2 == 1) {
				// x == 10 && z가 홀수일때만 실행
				int y = 10;
			}
			// System.out.println(y);
		}

	}

}
