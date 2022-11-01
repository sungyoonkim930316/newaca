package day03;

import java.util.Scanner;

public class D_02학점 {
	
	public static void main(String[] args) {

		/*
		 * [문제] 1. 시험점수를 입력받는다. 
		 * 2. 시험점수에 해당하는 학점을 출력한다. 
		 * 3. 아래는 점수표이다. 
		 * 91 ~ 100점 A학점 
		 * 81 ~ 90점 B학점 
		 * 80이하 재시험 
		 * 4. 단, 만점이거나 A학점과 B학점의 일의 자리가 7점 이상이면, +를 추가한다. A학점과 B학점의 일의
		 * 자리가 3점 이하이면, -를 추가한다.
		 * 
		 * 예) 100 => A+ 87 => B+ 82 => B- 23 => 재시험
		 */
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("시험점수를 입력하세요 : ");
		int score=s.nextInt();
		
		boolean success=score>80;

		if(success) {
			int one=score%10;
			if(score>90) {System.out.print("A");}
			if(score>80&&score<=90) {System.out.print("B");}
			if(one>=7||one==0) {System.out.println("+");}
			if(one<=3&&one>0) {System.out.println("-");}
		}
		
		if(!success) {System.out.println("재시험");}
		
		s.close();

	}

}
