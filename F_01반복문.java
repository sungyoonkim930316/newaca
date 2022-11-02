package day04;

public class F_01반복문 {

	public static void main(String[] args) {

// 증감 연산자 

//		int num = 1;
//		// 1 증가 
//		// 3가지 방식
//		
//		num = num + 1;
//		System.out.println(num);
//		num += 1;
//		System.out.println(num);
//		num++; // num--;
//		System.out.println(num);

		// 1 - 10까지 10번 반복 반복문

		int i = 1; // 초기식
		while (i <= 10) { // 조건식
			// 반복할 영역
			System.out.println(i);

			i++; // 증감식
		}

		System.out.println("반복문 종료 i = " + i);

	}

}
