package team.tjhis.member;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {

		/* navi */
		System.out.println("Welcome to �����!");
		System.out.println("step1. ���̵��Է� \nstep2. ��й�ȣ �Է� \nstep3. �̸��Է�  \nstep4. �ּ��Է�");
		System.out.println();
		
		String[] list = {"win","ȫ�浿", "����� ���ʱ�"};
		int[] num = {123, 01234};

		Scanner sc = new Scanner(System.in);

		/**/
		Member m = new Member();

		while (true) {
			System.out.print("id�� �Է��ϼ��� : ");
			m.id = sc.nextLine();
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			m.pwd = sc.nextInt();
			System.out.println("�̸��� �Է��ϼ��� : ");
			m.name = sc.nextLine();
			System.out.println("�ּҸ� �Է��ϼ��� : ");
			m.adress = sc.nextLine();			
			System.out.println("�ּҸ� �Է��ϼ��� : ");
			m.phone = sc.nextInt();
			
			if(!list[0].equals(m.id)) {
				System.out.println("���̵� �ٽ�");
			}else if(!list[1].equals(m.pwd)) {
				System.out.println("��� �ٽ�");
			}else if(!list[2].equals(m.name)) {
				System.out.println("�̸� �ٽ�");
			}else if(num[0] != m.pwd) {
				System.out.println("��ȭ��ȣ �ٽ�");
			}else {
				System.out.println("ȸ������ ����");
			}

		} 
		
		}//main
	
	}//SignUp


class Member {
	String id, name, adress;
	int pwd, phone;

}
