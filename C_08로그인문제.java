package day02;

import java.util.Scanner;

public class C_08로그인문제 {

	public static void main(String[] args) {

		/*
		 * [문제] 철수는 로그인을 하려고 한다. 아이디와 비밀번호를 입력받는다. 아이디와 비밀번호 둘 중 하나만 틀려도 로그인은 실패한다.
		 * joinId와 joinPw는 철수가 이미 가입한 아이디와 비밀번호이다. 시작시간 : 14:58 종료시간 : 15:05
		 */

		Scanner s = new Scanner(System.in);

		// 회원가입
		// 사용자가 입력을 받은 값으로 id, pwd를 만드는 것
		System.out.println("회원가입하실 아이디를 입력하세요");
		int joinId = s.nextInt();
		System.out.println("회원가입하실 비밀번호를 입력하세요");
		int joinPw = s.nextInt();
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("----------------------------");

		// 로그인 조건식 만들기
		System.out.println("로그인");
		System.out.println("ID를 입력하세요");
		int inputId = s.nextInt();
		System.out.println("PW를 입력하세요");
		int inputPw = s.nextInt();

		boolean check = inputId == joinId && inputPw == joinPw;
		System.out.println(check);

		s.close();

	}

}
