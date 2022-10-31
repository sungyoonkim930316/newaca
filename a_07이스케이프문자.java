package day01;

public class a_07이스케이프문자 {

	public static void main(String[] args) {

		// 이스케이프 문자
		// 1. \n : 한 줄 띄어쓰기
		// 2. \t : tap 키
		// 3. \", \" => " ' 특수 기능 제거 그냥 문자 출력
		
		System.out.println("안녕 \n 하세요 %d");
		System.out.println(" \" 안녕 하세요 \" ");
		System.out.println(" \' 안녕 하세요 \' ");
		
		// 덧셈 연산자
		System.out.println(10+3);
		
		// 연결 연산자
		System.out.println("안녕" + "하세요.");
		
		// 숫자 + 문자
		System.out.println(10+"3"); // 103
		
		// 참고용 문자 한개 데이터 '' 는 실은 숫자다 ==> 숫자 : 덧셈인식
		System.out.println(10+'3'); // 61 문자 한개 타입 실은 정수 타입 '3'을 ASCII CODE로 인식함
		
		// 문자 + 숫자
		System.out.println("10"+3+3);
		// System.out.println("10"+"3"+"3"); // 1033
		System.out.println("10" + (3+3));
		
		 /*
		[문제]
			가로가 3이고 세로가 7인 삼각형의 넓이를 구하시오.
			단, 소수점 자리는 두 자리까지 구하시오.
		[정답]
			삼각형 넓이 = 10.50
		 */
		System.out.printf("삼각형 넓이 = %.2f\n", 3.0*7.0/2.0);
	}

}
