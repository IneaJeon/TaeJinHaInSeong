package team.tjhis.member;

import java.util.Scanner;

public class SignUpManager {

	public void signUpStart(MemberDB db) {

		Scanner sc = new Scanner(System.in);

		/* 로그인 시도 후 회원정보가 없다는 가정 하에 회원가입 진행 */
		while (true) {
			System.out.println("1. 로그인: ");
			System.out.print("2. 회원가입 : ");
			System.out.print("3. 종료 ");
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("회원가입부터 해주세요.");
				continue;
			} else {
				for (int i = 0; i < db.memberDB.size(); i++) {
					/* 로그인 성공 회원가입 필요없음 */
					if (num == 1) {
						System.out.print("아이디 입력: ");
						String id = sc.nextLine();
						System.out.print("비밀번호 입력 : ");
						String pwd = sc.nextLine();
						if (db.memberDB.get(i).getId().equals(id) && db.memberDB.get(i).getPwd().equals(pwd)) {
							System.out.println("로그인 성공");
						} else {
							System.out.println("다시 입력해 주세요");
						}
					/* 회원 정보 없을 시 회원가입 시작 */
					} else if (num == 2) {
						System.out.print("아이디 입력: ");
						String id = sc.nextLine();
						System.out.print("비밀번호 입력 : ");
						String pwd = sc.nextLine();
						System.out.print("이름를 입력하세요 : ");
						String inputName = sc.nextLine();
						System.out.print("전화번호 입력 : ");
						String inputPhoneNum = sc.nextLine();
						System.out.print("주소 입력 : ");
						System.out.println("회원가입을 축하드립니다.");
					/* 종료 */
					} else if (num == 3) {
						System.out.println("프로그램 종료");
						break;
					}
				}
			}
		} // while
	}// signUpStart
}// SignUpManager
