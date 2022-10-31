package day02;

import java.util.Scanner;

public class D_08합격 {

	public static void main(String[] args) {

		/*
		 * [문제] 점수 유효성 검사 
		 * 1. 점수 2개를 입력받아 평균을 구한다. 
		 * 2. 평균이 60점 이상이면 합격, 60점 미만이면 불합격이다. 
		 * 3.
		 * 조건1) 입력받은 정수가 음수이거나 100점을 초과하면, 오류 메세지를 출력한다. 
		 * 예) 점수를 잘 못 입력했습니다. 
		 * 4. 
		 * 조건2) 평균이 60점 이상이라도 한 과목이라도 50점 미만이면, 불합격을 출력한다.
		 * 시작시간 : 17:53
		 * 종료시간 : 18:06
		 */
		
		Scanner s=new Scanner(System.in);
		System.out.print("점수1 : ");
		int score1=s.nextInt();
		System.out.print("점수2 : ");
		int score2=s.nextInt();
		
		boolean err=score1<0||score2<0||score1>100||score2>100;
		
		if(err) {
			System.out.println("점수를 잘 못 입력하였습니다.");
		}
		// 중첩 if문 : if안의 if
		if(!err) {
			double avg=(score1+score2)/2.0;
			boolean pass=avg>=60&&score1>=50&&score2>=50;
			if(pass) {
				System.out.println("합격");
			}
			if(!pass) {
				System.out.println("불합격");
			}
		}
		
		s.close();

	}

}
