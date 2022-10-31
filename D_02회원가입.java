package day02;

import java.util.Scanner;

public class D_02회원가입 {

	public static void main(String[] args) {

		/*
		[문제] 회원가입과 로그인
			1. 먼저 아이디와 비밀번호를 입력해서 회원가입을 한다.
			2. 이후 로그인을 위해 다시 아이디와 비밀번호를 입력받는다.
			3. 가입된 정보와 로그인시 입력한 정보를 비교한다.
			4. "로그인 성공" 또는 "로그인 실패"를 출력한다.
			시작시간 : 16:32
			종료시간 : 16:37
	 */
		
		Scanner s=new Scanner(System.in);
		System.out.println("==회원가입==");
		System.out.print("가입하실 아이디를 입력하세요 : ");
		int signUpId=s.nextInt();
		System.out.print("가입하실 비밀번호를 입력하세요 : ");
		int signUpPwd=s.nextInt();
		System.out.printf("회원가입이 완료되었습니다, 아이디 : %d / 비밀번호 : %d\n", signUpId,signUpPwd);
		System.out.println("--------------------");
		
		System.out.println("==로그인==");
		System.out.print("아이디를 입력하세요 : ");
		int signInId=s.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		int signInPwd=s.nextInt();
		boolean check=signUpId==signInId&&signUpPwd==signInPwd;
		
		if (check) { 
			System.out.println("로그인 성공");
		}
		
		if (!check) {
			System.out.println("로그인 실패");
		}
		
		s.close();
		
		
		
	}

}
