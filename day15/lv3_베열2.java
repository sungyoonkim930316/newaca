package day15;

import java.util.Arrays;
import java.util.Scanner;

public class lv3_베열2 {

	public static void main(String[] args) {

		/*
		[문제]
			arr배열의 값들을 순차적으로 절반은 temp1에 저장하고
			나머지 절반은 temp1에 저장한 뒤의 숫자부터 순차적으로 temp2에 저장하시오.
			단, arr의 배열의 길이가 홀수이면,
			temp1의 배열의 크기를 temp2 보다 개수가 한 개 만큼 더 크게 만들어서
			식을 진행하시오.
		[정답]
			temp1 = {12, 232, 3123, 14, 25}
			temp2 = {46, 27, 18, 569}
		 */
		
//		int[] arr = {12, 232, 3123, 14, 25, 46, 27, 18, 569};	
//		int[] temp1 = null;
//		int[] temp2 = null;
//		
//		if(arr.length%2==0) {
//			temp1=new int[arr.length/2];
//			temp2=new int[arr.length/2];
//		}
//		else {
//			temp1=new int[arr.length/2+1];
//			temp2=new int[arr.length/2];
//		}
//		
//		for(int i=0;i<temp1.length;i++) {temp1[i]=arr[i];}
//		for(int i=0;i<temp2.length;i++) {temp2[i]=arr[temp1.length+i];}
//		
//		System.out.println(Arrays.toString(temp1));
//		System.out.println(Arrays.toString(temp2));
		
		/*
		[문제]
		아래배열 a 의 안에 있는 값을 하나 입력받는다.
		b배열안에 위에서 입력한 값을 제외하고 복사한다.
		[예] 30 ==> b[] = {10,20,40,50};
		 */

//		int a[] = { 10, 20, 30, 40, 50 };
//		int b[] = null;
//		int input = 30; // 사용자가 입력 
//		int count=a.length;
//		
		Scanner s=new Scanner(System.in);
//		
//		System.out.println(Arrays.toString(a));
//		while(true) {
//			System.out.print("삭제할 값을 입력 : ");
//			input = s.nextInt();
//			int idx = -1;
//			for(int i=0;i<count;i++) {
//				if(input==a[i]) {
//					idx=i;
//					break;
//				}
//			}
//			if (count == 1 && idx == 0) {
//				a = null;
//				continue;
//			}
//			int[] temp = new int[count - 1];
//			int tidx = 0;
//			for (int i = 0; i < count; i++) {
//				if (idx != i) {
//					temp[tidx] = a[i];
//					tidx++;
//				}
//			}
//			a = temp;
//			temp = null;
//			System.out.println(Arrays.toString(a));
//		}
		
		/*
		[문제] 
		아래 배열 c는 번호와 값이 한쌍인 배열이다. 
		번호를 하나를 입력받고 c배열에 있는 번호이면, 
		그번호와  값만 제외하고 d배열에 복사한다.
		[예]  
			c[] = { 1001, 40, 1002, 65, 1003, 70 };
			입력 : 1002 
			c[] = {1001, 40, 1003, 70}; 
	 */

//		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
//		int d[] = null;
//		
//		System.out.print("값을 입력하다.");
//		int inp=s.nextInt();
//		d=new int[c.length-2];
//		int k=0;
//		for(int i=0;i<c.length;i++) {
//			if(inp==c[i]) {c[i]=0;c[i+1]=0;}
//		}
//		for(int i=0;i<c.length;i++) {
//			if(c[i]!=0) {d[k]=c[i];k++;}
//		}
//		for(int i=0;i<d.length;i++) {
//			
//		}
//		System.out.println(Arrays.toString(d));
		
		/*
		[문제]
			인덱스 , 번호 , 점수를 입력받고 b배열에 삽입을 하시오.	
	    단 인덱스는 0 2 4 6 번만 삽입 가능하다 
			[예] 2 , 1004 , 60	
			int b[] = { 1001, 40, 1004, 60, 1002, 65, 1003, 70};	
		 */

//	    int c[] = { 1001, 40, 1002, 65, 1003, 70};			
//		int b[] = null;
//		int count=0;
//		
//		while(true) {
//			count=b==null?0:b.length; // b가 널이면 0 아니면 b.length
//			for(int i=0;i<count;i++) {
//				System.out.print(b[i]+" ");
//			}
//			System.out.println();
//			System.out.print("인댁스를 입력하세요 : ");
//			int idx=s.nextInt();
////			if(idx%2!=0||idx<0||idx%2>b.length) {System.err.println("err");}
//			System.out.print("번호를 입력하세요 : ");
//			int num=s.nextInt();
//			System.out.print("점수를 입력하세요 : ");
//			int score=s.nextInt();
//			
//			if(b==null) {
//				b=new int[2];
//				b[count]=num;
//				b[count+1]=score;
//			} else {
//				int[] temp=new int[count+2];
//				count+=2;
//				System.out.println(count);
//				for(int i=0;i<count;i++) {
////					temp[i]=b[i];
////					temp[i+1]=b[i+1];
////					temp[i+2]=b[i+2];
//					temp[count-2]=b[count-2];
//					temp[count-1]=b[count-1];
//					b[count-2]=num;
//					b[count-1]=score;
//				}
////				b=temp;
////				temp=null;
//			}
//			
//			if(idx==-1) {break;}
//		}
		
		/*
		[문제] 값을 입력받고 삭제 
		[조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후 
				b 에 순차적으로 저장 
				data[] = {5,2,6,8,5,6};
				  
		[예] 2 ==>  b [] = {5,6,8,5,6};
		[예] 6 ==>  b [] = {5,2,8,5,6};
		 */
		
//		int data[] = {5,2,6,8,5,6};
//		System.out.println(Arrays.toString(data));
//		System.out.print("위 배열에 들어있는 숫자중 하나를 입력하다. : ");
//		int num=s.nextInt();
//		
//		int idx=0;
//		int[] b=new int[data.length-1];
//		int bidx = 0;
//		for(int i=0;i<data.length;i++) {
//			if(data[i]==num) {idx=i;break;}
//			System.out.println(idx);
//		}
//		for(int i=0;i<b.length;i++) {
//			if (idx!=i) {
//				b[bidx] = data[i];
//				bidx++;
//			} 
//			if(i==b.length-1) {b[i]=data[i+1];}
//		}
//		System.out.println(Arrays.toString(b));
		
		/*
		[문제] 값을 입력받고 삭제 
		[조건] 만약에 같은값이 여러개 있으면 가장 마지막의값 한개만 삭제 후 b 에 순차적으로 저장 
		[예] 5 ==> b [] = {5,2,6,8,6}; 
		[예] 6 ==> b [] = {5,2,6,8,5};
		 */
		
//		int data[] = {5,2,6,8,5,6};
//		System.out.println(Arrays.toString(data));
//		System.out.print("위 배열에 들어있는 숫자중 하나를 입력하다. : ");
//		int num=s.nextInt();
//		
//		int idx=0;
//		int[] b=new int[data.length-1];
//		int bidx = 0;
//		for(int i=0;i<data.length;i++) {
//			if(data[i]==num) {idx=i;}
//			System.out.println(idx);
//		}
//		for(int i=0;i<b.length;i++) {
//			if (idx!=i) {
//				b[bidx] = data[i];
//				bidx++;
//			} 
//		}
//		System.out.println(Arrays.toString(b));
		
		/*
		[문제] 삭제할 값을 입력받고 data배열에서 삭제후 b에 저장 
	    int data[] = {5,2,6,8,5,6};
	   	[조건] 만약에 같은값이 여러개 있으면 전부 삭제 후 b 에 순차적으로 저장 
		[예] 5 ==> b [] = {2,6,8,6};
		[예] 6 ==> b [] = {5,2,8,5};
		[예] 2 ==> b [] = {5,6,8,5,6};
	 */
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		int idx=0;
		int j=0;
		int cnt=data.length;
		System.out.println(Arrays.toString(data));
		System.out.print("위 배열에 들어있는 숫자중 하나를 입력하다. : ");
		int num=s.nextInt();
		
		for(int i=0;i<data.length;i++) {
			if(num==data[i]) {data[i]=0;i=idx;cnt--;}
		}
		int[] temp=new int[cnt];
		for(int i=0;i<cnt;i++) {
			if(data[i]!=0) {temp[j]=data[i];j++;}
		}
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(temp));
		
		
	}

}
