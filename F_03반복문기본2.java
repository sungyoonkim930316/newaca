package day04;

public class F_03반복문기본2 {

	public static void main(String[] args) {

		// 반복문 : 여러번 반복할 수 있다 
				// 초기식 조건식 증감식 
				
				// 반복변수를 통해서 반복 횟수를 제어할 수 있다
				// 반복변수 i j k => 반복문 횟수에 영향을 미치는 변수  
				
				// 누적변수 => 반복문 횟수에 영향 x 
				// 다만 반복문 안에서 값이 누적하는 수 
				// 총합 , 갯수 
				
				// 2 4 6 8 10 
				
				int i = 1;
				
				System.out.println(" 1- 10 총합 ");
				
				int sum = 0;
				// 1 + 2+ 3 + 4+ 5+ 6+ 7+ 8+ 9+ 10
				while(i <= 10) {
					sum = sum + i;
					System.out.printf(" i = %d sum = %d \n", i , sum);
					
					i++;
				}
				
				System.out.println(" 반복문 종료 총합 : " + sum);
				
				i = 1;
				int count =0; 
				while(i <=10) {
					if(i %2 == 0) {
						count++;
					}
					i++;
				}
				
				System.out.println("1-10의 짝수의 갯수 :" + count);
		
	}

}
