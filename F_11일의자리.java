package day04;

public class F_11일의자리 {

	public static void main(String[] args) {
		
		/*
		 * [문제] 
		 * 	9의 배수중 일의 자리가 6인 첫번째 배수 출력하시오.
		 *  답 : 36
		 */
		
		int i=1;
		while(i<=100) {
			if(i%9==0) {
				if(i%10==6) {System.out.println(i);}
			}
			i++;
		}
		
		int j=9;
		while(j%10!=6) {j+=9;}
		System.out.println(j);
	}
}
