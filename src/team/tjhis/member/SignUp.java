package team.tjhis.member;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {

		System.out.println("Welcome to �����!");
		System.out.println("1. �Է� 2. ��й�ȣ �Է� 3. �̸��Է� 4. �����Է�");

		Scanner sc = new Scanner(System.in);
		MemberList ml = new MemberList();
		MemberList m = new MemberList();

		System.out.print("id :");
		ml.id = sc.nextLine();

		if (!m.equals(ml.id)) {
			System.out.println("���̵� �ùٸ��� �ʽ��ϴ�.");
		} else {
			System.out.println("�ٽ� �Է��ϼ��� �ٽ� �Է��ϼ���");
		}

		System.out.print("name :");
		ml.name = sc.nextLine();

		System.out.print("adress :");
		ml.adress = sc.nextLine();

		System.out.print("pwd :");
		ml.pwd = sc.nextInt();

		System.out.print("phone �Է� :");
		ml.phone = sc.nextInt();

	}
}

class MemberList {
	String id, name, adress;
	int pwd, phone;

}
