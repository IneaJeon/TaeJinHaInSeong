package team.tjhis.member;

import java.util.Scanner;

public class Login {

	public void login(MemberDB db) {

		if (db.memberDB.size() == 0) {
			System.out.println("회원 데이터베이스가 비어있습니다!");
			System.out.println("회원가입을 먼저 진행해주세요.");
			return;
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("로그인");
		System.out.println("ID 를 입력하세요 :");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pwd = sc.nextLine();

		for (int i = 0; i < db.memberDB.size(); i++) {
			if (db.memberDB.get(i).getId().equals(id) && db.memberDB.get(i).getPwd().equals(pwd)) {
				System.out.println("로그인 성공!");
				break;
			} else if (!db.memberDB.get(i).getId().equals(id)) {
				System.out.println("잘못된 아이디 입니다.");
				return;
			} else if (!db.memberDB.get(i).getPwd().equals(pwd)) {
				System.out.println("잘못된  비밀번호 입니다.");
				return;
			} else {
				System.out.println("잘못된 아이디와 비밀번호 입니다.");
				return;
			}
		}
	}// login
}// Login
