package day05;

import java.util.Random;

public class D_06랜덤학생 {

	public static void main(String[] args) {

		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 */
		
		Random r=new Random();
		int stuScore=0;
		int totScore=0;
		int success=0;
		int god=0;
		int godNumber=0;
		
		int i=1;
		while(i<=10) {
			int score=r.nextInt(100)+1;
			System.out.print(score+"점 ");
			stuScore=score;
			if(i==1) {god=score;} 
			else {if (god<score) {god=score;godNumber=i;}}
			if(stuScore>=60) {success++;}
			if (god<score) {god=score;}
			totScore+=stuScore;
			i++;
		}
		System.out.println();
		System.out.println("전교생 총점 : "+totScore+"점");
		System.out.println("전교생 평균점수 : "+(double)totScore/10.0+"점");
		System.out.println("합격자 수 : "+success+"명");
		System.out.println("1등 학생 번호 : "+godNumber+"번");
		System.out.println("1등 학생 점수 : "+god+"점");
	}
}
