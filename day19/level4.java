package day19;

import java.util.Arrays;
import java.util.Scanner;

public class level4 {

	public static void main(String[] args) {

		/*
	 	[ ���� ]
	 		�Ʒ��迭�� ö���� �μ��� ���������� �������̴�. 
	 		������ ö���� �������̰� �������� �μ��� �������̴�
	 		
	 		����(0) , ����(1) , ��(2)
 			
 			�μ��� ö���� ��� 50��° ���� ������ ����������, �Ʒ��� ��Ģ��������.
 			[��Ģ]
 				�̱�� ��� 5����
 				���� ��� 1����
 				���� ��� 3���� 
 			
 			ö���� ������ ������ ���° ��ܿ� ������?
		 */
		
		
		// [0 : ����] [1 : ����] [2: ��]
//		int arr[][] = {
//			{1,0},	//c�¸� +5
//			{1,2},	//c�й� -3
//			{2,0},	//c�й� -3
//			{0,0},	//c��� +1
//			{1,1},	//c��� +1
//			{2,1},	//c�¸� +5
//		};
//		int c=50;
//		int m=50;
//		int win=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.printf("[%d�� : %d vs %d]\n",i,arr[i][0],arr[i][1]);
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
		[ ���� ]
		
		���� �ýô� 5 , 5 ��ġ�� �ִ�.
		�迭�� ���ʼ������� �ӵ��� ���Ѵ�.
		�迭�� �����ʼ������� ���� ���ϰ� (0, 1, 2, 3) �� (��, ��, ��, ��) �� ���Ѵ�. 
		
		�ӵ� �� ������ �ýð� �Ź��̵��� ������ ����Ѱ��̴�. 
		
		��) �ӵ��� 4 �̰� ������ 0 �̴� ������ ���Ѵ�. 
		    y�� 4������  x : 5 , y : 9 ���ȴ�.
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
////			System.out.printf("[������ǥ] x : %d, y : %d\n",x,y);
//		}
//		System.out.printf("[������ǥ] x : %d, y : %d",x,y);
		
		
		/*
		[����]
	 	������ ������ �Ϸ��� �Ѵ�. 
	 	������ �����̶� ���ڵ鸸 ȭ�鿡 ������ �����ڸ� ���ߴ°����̴�.
	 	���� ��� 3+3=6 �̶�� ȭ�鿡 �Ʒ��Ͱ��� ����̵ǰ�, ����ڴ� �����ڸ� ���ߴ°����̴�.
	 	-----------------------------
	 	3 ? 3 = 6 
	 	[1] + [2] - [3] *
	 	-----------------------------
		
		�Ʒ� �迭�� 5�����̰� 
			ù��° �������� ���� ������ �������̰� ,
			�ι�° �������� ���� ������ �������̰� , 
			������ �������� �������� �������̴�.  
		������ �����, ���ᰳ���� ����Ͻÿ�.
		
		��) ù��° ���� 5�̰� �ι�° ���� 9 �̰� �����ڴ� 0 �̸�  		
			5 ? 9 = 14 �̰�, ������ 1 �̴�.
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
//			System.out.print("[+ : 0 �Է�][- : 1 �Է�][* : 2�Է�]����ǥ�� �� �����ڴ� �����ϱ�.");
//			int ans=s.nextInt();
//			boolean err=ans>2||ans<0;
//			if(!err) {
//				if(ans==0) {System.out.println(arr[i][0]+arr[i][1]==answer[i]?"����":"����");}
//				else if(ans==1) {System.out.println(arr[i][0]-arr[i][1]==answer[i]?"����":"����");}
//				else {System.out.println(arr[i][0]*arr[i][1]==answer[i]?"����":"����");}
//			}
//			else {System.err.println("err");}
//		}
//		s.close();
		
		/*
		[ ���� ]
		[����1] array �� b �� ���� ������ c �� �ε��� �ΰ���  ���ʴ�� �����Ѵ�. 
		[����2] ���� ���� �迭��ǥ���� -1 �� �����Ѵ�. 	
		[����]
		 10 , 90 , 50 �� �ְ� �ε����� ���� [0,0] [2,2] [1,1] �̹Ƿ� 
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
		  [ ���� ]
			[����1] a �� b �� ���� ������ c �� a�� �ε����� �ΰ���  ���ʴ�� ���� 
			[����2] ���� ���� �迭��ǥ���� -1 �� ���� 		
			
		[����]
		  10 , 90 , 50 �� �ְ� �ε����� ���� [0,0] [2,2] [1,1] �̹Ƿ� 
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
//		int c [][] = new int[5][2]; //2�����迭�� ����
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
		data ����Ʈ�� ���ΰ����� ���� sumList ������		
		��) data[0] ==> 3,1,4,2 ==> sumList = {10,0,0,0,0};
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
		
		//�� ���� �迭�� �ִ� �迭�� ������ ��ĭ�� ���� �ø��� �ǾƷ�ĭ�� 0���� ä���.
		/*
			��)		
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
				  
		�� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
		�����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
				
		��) �Ʒ��� ���� ���  
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
