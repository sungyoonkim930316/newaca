package day03;

public class D_04��ȭ�� {

	public static void main(String[] args) {

		/*
		 * [����] �μ��׹� �л��� 26���̴�. �μ��׹� �л��鿡�� ��ȭ���� 2�徿 ������ �ַ��� �Ѵ�. ��ȭ���� 10�徿 �� �����θ� �Ǹ��ϰ�
		 * 10�忡 1,200���̴�. �� �󸶰� �ʿ����� ���Ͻÿ�. 
		 * [����] 7,200��
		 * 
		 * ���۽ð� : 
		 * ����ð� : 
		 */

		int totStudent=26;
		int reqPaper=totStudent*2;
		int price=1200*(reqPaper/10);
		if(reqPaper%10>0) {System.out.println((price+1200)+"��");}
		if(reqPaper%10==0) {System.out.println((price)+"��");}
	}

}
