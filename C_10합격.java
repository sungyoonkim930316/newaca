package day02;

import java.util.Scanner;

public class C_10합격 {

	public static void main(String[] args) {

		/*
		 * [문제] 시험점수를 입력받는다. 시험 점수가 0점 미만이거나 100점 초과면 오류이다. 오류이면 true, 오류가 아니면 false를
		 * 출력하시오. 시작시간 : 15:42 종료시간 : 15:43
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("시험점수를 입력하세요 : ");
		int score = s.nextInt();
		boolean check = score >= 0 && score <= 100;
		System.out.println(!check);
		// boolean check=score<0||score>100;
		// System.out.println(check);

		s.close();
	}

}
