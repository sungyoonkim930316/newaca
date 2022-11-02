package day04;

public class F_05반복문문제2 {

	public static void main(String[] args) {

		/*	 
		 [문제1] 1~10까지 중에서 3미만 7이상의 합을 출력하시오.
		       1 + 2 + 7 + 8 + 9 + 10
		 [정답1] 37


		 [문제2] 1~10까지 중에서 3미만 7이상의 개수를 출력하시오. 
				 1,2,7,8,9,10 ==> 6개 
		 [정답2] 6
		 
		*/
		
		// 문제 1번 풀이
		int i=1;
		int sum=0;
		int cnt=0;
		while(i<=10) {if(i<3||i>=7) {sum+=i;cnt++;}i++;}
		System.out.println(sum);
		System.out.println(cnt);
	}
}
