package day04;

public class F_03�ݺ����⺻2 {

	public static void main(String[] args) {

		// �ݺ��� : ������ �ݺ��� �� �ִ� 
				// �ʱ�� ���ǽ� ������ 
				
				// �ݺ������� ���ؼ� �ݺ� Ƚ���� ������ �� �ִ�
				// �ݺ����� i j k => �ݺ��� Ƚ���� ������ ��ġ�� ����  
				
				// �������� => �ݺ��� Ƚ���� ���� x 
				// �ٸ� �ݺ��� �ȿ��� ���� �����ϴ� �� 
				// ���� , ���� 
				
				// 2 4 6 8 10 
				
				int i = 1;
				
				System.out.println(" 1- 10 ���� ");
				
				int sum = 0;
				// 1 + 2+ 3 + 4+ 5+ 6+ 7+ 8+ 9+ 10
				while(i <= 10) {
					sum = sum + i;
					System.out.printf(" i = %d sum = %d \n", i , sum);
					
					i++;
				}
				
				System.out.println(" �ݺ��� ���� ���� : " + sum);
				
				i = 1;
				int count =0; 
				while(i <=10) {
					if(i %2 == 0) {
						count++;
					}
					i++;
				}
				
				System.out.println("1-10�� ¦���� ���� :" + count);
		
	}

}
