package day05;

import java.util.Scanner;

public class D_07소핑몰뒤로가기 {

	public static void main(String[] args) {

		/*
		 * # 쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다. 
		 * 힌트) 개층 별로 반복문을 추가해주면 된다. 
		 * 1. 남성의류 1) 티셔츠 2) 바지 3) 뒤로가기 
		 * 2. 여성의류 1) 가디건 2) 치마 3) 뒤로가기 
		 * 3. 종료
		 */

		Scanner scan=new Scanner(System.in);

		boolean run=true;
		while(run) {

			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");

			System.out.print("메뉴 선택 : ");
			int sel=scan.nextInt();

			if(sel==1) {
				System.out.println("==============");
				while(true) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");
					System.out.print("아이탬 선택 : ");
					int male=scan.nextInt();
					if(male==1) {System.out.println("티셔츠 선택!");System.out.println("==============");}
					else if(male==2) {System.out.println("바지 선택!");System.out.println("==============");}
					else {System.out.println("==============");break;}
				}
			} else if(sel==2) {
				System.out.println("==============");
				while(true) {
					System.out.println("1)가디건");
					System.out.println("2)치마");
					System.out.println("3)뒤로가기");
					System.out.print("아이탬 선택 : ");
					int female=scan.nextInt();
					if(female==1) {System.out.println("가디건 선택!");System.out.println("==============");}
					else if(female==2) {System.out.println("치마 선택!");System.out.println("==============");}
					else {System.out.println("==============");break;}
				}
			} else if(sel==3) {
				run=false;
				System.out.println("프로그램 종료");
			}
		}
		scan.close();
	}
}
