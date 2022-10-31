package day01;

public class a_04자료형 {

	public static void main(String[] args) {

		// 자료형 (data type )
		// 숫자, 문자
		// 숫자 => 소숫점이 없는 숫자(정수), 소숫점이 있는 숫자(실수)
		// 문자 => 문자한개 '', 문자여러개 ""
		
		System.out.println("정수"); // 문자 여러개 : String
		System.out.println(-10); // 숫자 정수 : int
		System.out.println(10); // -> 숫자로 인식함
		System.out.println(10.0); // 숫자 실수 : double
		System.out.println("10"); // -> ""안에 들어있기 때문에 문자로 인식함
		// 이건 에러뜸 System.out.println('10'); '10'은 문자 두 개로 인식하는데 ''안에 들어있기 때문에
		System.out.println('1'); // 문자한개 : char
		System.out.println('a');
		System.out.println('가'); // char
		System.out.println("가"); // string
	}

}
