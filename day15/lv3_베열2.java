package day15;

import java.util.Arrays;
import java.util.Scanner;

public class lv3_����2 {

	public static void main(String[] args) {

		/*
		[����]
			arr�迭�� ������ ���������� ������ temp1�� �����ϰ�
			������ ������ temp1�� ������ ���� ���ں��� ���������� temp2�� �����Ͻÿ�.
			��, arr�� �迭�� ���̰� Ȧ���̸�,
			temp1�� �迭�� ũ�⸦ temp2 ���� ������ �� �� ��ŭ �� ũ�� ����
			���� �����Ͻÿ�.
		[����]
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
		[����]
		�Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
		b�迭�ȿ� ������ �Է��� ���� �����ϰ� �����Ѵ�.
		[��] 30 ==> b[] = {10,20,40,50};
		 */

//		int a[] = { 10, 20, 30, 40, 50 };
//		int b[] = null;
//		int input = 30; // ����ڰ� �Է� 
//		int count=a.length;
//		
		Scanner s=new Scanner(System.in);
//		
//		System.out.println(Arrays.toString(a));
//		while(true) {
//			System.out.print("������ ���� �Է� : ");
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
		[����] 
		�Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
		��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
		�׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
		[��]  
			c[] = { 1001, 40, 1002, 65, 1003, 70 };
			�Է� : 1002 
			c[] = {1001, 40, 1003, 70}; 
	 */

//		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
//		int d[] = null;
//		
//		System.out.print("���� �Է��ϴ�.");
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
		[����]
			�ε��� , ��ȣ , ������ �Է¹ް� b�迭�� ������ �Ͻÿ�.	
	    �� �ε����� 0 2 4 6 ���� ���� �����ϴ� 
			[��] 2 , 1004 , 60	
			int b[] = { 1001, 40, 1004, 60, 1002, 65, 1003, 70};	
		 */

//	    int c[] = { 1001, 40, 1002, 65, 1003, 70};			
//		int b[] = null;
//		int count=0;
//		
//		while(true) {
//			count=b==null?0:b.length; // b�� ���̸� 0 �ƴϸ� b.length
//			for(int i=0;i<count;i++) {
//				System.out.print(b[i]+" ");
//			}
//			System.out.println();
//			System.out.print("�δ콺�� �Է��ϼ��� : ");
//			int idx=s.nextInt();
////			if(idx%2!=0||idx<0||idx%2>b.length) {System.err.println("err");}
//			System.out.print("��ȣ�� �Է��ϼ��� : ");
//			int num=s.nextInt();
//			System.out.print("������ �Է��ϼ��� : ");
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
		[����] ���� �Է¹ް� ���� 
		[����] ���࿡ �������� ������ ������ ����ù��°�� ��  �Ѱ��� ���� �� 
				b �� ���������� ���� 
				data[] = {5,2,6,8,5,6};
				  
		[��] 2 ==>  b [] = {5,6,8,5,6};
		[��] 6 ==>  b [] = {5,2,8,5,6};
		 */
		
//		int data[] = {5,2,6,8,5,6};
//		System.out.println(Arrays.toString(data));
//		System.out.print("�� �迭�� ����ִ� ������ �ϳ��� �Է��ϴ�. : ");
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
		[����] ���� �Է¹ް� ���� 
		[����] ���࿡ �������� ������ ������ ���� �������ǰ� �Ѱ��� ���� �� b �� ���������� ���� 
		[��] 5 ==> b [] = {5,2,6,8,6}; 
		[��] 6 ==> b [] = {5,2,6,8,5};
		 */
		
//		int data[] = {5,2,6,8,5,6};
//		System.out.println(Arrays.toString(data));
//		System.out.print("�� �迭�� ����ִ� ������ �ϳ��� �Է��ϴ�. : ");
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
		[����] ������ ���� �Է¹ް� data�迭���� ������ b�� ���� 
	    int data[] = {5,2,6,8,5,6};
	   	[����] ���࿡ �������� ������ ������ ���� ���� �� b �� ���������� ���� 
		[��] 5 ==> b [] = {2,6,8,6};
		[��] 6 ==> b [] = {5,2,8,5};
		[��] 2 ==> b [] = {5,6,8,5,6};
	 */
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		int idx=0;
		int j=0;
		int cnt=data.length;
		System.out.println(Arrays.toString(data));
		System.out.print("�� �迭�� ����ִ� ������ �ϳ��� �Է��ϴ�. : ");
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
