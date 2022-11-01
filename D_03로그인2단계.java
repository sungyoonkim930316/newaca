package day03;

import java.util.Scanner;

public class D_03로그인2단계 {

	public static void main(String[] args) {

		/*
		 * [문제] 중첩 조건문 로그인을 중첩 if문으로 다시 표현하시오.
		 * 
		 * 1. id를 입력받아 joinId와 일치할 경우에만 pw를 입력할 수 있다. 
		 * 2. id를 틀린 경우, "ID를 확인해주세요." 라는 메세지를 출력한다. 
		 * 3. pw가 틀린 경우, "PW를 확인해주세요." 라는 메세지를 출력한다. 
		 * 4. id와 pw가 모두 일치하는 경우,
		 * "로그인 성공입니다."라는 메세지를 출력한다.
		 */
		
		Scanner s=new Scanner(System.in);
//		int dbId=1111; // 데이터베이스에서 가져온 id 값이라고 가정
//		int dbPw=1234;
		
		System.out.println("==회원가입==");
		System.out.print("가입하실 아이디를 입력하세요 : ");
		int upId=s.nextInt();
		System.out.print("가입하실 비밀번호를 입력하세요 : ");
		int upPw=s.nextInt();
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("========");
		System.out.println();
		System.out.println("==로그인==");
		System.out.print("아이디를 입력하세요 : ");
		int dbId=s.nextInt();
		boolean idCheck=upId==dbId;
		if(idCheck) {
			System.out.print("비밀번호를 입력하세요 : ");
			int dbPw=s.nextInt();
			
			boolean pwdCheck=upPw==dbPw;
			if(pwdCheck) {
				System.out.println("로그인 성공입니다.");
			}
			if(!pwdCheck) {System.out.println("PW를 확인해주세요.");System.out.println("로그인 실패입니다.");}
		}
		if(!idCheck) {System.out.println("ID를 확인해주세요.");System.out.println("로그인 실패입니다.");}
		
		s.close();

	}

}
