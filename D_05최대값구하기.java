package day05;

import java.util.Scanner;

public class D_05최대값구하기 {

	public static void main(String[] args) {

		/*
		 * # 최대값 구하기[2단계]
		 * 1. 3회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		 */
		
//		Scanner s=new Scanner(System.in);
//		
//		int i=1;
//		int score=0;
//		int rs1=0;
//		int rs2=0;
//		int rs3=0;
//		
//		while(true) {
//			System.out.print("점수를 입력하세요 : ");
//			score=s.nextInt();
//			if(i==1) {
//				rs1=score;
//			}
//			else if(i==2) {
//				rs2=score;
//			}
//			else if(i==3) {
//				rs3=score;
//				break;
//			}
//			i++
//		}
//		if(rs1>rs2&&rs2>rs3) {System.out.printf("첫 번째 숫자 %d와 두 번째 숫자 %d와 세 번째 숫자 %d중 가장 큰 숫자는 %d입니다.",rs1,rs2,rs3,rs1);}
//		else if(rs2>rs1&&rs2>rs3) {System.out.printf("첫 번째 숫자 %d와 두 번째 숫자 %d와 세 번째 숫자 %d중 가장 큰 숫자는 %d입니다.",rs1,rs2,rs3,rs2);}
//		else {System.out.printf("첫 번째 숫자 %d와 두 번째 숫자 %d와 세 번째 숫자 %d중 가장 큰 숫자는 %d입니다.",rs1,rs2,rs3,rs3);}
//		
//		s.close();
		
		Scanner s=new Scanner(System.in);
		
		int i=1;
		int max=0;
		while(i<=3) {
			System.out.printf("[%d] 숫자 >> ",i);
			int num=s.nextInt();
			if(i==1) {
				max=num;
			}
			
			if(max>num) {
				max=num;
			}
			i++;
		}
		System.out.println("최소값 = "+max);
		s.close();
	}
}
