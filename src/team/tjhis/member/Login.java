package team.tjhis.member;

import java.util.Scanner;

public class Login {

	public void login(MemberDB db) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("로그인");
			System.out.println("ID 를 입력하세요 :");
			String id = sc.nextLine();
			for (int i = 0; i < db.memberDB.size(); i++) {
				if (! db.memberDB.get(i).getId().equals(id)) {
					System.out.println("잘못된 아이디 입니다.");
				} else {
					System.out.println("비밀번호를 입력하세요");
					String pwd = sc.nextLine();
					if (! db.memberDB.get(i).getPwd().equals(pwd)) {
						System.out.println("비밀번호를 다시 확인하세요");
					} else {
						System.out.println("로그인 성공");
						return;
					}
				}

			} // for
		} // while
	}// login
}// Login