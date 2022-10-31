package day01;

public class b_03할당연산자 {

	public static void main(String[] args) {

		int num=10;
		
		System.out.println(num); // 10
		System.out.println(num+1); // 11
		System.out.println(num); // 10
		// 값은 = 대입 연산자가 있어야지만 재할당 가능 : 값 변경 가능
		num = num+1; // 재할당
		// 연산자 우선순위 : 산술연산자가 할당연산자보다 우위에 있다 -> 사실상 할당연산자가 대부분의 상황에서 제일 마지막에 처리된다. 
		System.out.println(num); // 11
		
		int temp = num; // 오른쪽에 있는 변수 값(11)를 왼쪽 temp 메모리방에 저장
		//int temp = 11;
	}

}
