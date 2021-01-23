package team.tjhis.member;

import java.util.Scanner;

public class Login {

	public void login(MemberDB db) {

		Scanner sc = new Scanner(System.in);

		System.out.println("로그인");
		System.out.println("ID 를 입력하세요 :");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력하세요");
		String pwd = sc.nextLine();

		for (int i = 0; i < db.memberDB.size(); i++) {
			if (db.memberDB.get(i).getId().equals(id) && db.memberDB.get(i).getPwd().equals(pwd)) {
				System.out.println("로그인 성공");
				break;
			} else if(!db.memberDB.get(i).getId().equals(id)) {
				System.out.println("입력하신 아이디가 존재 하지 않습니다.");
			} else if(!db.memberDB.get(i).getPwd().equals(pwd)) {
				System.out.println("입력하신 비밀번호가 존재 하지 않습니다.");
			}
		} // for
	}// login
}// Login