package day03;

import java.util.Scanner;

public class D_03�α���2�ܰ� {

	public static void main(String[] args) {

		/*
		 * [����] ��ø ���ǹ� �α����� ��ø if������ �ٽ� ǥ���Ͻÿ�.
		 * 
		 * 1. id�� �Է¹޾� joinId�� ��ġ�� ��쿡�� pw�� �Է��� �� �ִ�. 
		 * 2. id�� Ʋ�� ���, "ID�� Ȯ�����ּ���." ��� �޼����� ����Ѵ�. 
		 * 3. pw�� Ʋ�� ���, "PW�� Ȯ�����ּ���." ��� �޼����� ����Ѵ�. 
		 * 4. id�� pw�� ��� ��ġ�ϴ� ���,
		 * "�α��� �����Դϴ�."��� �޼����� ����Ѵ�.
		 */
		
		Scanner s=new Scanner(System.in);
//		int dbId=1111; // �����ͺ��̽����� ������ id ���̶�� ����
//		int dbPw=1234;
		
		System.out.println("==ȸ������==");
		System.out.print("�����Ͻ� ���̵� �Է��ϼ��� : ");
		int upId=s.nextInt();
		System.out.print("�����Ͻ� ��й�ȣ�� �Է��ϼ��� : ");
		int upPw=s.nextInt();
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		System.out.println("========");
		System.out.println();
		System.out.println("==�α���==");
		System.out.print("���̵� �Է��ϼ��� : ");
		int dbId=s.nextInt();
		boolean idCheck=upId==dbId;
		if(idCheck) {
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			int dbPw=s.nextInt();
			
			boolean pwdCheck=upPw==dbPw;
			if(pwdCheck) {
				System.out.println("�α��� �����Դϴ�.");
			}
			if(!pwdCheck) {System.out.println("PW�� Ȯ�����ּ���.");System.out.println("�α��� �����Դϴ�.");}
		}
		if(!idCheck) {System.out.println("ID�� Ȯ�����ּ���.");System.out.println("�α��� �����Դϴ�.");}
		
		s.close();

	}

}
