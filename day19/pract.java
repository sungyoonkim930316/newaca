package day19;

import java.util.Scanner;

public class pract {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String test="";
		/*
	     *int block[][] = {
					{1,2},
					{3,4}
		  };
	     *
	     * 			{2,4}
	     * 			{1,3}
	     *
	     *(0,0)->(0,1)
	     *(0,1)->(1,1)
	     *(1,0)->(0,0)
	     *(1,1)->(1,0)
	     *
	     */
		int block[][] = {
				{1,2},
				{3,4}
		};
		int[][] temp=new int[2][2];
		
		for(int i=0;i<block.length;i++) {
			for(int j=0;j<block[i].length;j++) {
				temp[i][j]=block[j][block.length-i-1];
				System.out.print(temp[i][j]+" ");
			}System.out.println();
		}
		
	}

}
