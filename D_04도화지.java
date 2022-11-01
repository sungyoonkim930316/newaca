package day03;

public class D_04도화지 {

	public static void main(String[] args) {

		/*
		 * [문제] 민수네반 학생은 26명이다. 민수네반 학생들에게 도화지를 2장씩 나누어 주려고 한다. 도화지는 10장씩 한 묶음로만 판매하고
		 * 10장에 1,200원이다. 총 얼마가 필요한지 구하시오. 
		 * [정답] 7,200원
		 * 
		 * 시작시간 : 
		 * 종료시간 : 
		 */

		int totStudent=26;
		int reqPaper=totStudent*2;
		int price=1200*(reqPaper/10);
		if(reqPaper%10>0) {System.out.println((price+1200)+"원");}
		if(reqPaper%10==0) {System.out.println((price)+"원");}
	}

}
