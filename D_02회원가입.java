package day02;

import java.util.Scanner;

public class D_02ȸ������ {

	public static void main(String[] args) {

		/*
		[����] ȸ�����԰� �α���
			1. ���� ���̵�� ��й�ȣ�� �Է��ؼ� ȸ�������� �Ѵ�.
			2. ���� �α����� ���� �ٽ� ���̵�� ��й�ȣ�� �Է¹޴´�.
			3. ���Ե� ������ �α��ν� �Է��� ������ ���Ѵ�.
			4. "�α��� ����" �Ǵ� "�α��� ����"�� ����Ѵ�.
			���۽ð� : 16:32
			����ð� : 16:37
	 */
		
		Scanner s=new Scanner(System.in);
		System.out.println("==ȸ������==");
		System.out.print("�����Ͻ� ���̵� �Է��ϼ��� : ");
		int signUpId=s.nextInt();
		System.out.print("�����Ͻ� ��й�ȣ�� �Է��ϼ��� : ");
		int signUpPwd=s.nextInt();
		System.out.printf("ȸ�������� �Ϸ�Ǿ����ϴ�, ���̵� : %d / ��й�ȣ : %d\n", signUpId,signUpPwd);
		System.out.println("--------------------");
		
		System.out.println("==�α���==");
		System.out.print("���̵� �Է��ϼ��� : ");
		int signInId=s.nextInt();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		int signInPwd=s.nextInt();
		boolean check=signUpId==signInId&&signUpPwd==signInPwd;
		
		if (check) { 
			System.out.println("�α��� ����");
		}
		
		if (!check) {
			System.out.println("�α��� ����");
		}
		
		s.close();
		
		
		
	}

}
