package team.tjhis.member;

import java.util.Scanner;

public class Login {

	public void login(MemberDB db) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();

		for (int i = 0; i < db.memberDB.size(); i++) {
			if (db.memberDB.get(i).getId().equals(id) && db.memberDB.get(i).getPwd().equals(pwd)) {
				System.out.println("로그인 성공");
				break;
			}
		}
		System.out.println("회원정보가 없습니다.");
		return;
	}// login
}// Login
