package day04;

public class F_09�ݺ������4 {

	public static void main(String[] args) {

		/*
		 * [����]
		 *  28�� ��� �߿��� ���� ū ���ڸ� ���� ����Ͻÿ�.
		 *  �� : 980 
		 */
		
		// solutions 1
		int i=28;
		while(i<1000) {i+=28;}
		System.out.println(i-28);
		
		// solutions 2
		int j=1;
		int cnt=0;
		while(j<1000) {if(j%28==0) {cnt++;}j++;}
		System.out.println(cnt*28);
		
		// solutions 3
		int k=1;
		int max28=0;
		while(k<1000) {if(k%28==0) {max28=k;}k++;}
		System.out.println(max28);
		
		// solutions 4
		// ���� 1~3�� �ݴ�� Ʈ���� (int i,j,k=999/ ���ǽ��� i, j, k >0)
	}

}
