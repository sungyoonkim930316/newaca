package day01;

public class a_05산술연산자 {

	public static void main(String[] args) {

		// 연산자 operator
		// 산술 더하기 +
		// 산술 빼기 -
		// 산술 곱하기 *
		// 산술 나누기 /
		// 산술 나머지 %
		// * / % => + - 보다 우선 계산됨
		
		System.out.println("산술 연산자 ");
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3); // 정수 소숫점 무시 -> 사실상 몫을 출력한다는 느낌
		System.out.println(10.0 / 3.0); // 실수 제대로 연산
		// 정수 실수 연산 ==> 결과값 실수
		System.out.println(10 / 3.0); // 따라서 실수 제대로 연산
		System.out.println(10.0 / 3); // 따라서 실수 제대로 연산
		System.out.println(10.0 / 1); // 이런식으로 나누어 떨어진다고 해도 실수 데이터로 출력된다.
		System.out.println(10 % 3); // 몫은 제외되고 나머지가 출력됨
	}

}
