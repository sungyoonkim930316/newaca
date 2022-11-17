package day15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class lv3_배열1 {

	public static void main(String[] args) {

		/*
		[문제] 
	 		array1배열 과 array2배열의 각자리별 합을 temp1에저장
	 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
		[문제] 
	 		array1배열 과 array2배열의 각자리별 차를 temp2에저장
	 		temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
	*/

//	    int array1[] = {10,20,30,40,50};
//		int array2[] = {5,8,54,32,1};
//		int temp1[] = new int[5];
//		int temp2[] = new int[5];
//		
//		for(int i=0;i<temp1.length;i++) {
//			temp1[i]=array1[i]+array2[i];
//			temp2[i]=array1[i]-array2[i];
//		}
//		System.out.println(Arrays.toString(temp1));
//		System.out.println(Arrays.toString(temp2));
		
		
		/*
		[문제]
			array[] = {10, 43, 25, 76, 3, 100, 56};	      
			인덱스 2개를 입력받고 작은인덱스에서 큰인덱스까지의 값들의 합을 출력한다.
		[조건] 
	  		index1 이 index2 보다 더크더라도 
	       	작은인덱스부터 큰인덱스까지의 합을 출력한다.
	    [예] index1 = 1;  index2 = 3;
			43 + 25 + 76
	  
	  	[예] index1 = 4;  index2 = 1;
	 		43 + 25 + 76 + 3 
	 */

//		int array[] = {10, 43, 25, 76, 3, 100, 56};			
//		
		Scanner s=new Scanner(System.in);
//		
//		System.out.print("인덱스 1을 입력하다 : ");
//		int a=s.nextInt();
//		System.out.print("인덱스 2를 입력하다 : ");
//		int b=s.nextInt();
//		
//		int sum=0;
//		
//		boolean err=a>array.length||a<0||b>array.length||b<0;
//		
//		if(!err) {
//			if(a>b) {
//				for(int i=b;i<=a;i++) {
//					sum+=array[i];
//				}
//			}
//			else {
//				for(int i=a;i<=b;i++) {
//					sum+=array[i];
//				}
//			}
//		}
//		else System.err.println("err");
//		System.out.println(sum);
		
		
		/*
		[문제]
			array 배열에 -100~100사이의 랜덤값중 홀수만 5개 저장한다. 
			그중 가장작은값의 인덱스와 값을 출력한다. 
		 */
		
//		int arr[] = new int[5];
		Random r=new Random();
//		int j=0;
//		while(true) {
//			int num=r.nextInt(201)-100;
//			if(num%2==0) {continue;}
//			else {arr[j]=num;j++;}
//			if(j==5) {break;}
//		}
//		System.out.println(Arrays.toString(arr));
//		int min=arr[0];
//		for(int k=1;k<arr.length;k++) {
//			if(min>arr[k]) {min=arr[k];}
//		}
//		System.out.println("["+min+"]");
		
		
		/*
		[문제2] 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장
		[조건] 위치는 뒤에서 부터 저장한다. 
		[예]   c = { 0, 0, 17, 51, 49 }
		 */

//		int arr1[] = { 10, 49, 51, 36, 17 };	
//		int c[] = { 0,0,0,0,0 };
//		
//		int[] cup=new int[5];
//		int y=0;
//		
//		for(int z=0;z<arr1.length;z++) {
//			if(arr1[z]%2==1) {cup[y]=arr1[z];y++;}
//		}
//		int x=0;
//		for(int i=c.length;i>0;i--) {
//			c[i-1]=cup[x];
//			x++;
//		}
//		System.out.println(Arrays.toString(c));
		
		/*
		아래배열들을 반으로 나누고 서로 같은모양인지 판별하시오.	
		같은모양이면 true , 다른모양이면 false 출력
		[예시]
			154451 은 절반으로 나누면 서로 같은모양이다.
			154751 은 절반으로 나누면 서로 다른모양이다.
		 */
//		int arr1[] = {1,5,4,4,5,1};	
//		int arr2[] = {1,5,4,7,5,1};
//		int x=arr1.length-1;
//		int y=arr2.length-1;
//		int disc1=0;
//		int disc2=0;
//		
//		for(int i=0;i<arr1.length/2;i++) {
//			if(arr1[i]==arr1[x]) {disc1++;x--;}
//		}
//		for(int i=0;i<arr2.length/2;i++) {
//			if(arr2[i]==arr2[y]) {disc2++;y--;}
//		}
//		System.out.println(disc1);
//		System.out.println(disc2);
//		if(disc1==3) System.out.println("154451 은 절반으로 나누면 서로 같은모양이다.");
//		else {System.out.println("154451 은 절반으로 나누면 서로 다른모양이다.");}
//		if(disc2==3) System.out.println("154751 은 절반으로 나누면 서로 같은모양이다.");
//		else {System.out.println("154751 은 절반으로 나누면 서로 다른모양이다.");}
		
		/*
		인덱스를 입력받고 해당 인덱스의 값을  0으로 변경

		추가조건 : 해당 값 양옆의 값들도 8로 변경 
		단, 0, 4 인덱스일경우는 양옆중 한개만 8로 변경 

		(예) 1 ==> {8,0,8,9,9}
		(예) 4 ==> {9,9,9,8,0}

		*/

//		int arr[] = {9,9,9,9,9};
//		System.out.print("0~4의 인덱스를 입력하다 : ");
//		int x=s.nextInt();
//		boolean err=x>arr.length||x<0;
//		
//		if(!err) {
//			for(int i=0;i<arr.length;i++) {
//				if(x==arr.length-1) {arr[x]=0;arr[x-1]=8;}
//				else if(x==0) {arr[x]=0;arr[x+1]=8;}
//				else {
//					arr[x]=0;
//					arr[x-1]=8;
//					arr[x+1]=8;
//				}
//			}
//		}
//		else System.err.println("err");
//		System.out.println(Arrays.toString(arr));
		
		/*
		편의점 물건채우기 
		철수는 편의점에서 아르바이트를 하고있다. 
		오늘 장사가 잘돼서 라면이 많이 판매되었다.
		라면진열장에 라면들이 전부 채워질수있도록 라면을 채워보자.
		
		라면은 진열장은 한칸에 최대 5개씩 진열할수있으며,
		재고는 6개 밖에 없고 앞에서부터 순차적으로 채워넣는다. 
		재고를 다채웠을때 라면진열장의 모습을 출력해보자.
		
		[예] 
			{3,5,2,1,2}
			
			1번은 3이므로 2개를 추가해 ==> -2
			2번은 5이므로 0개를 추가해 ==> -0
			3번은 2이므로 3개를 추가해 ==> -3
			4번은 1이므로 4개를 추가해야되지만 재고가 1개밖에없어서 -1	
			최종으론 {5,5,5,2,2} 가된다. 
		 */

//		int [] showcase = {3,5,2,1,2};
//		int stock = 6;
//		
//		for(int i=0;i<showcase.length;i++) {
//			int req=5-showcase[i];
//			if(showcase[i]!=5) {
//				if(stock>req) {
//					showcase[i]=showcase[i]+req;
//					stock-=req;
//				}
//				else {showcase[i]=showcase[i]+stock;break;}
//			} continue;
//		}
//		System.out.println(Arrays.toString(showcase));
		
		/*
		[문제]
			철수는 수학시험을 보았다. 
			철수는 실수로 답을 한칸씩 밀려 적었다. 
			철수가 원래대로 마킹했더라면 몇점인가?
			각문제별로 점수는 다르다. 
			예) 
			정답= {1,4,3,3,2};
			점수표 = {20,30,15,15,20};
			
			철수가 제출한 답안지(mistake)   {0,1,3,2,2) 
			원래제출하고싶었던 답안지(fixed) {1,3,2,2,0};
				
		[정답]
			첫번째 한문제만 정답이이고 , 해당점수는 20점이므로 
			20점
		 */

//	    	int[] answer = {1,4,3,3,2};
//			int[] scores = {20,30,15,15,20};
//			int[] mistaked = {0,1,3,2,2};	
//			int fixed [] = new int[5];
//			
//			int x=0;
//			for(int i=0;i<mistaked.length-1;i++) {
//				fixed[x]=mistaked[i+1];
//				x++;
//			}
//			
//			int ansCount=0;
//			for(int i=0;i<answer.length;i++) {
//				if(answer[i]==fixed[i]) {ansCount+=scores[i];}
//			}
//			System.out.println(ansCount+"점");
		
		/*
		[기념일]	
		철수와 영희는 3월 3일에 만났다. 		
		철수는 영희와 100일 기념일에 축하파티를 할려고한다.
		만난지 100일뒤는  몇월몇일인가?
		단 윤년은 계산하지않는다.
		 */

//		int monthList[] =
//			{31, 28, 31, 30, 
//			 31, 30, 31, 31, 
//			 30, 31, 30, 31};	
//		
//		int day = 3;
//		int month = 3;
//		
//		for(int i=0;i<100;i++) {
//			day++;
//			if(day==monthList[month-1]) {day=0;month+=1;}
//		}
//		System.out.println("만난지 100일 뒤는 "+month+"월 "+day+"일입니다.");
		
		/*
		[왼쪽오른쪽]
		랜덤으로 숫자(1,2)를 저장하고
		숫자가 1이면 왼쪽으로 밀기
		숫자가 2이면 오른쪽으로 밀기
	 	예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
	 	예) 2) right ==> arr = {0,0,0,0,0,2,3,4,5};
		 */
//		int arr[] = {0,2,0,3,4,0,0,5,0};			
//		int select=r.nextInt(2)+1;
//		int[] temp1=new int[arr.length];
//		int[] temp2=new int[arr.length];
//		int j=0;
//		int ic=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {temp1[j]=arr[i];j++;ic++;}
//		}
//		System.out.println(ic);
//		for(int h=1;h<arr.length;h++) {
//			temp2[arr.length-ic]=temp1[h-1];
//			ic--;
//			if(ic==0) {break;}
//		}
//		String lr=" ";
//		System.out.printf("숫자가 %d이면 ",select);
//		if(select==1) {lr="왼쪽";System.out.printf("%s으로 밀기 => ",lr);System.out.println(Arrays.toString(temp1));}
//		else {lr="오른쪽";System.out.printf("%s으로 밀기 => ",lr);System.out.println(Arrays.toString(temp2));}
		
		
	}

}
