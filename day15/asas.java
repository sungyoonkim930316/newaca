package day15;

import java.util.Random;

public class asas {

	public static void main(String[] args) {

		Random r=new Random();
		
		System.out.println();
		System.out.println("===����9===");
		
		int cntChul = 0;
		int log = -1;
		
		for(int i = 0 ; cntChul <= 25 ; i++) {
			
			int chul = r.nextInt(4)+1;
			cntChul += chul;
			int doll = r.nextInt(3)+3;
			System.out.println("ö��: "+chul+"����: "+doll);
			if(doll < chul ||i == 9) {
				log = 1;
				break;
				
			}
			System.out.println(cntChul);
			
		}
		
	if(log == -1) {
		System.out.println("�¸��Ͽ����ϴ�.");
	}else  {
		System.out.println("�й��Ͽ����ϴ�.");
	}
		
	}

}
