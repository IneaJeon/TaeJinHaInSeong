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
	String id, name, adress;
	int pwd, phone;

}
