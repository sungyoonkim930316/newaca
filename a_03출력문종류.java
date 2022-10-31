package day01;

public class a_03출력문종류 {

	public static void main(String[] args) {
		
		//출력문 안에 따옴표 없이 쓰면 변수로 인식하고 출력문 안에 따옴표 넣고 쓰면 문자열로 인식
		
		System.out.println("김성윤");
		//System.out.println(); // 한 줄 띄어쓰기
		System.out.printf("안녕 \t");
		System.out.printf("하세요");
		// \ : 특수한 기능
		// \n : 한 줄 띄어쓰기
		// 예전에는 System.out.printf(" \n 반갑습니다") 이런 식으로 띄어쓰기 썼는데
		// System.out.println();에 띄어쓰기 기능이 들어있다.
		// 즉 printf 괄호 안엔 꼭 무언가가 있어야하는데 println은 안에 무언가가 없어도 된다.
		System.out.printf(" \n \"반갑습니다\" ");
		// \를 문자 그대로 출력시키고 싶을 경우, ""를 쓰면 된다.
		
	}

}
