package day04;

public class F_09반복문배수4 {

	public static void main(String[] args) {

		/*
		 * [문제]
		 *  28의 배수 중에서 가장 큰 세자리 수를 출력하시오.
		 *  답 : 980 
		 */
		
		// solutions 1
		int i=28;
		while(i<1000) {i+=28;}
		System.out.println(i-28);
		
		// solutions 2
		int j=1;
		int cnt=0;
		while(j<1000) {if(j%28==0) {cnt++;}j++;}
		System.out.println(cnt*28);
		
		// solutions 3
		int k=1;
		int max28=0;
		while(k<1000) {if(k%28==0) {max28=k;}k++;}
		System.out.println(max28);
		
		// solutions 4
		// 위에 1~3과 반대로 트라이 (int i,j,k=999/ 조건식이 i, j, k >0)
	}

}
