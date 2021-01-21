package team.tjhis.member;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {


		System.out.println("Welcome to 저기요!");
		System.out.println("1. 입력 2. 비밀번호 입력 3. 이름입력 4. 성별입력");

		Scanner sc = new Scanner(System.in);
		MemberList ml = new MemberList();
		MemberList m = new MemberList();

		System.out.print("id :");
		ml.id = sc.nextLine();

		if (!m.equals(ml.id)) {
			System.out.println("아이디가 올바르지 않습니다.");
		} else {
			System.out.println("다시 입력하세요 다시 입력하세요");
		}

		System.out.print("name :");
		ml.name = sc.nextLine();

		System.out.print("adress :");
		ml.adress = sc.nextLine();

		System.out.print("pwd :");
		ml.pwd = sc.nextInt();

		System.out.print("phone 입력 :");
		ml.phone = sc.nextInt();

	}
}

class MemberList {

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
