package day04;

public class F_06반복문배수1 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 	7의 배수중  150보다 작은수중 가장큰수 출력하시오. 
		 *  (어떤 수의 배수는 그 수에 정수를 곱한 수이다.) 
		 *  답 : 147
		 */
		
		// solution1
		int i=1;
		int cnt=0;
		while(i<150) {
			if(i%7==0) {cnt++;}
			i++;
		}
		System.out.println(cnt*7);
		
		// solution2
		int j=1;
		int max7=0;
		while(j<150) {
			if(j%7==0) {max7=j;}
			j++;
		}
		System.out.println(max7);
		
		// solution3
		int k=7;
		while(k<150) {k+=7;}
		System.out.println(k-7);
		
	}

}
