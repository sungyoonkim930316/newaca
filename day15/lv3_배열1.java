package day15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class lv3_�迭1 {

	public static void main(String[] args) {

		/*
		[����] 
	 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp1������
	 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
		[����] 
	 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp2������
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
		[����]
			array[] = {10, 43, 25, 76, 3, 100, 56};	      
			�ε��� 2���� �Է¹ް� �����ε������� ū�ε��������� ������ ���� ����Ѵ�.
		[����] 
	  		index1 �� index2 ���� ��ũ���� 
	       	�����ε������� ū�ε��������� ���� ����Ѵ�.
	    [��] index1 = 1;  index2 = 3;
			43 + 25 + 76
	  
	  	[��] index1 = 4;  index2 = 1;
	 		43 + 25 + 76 + 3 
	 */

//		int array[] = {10, 43, 25, 76, 3, 100, 56};			
//		
		Scanner s=new Scanner(System.in);
//		
//		System.out.print("�ε��� 1�� �Է��ϴ� : ");
//		int a=s.nextInt();
//		System.out.print("�ε��� 2�� �Է��ϴ� : ");
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
		[����]
			array �迭�� -100~100������ �������� Ȧ���� 5�� �����Ѵ�. 
			���� ������������ �ε����� ���� ����Ѵ�. 
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
		[����2] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
		[����] ��ġ�� �ڿ��� ���� �����Ѵ�. 
		[��]   c = { 0, 0, 17, 51, 49 }
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
		�Ʒ��迭���� ������ ������ ���� ����������� �Ǻ��Ͻÿ�.	
		��������̸� true , �ٸ�����̸� false ���
		[����]
			154451 �� �������� ������ ���� ��������̴�.
			154751 �� �������� ������ ���� �ٸ�����̴�.
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
//		if(disc1==3) System.out.println("154451 �� �������� ������ ���� ��������̴�.");
//		else {System.out.println("154451 �� �������� ������ ���� �ٸ�����̴�.");}
//		if(disc2==3) System.out.println("154751 �� �������� ������ ���� ��������̴�.");
//		else {System.out.println("154751 �� �������� ������ ���� �ٸ�����̴�.");}
		
		/*
		�ε����� �Է¹ް� �ش� �ε����� ����  0���� ����

		�߰����� : �ش� �� �翷�� ���鵵 8�� ���� 
		��, 0, 4 �ε����ϰ��� �翷�� �Ѱ��� 8�� ���� 

		(��) 1 ==> {8,0,8,9,9}
		(��) 4 ==> {9,9,9,8,0}

		*/

//		int arr[] = {9,9,9,9,9};
//		System.out.print("0~4�� �ε����� �Է��ϴ� : ");
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
		������ ����ä��� 
		ö���� ���������� �Ƹ�����Ʈ�� �ϰ��ִ�. 
		���� ��簡 �ߵż� ����� ���� �ǸŵǾ���.
		��������忡 ������ ���� ä�������ֵ��� ����� ä������.
		
		����� �������� ��ĭ�� �ִ� 5���� �����Ҽ�������,
		���� 6�� �ۿ� ���� �տ������� ���������� ä���ִ´�. 
		��� ��ä������ ����������� ����� ����غ���.
		
		[��] 
			{3,5,2,1,2}
			
			1���� 3�̹Ƿ� 2���� �߰��� ==> -2
			2���� 5�̹Ƿ� 0���� �߰��� ==> -0
			3���� 2�̹Ƿ� 3���� �߰��� ==> -3
			4���� 1�̹Ƿ� 4���� �߰��ؾߵ����� ��� 1���ۿ���� -1	
			�������� {5,5,5,2,2} ���ȴ�. 
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
		[����]
			ö���� ���н����� ���Ҵ�. 
			ö���� �Ǽ��� ���� ��ĭ�� �з� ������. 
			ö���� ������� ��ŷ�ߴ���� �����ΰ�?
			���������� ������ �ٸ���. 
			��) 
			����= {1,4,3,3,2};
			����ǥ = {20,30,15,15,20};
			
			ö���� ������ �����(mistake)   {0,1,3,2,2) 
			���������ϰ�;��� �����(fixed) {1,3,2,2,0};
				
		[����]
			ù��° �ѹ����� �������̰� , �ش������� 20���̹Ƿ� 
			20��
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
//			System.out.println(ansCount+"��");
		
		/*
		[�����]	
		ö���� ����� 3�� 3�Ͽ� ������. 		
		ö���� ����� 100�� ����Ͽ� ������Ƽ�� �ҷ����Ѵ�.
		������ 100�ϵڴ�  ��������ΰ�?
		�� ������ ��������ʴ´�.
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
//		System.out.println("������ 100�� �ڴ� "+month+"�� "+day+"���Դϴ�.");
		
		/*
		[���ʿ�����]
		�������� ����(1,2)�� �����ϰ�
		���ڰ� 1�̸� �������� �б�
		���ڰ� 2�̸� ���������� �б�
	 	��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
	 	��) 2) right ==> arr = {0,0,0,0,0,2,3,4,5};
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
//		System.out.printf("���ڰ� %d�̸� ",select);
//		if(select==1) {lr="����";System.out.printf("%s���� �б� => ",lr);System.out.println(Arrays.toString(temp1));}
//		else {lr="������";System.out.printf("%s���� �б� => ",lr);System.out.println(Arrays.toString(temp2));}
		
		
	}

}
