package day02;

import java.util.Scanner;

public class C_09장학생 {

	public static void main(String[] args) {

		/*
		 * [문제] 국어점수가 100점이거나 수학점수가 100점이면 장학생이다. 국어점수와 수학점수를 입력받고 장학생이면 true를 출력하시오.
		 * 시작시간 : 15:17 종료시간 : 15:18
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 : ");
		int kor = s.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int math = s.nextInt();

		boolean korCheck = kor >= 0 && kor <= 100;
		boolean mathCheck = math >= 0 && math <= 100;

		boolean check = korCheck && mathCheck && kor == 100 || math == 100;
		System.out.println(check);

		s.close();

	}

}
