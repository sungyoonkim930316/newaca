package day04;

public class F_07반복문배수2 {

	public static void main(String[] args) {

		/*
		 * [문제] 8의 배수를 작은수부터 3개 출력하시오. 
		 * 답 : 8,16,24
		 */
		
		int i=1;
		int eight=8;
		while(i<=3) {
			if(i<3) {System.out.print(eight+", ");}
			else {System.out.println(eight);}
			i++;
			eight+=8;}
	}

}
