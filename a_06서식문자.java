package day01;

public class a_06서식문자 {

	public static void main(String[] args) {
		
		// + : 숫자끼리 쓰이면 : 덧셈 연산자
		// + : 문자와 쓰이면 : 연결 연산자
		System.out.println(10-3*3); // 1출력
		System.out.println((10-3)*3); // 괄호 속 연산이 먼저 실행돼서, 21 출력
		System.out.println("1) "+10+3);   // 맨 앞에 문자열이 있어서 뒤에 있는 10과 3도 문자로 인식하기 때문에 103으로 나온다.
		System.out.println("1) "+(10+3)); // 괄호 속 연산이 먼저 실행돼서, 앞에 문자열이 있음에도 13을 출력한다.
		System.out.println(10+3+"입니다."); // 숫자가 앞에 왔기 때문에 10+3이 먼저 계산되고 두 번째 +를 연결연산자로 인식할 수 있다.
		// System.out.println("test"*3); -> 에러 반환, 문자열은 + 기호만 사용 가능
		
		System.out.println("나는 사과를 " + 10 + "개중에 " + 3 + "개 먹었다.");
		System.out.println("사과가 " + (10-3) + "개 남았다.");
		// %d 정수 ex 10 
		// %f 실수 ex 10.0
		// %c 문자한개 ex '가'
		// %s 문자여러개 ex "가나다"
		System.out.printf("사과가 %d개 남았다. \n", 10-3);
		System.out.printf("%s가 %d개 남았다. \n", "바나나", 10-3);
		
		// printf 소숫점 제어할 수 있다
		System.out.printf("%d \n" , 10);
		System.out.printf("%.1f \n" , 10/3.0);
		
		System.out.println("1 이름 : " + "김성윤");
		System.out.println("2 나이 : " + 29);
		System.out.println("===========");
		System.out.printf("이름 : %s \n나이 : %d \n","김성윤", 29);
		
		// 문제 예시)
		// 현금이 1,000원이 있다.
		// 200원짜리 과자 구입 후, 거스름돈을 출력하시오.
		
		// 거스름 돈 = 800원 입니다.
		System.out.println("거스름 돈 = " + (1000-200) + "원 입니다.");
		System.out.printf("거스름 돈 = %d원 입니다. \n", 1000-200);
		
	}

}
