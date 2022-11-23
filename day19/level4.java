package day19;

import java.util.Arrays;
import java.util.Scanner;

public class level4 {

	public static void main(String[] args) {

		/*
	 	[ 문제 ]
	 		아래배열은 철수와 민수의 가위바위보 데이터이다. 
	 		왼쪽이 철수의 데이터이고 오른쪽이 민수의 데이터이다
	 		
	 		가위(0) , 바위(1) , 보(2)
 			
 			민수와 철수는 계단 50번째 에서 게임을 시작했으며, 아래의 규칙을따른다.
 			[규칙]
 				이기면 계단 5증가
 				비기면 계단 1증가
 				지면 계단 3감소 
 			
 			철수는 게임이 종료후 몇번째 계단에 있을까?
		 */
		
		
		// [0 : 가위] [1 : 바위] [2: 보]
//		int arr[][] = {
//			{1,0},	//c승리 +5
//			{1,2},	//c패배 -3
//			{2,0},	//c패배 -3
//			{0,0},	//c비김 +1
//			{1,1},	//c비김 +1
//			{2,1},	//c승리 +5
//		};
//		int c=50;
//		int m=50;
//		int win=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.printf("[%d턴 : %d vs %d]\n",i,arr[i][0],arr[i][1]);
//			if(arr[i][0]==0&&arr[i][1]==2||arr[i][0]==1&&arr[i][1]==0||arr[i][0]==2&&arr[i][1]==1) {win=1;} 
//			else if(arr[i][0]==arr[i][1]) {win=2;}
//			
//			if(win==1) {c+=5;m-=3;}
//			else if(win==2) {c+=1;m+=1;}
//			else {c-=3;m+=5;}
//			win=0;
////			System.out.println(c);
////			System.out.println("=========================");
//		}
//		System.out.println(c);
		
		
		
		/*
		[ 문제 ]
		
		현재 택시는 5 , 5 위치에 있다.
		배열의 왼쪽세로줄은 속도를 뜻한다.
		배열의 오른쪽세로줄은 방향 뜻하고 (0, 1, 2, 3) 은 (북, 동, 남, 서) 를 뜻한다. 
		
		속도 와 방향은 택시가 매번이동한 내용을 기록한것이다. 
		
		예) 속도는 4 이고 방향은 0 이니 북쪽을 뜻한다. 
		    y가 4증가해  x : 5 , y : 9 가된다.
	    */

//		int arr[][] = {
//				{4,0},
//				{2,1},
//				{1,3},
//				{5,2},
//				{4,2},
//				{2,1}
//		};
//		int x = 5;
//		int y = 5;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i][1]==0) {y+=arr[i][0];}
//			else if(arr[i][1]==1) {x+=arr[i][0];}
//			else if(arr[i][1]==2) {y-=arr[i][0];}
//			else if(arr[i][1]==3) {x-=arr[i][0];}
////			System.out.printf("[현제좌표] x : %d, y : %d\n",x,y);
//		}
//		System.out.printf("[쵀종좌표] x : %d, y : %d",x,y);
		
		
		/*
		[문제]
	 	연산자 게임을 하려고 한다. 
	 	연산자 게임이란 숫자들만 화면에 나오고 연산자를 맞추는게임이다.
	 	예를 들어 3+3=6 이라면 화면에 아래와같이 출력이되고, 사용자는 연산자를 맞추는게임이다.
	 	-----------------------------
	 	3 ? 3 = 6 
	 	[1] + [2] - [3] *
	 	-----------------------------
		
		아래 배열은 5문제이고 
			첫번째 세로줄은 앞의 숫자의 데이터이고 ,
			두번째 세로줄은 뒤의 숫자의 데이터이고 , 
			세번재 세로줄은 연산자의 데이터이다.  
		게임을 만들고, 맞춘개수를 출력하시오.
		
		예) 첫번째 값은 5이고 두번째 값은 9 이고 연산자는 0 이면  		
			5 ? 9 = 14 이고, 정답은 1 이다.
			[1] + [2] - [3] * 	 	
		 */
		
		Scanner s=new Scanner(System.in);
//		int arr[][] = {
//				{5,9,0},
//				{3,7,1},
//				{8,4,2},
//				{9,2,2},
//				{4,6,1},
//		};
//		int[] answer=new int[arr.length];
//		for(int i=0;i<answer.length;i++) {
//			if(arr[i][2]==0) {answer[i]=arr[i][0]+arr[i][1];}
//			else if(arr[i][2]==1) {answer[i]=arr[i][0]-arr[i][1];}
//			else {answer[i]=arr[i][0]*arr[i][1];}
//		}
//		System.out.println(Arrays.toString(answer));
//		int cnt=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i][0]+" ? "+arr[i][1]+" = "+answer[i]);
//			System.out.print("[+ : 0 입력][- : 1 입력][* : 2입력]물음표에 들어갈 연산자는 무엇일까.");
//			int ans=s.nextInt();
//			boolean err=ans>2||ans<0;
//			if(!err) {
//				if(ans==0) {System.out.println(arr[i][0]+arr[i][1]==answer[i]?"정답":"오답");}
//				else if(ans==1) {System.out.println(arr[i][0]-arr[i][1]==answer[i]?"정답":"오답");}
//				else {System.out.println(arr[i][0]*arr[i][1]==answer[i]?"정답":"오답");}
//			}
//			else {System.err.println("err");}
//		}
//		s.close();
		
		/*
		[ 문제 ]
		[조건1] array 에 b 의 값이 있으면 c 에 인덱스 두개씩  차례대로 저장한다. 
		[조건2] 값이 없는 배열값표현은 -1 로 저장한다. 	
		[정답]
		 10 , 90 , 50 이 있고 인덱스는 각각 [0,0] [2,2] [1,1] 이므로 
		 c = {0,0,2,2,1,1,-1,-1,-1,-1}
		*/
//		int array[][] = {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90},
//		};
//		int b [] = {10,2,54,90,50};
//		int c [] = null;
//		int cnt=0;
//		int k=0;
//		int x=0;
//		int y=0;
//		int z=0;
//		
//		c=new int[b.length*2];
//		
//		while(cnt<=c.length) {
//			for(int i=0;i<array.length;i++) {
//				for(int j=0;j<array[i].length;j++) {
//					if(b[k]==array[i][j]) {
//						x=i;
//						y=j;
//						z++;
//						i=array.length;
//						break;
//					}
//				}
//			}
//			if(z==1) {
//				c[cnt]=x;
//				c[cnt+1]=y;
//				cnt+=2;
//				x=0;
//				y=0;
//				z=0;
//			}
//			if(k==4) {break;}
//			k++;
//		}
//		for(int i=cnt;i<c.length;i++) {
//			c[i]=-1;
//		}
//		System.out.println(Arrays.toString(c));
		
		
		/*
		  [ 문제 ]
			[조건1] a 에 b 의 값이 있으면 c 에 a의 인덱스를 두개씩  차례대로 저장 
			[조건2] 값이 없는 배열값표현은 -1 로 저장 		
			
		[정답]
		  10 , 90 , 50 이 있고 인덱스는 각각 [0,0] [2,2] [1,1] 이므로 
			c = {
			{0,0},
			{2,2},
			{1,1},
			{-1,-1},
			{-1,-1}
		}
		*/

//		int a[][] = {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90},
//		};
//		int b [] = {10,2,54,90,50};
//		int c [][] = new int[5][2]; //2차원배열에 저장
//		int x=0;
//		int y=0;
//		int z=0;
//		int k=0;
//		
//		
//		while(true) {
//			for(int i=0;i<a.length;i++) {
//				for(int j=0;j<a[i].length;j++) {
//					if(b[k]==a[i][j]) {
//						x=i;
//						y=j;
//						z++;
//						i=a.length;
//						break;
//					}
//				}
//			}
//			
//			
//			if(z==1) {
//				for(int i=0;i<c.length;i++) {
//					for(int j=0;j<c[i].length;j++) {
//						
//					}
//				}
////				c[cnt]=x;
////				c[cnt+1]=y;
////				cnt+=2;
//				x=0;
//				y=0;
//				z=0;
//			}
////			if(k==4) {break;}
////			k++;
////		}
////		for(int i=cnt;i<c.length;i++) {
////			c[i]=-1;
//			break;
//		}
//		System.out.println(Arrays.toString(c));
		
		
		
		/*		
		data 리스트의 세로값들의 합을 sumList 에저장		
		예) data[0] ==> 3,1,4,2 ==> sumList = {10,0,0,0,0};
		*/

//		int data[][] = {
//			  {0,0,0,0,0},
//			  {0,0,0,0,3},
//			  {0,2,0,0,3},
//			  {3,1,3,0,1},
//			  {1,4,2,0,2},
//			  {4,1,4,0,4},
//			  {2,1,4,3,3},
//		};		
//		int[] sumList = {0,0,0,0,0};
//		int k=0;
//		
//		for(int i=0;i<data.length;i++) {
//			for(int j=0;j<data[i].length;j++) {
//				if(data[i][j]!=0) {
//					k=j;
//					sumList[k]+=data[i][j];
//					k=0;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(sumList));
		
		//위 같은 배열이 있다 배열의 값들을 한칸씩 위로 올리고 맨아래칸은 0으로 채운다.
		/*
			예)		
				{ 2, 5, 1, 3, 5 }, 
				{ 1, 2, 1, 3, 9 } ,
				{ 0, 0, 0, 0, 0 },		
		 */
//		int arr[][] = {
//				{ 3, 1, 2, 5, 6 },
//				{ 2, 5, 1, 3, 5 }, 
//				{ 1, 2, 1, 3, 9 } 
//		};
//		int[][] temp=new int[3][5];
//		
//		int a=1;
//		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				temp[i][j]=arr[a][j];
//			}
//			a++;
//		}
//		arr=temp;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}System.out.println();
//		}
		
		
		/* 
		mine = {0,9,0},
			   {9,0,9},
			   {0,0,9}
				  
		위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
		저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.
				
		예) 아래와 같이 출력  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}

		 */
		
//		int[][] mine = {
//			{0,9,0},	
//		    {9,0,9},
//		    {0,0,9}
//		};
//		int cnt=0;
//		
//		for(int i=0;i<mine.length;i++) {
//			for(int j=0;j<mine[i].length;j++) {
//				int d1=mine[i-1][j-1];
//				int d2=mine[i-1][j];
//				int d3=mine[i-1][j+1];
//				int d4=mine[i][j-1];
//				int d5=mine[i][j+1];
//				int d6=mine[i+1][j-1];
//				int d7=mine[i+1][j];
//				int d8=mine[i+1][j+1];
//				
//				if(mine[i][j]==0) {
//					if(i-1<0&&j-1<0) {
//						d5=9
//						d7
//						d8
//					}
//					mine[i][j]=cnt;
//					cnt=0;
//				}
//			}
//		}
		
		
		
	}

}
