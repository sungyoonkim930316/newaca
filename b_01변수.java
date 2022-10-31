package day01;

public class b_01변수 {

	public static void main(String[] args) {
		// int double char String boolean
		
		// data type : 자료형
		
		// 변수 : 변할 수 있는 수 => 값을 단 1개 저장하는 것
		// 변수의 선언, 초기값
		// 선언 => 메모리 공간 값 할당
		
		// 숫자 =? 소숫점 있는 수, 소숫점이 없는 거
		
		// 1. 정수 : 소숫점이 없는 수 int
		
		// 변수의 선언 : 자료형타입 + 식별자 (메모리방의 이름)
		int num;
		// 변수의 초기값 설정
		num = 10; // 10이라는 값을 num이라는 변수에 할당한다. 여기서 등호는 equal이 아니라 할당 연산자라고 이해해야한다.(넣어준다), 맨 처음에 넣어주는 값(10) => 초기값
		System.out.println(num); // num안에 들어있는 값을 출력
		
		int age = 30;
		age = 40; // 값의 재할당, 기존값 30을 버리고 40으로 변경
		
		// int age = 10; 같은 이름의 변수 생성 불가능
		// age = "50"; 오류반환 -> age는 int로 선언되었기 때문에 정수값 외의 String값 double값등이 들어갈 수 없다.
		
		// 2. 실수 double
		double dNum = 3.14; // 변수의 선언과 초기값
		System.out.println("dNum = "+dNum);
		
		// 3. 문자 한개 char ''
		char c1='a';
		char c2='가';
		char c3='1';
		
		System.out.printf("c1=%c, c2=%c, c3=%c\n",c1,c2,c3);
		
		// 4. 문자 여러개 String ""
		String str1="java";
		String name="김성윤";
		System.out.println(str1+" "+name);
		
		// 5. 참과 거짓 boolean 불대수 true/false
		
		boolean result = true;
		result = false;
		
	}

}
