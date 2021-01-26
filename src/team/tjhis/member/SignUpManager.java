package team.tjhis.member;

import java.util.Scanner;

public class SignUpManager {

	public void signUpStart(MemberDB db, int i) {

		Scanner sc = new Scanner(System.in);

		System.out.println("회원가입");

		System.out.println("아이디 입력 :");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 :");
		String pwd = sc.nextLine();
		System.out.println("이름 입력 :");
		String name = sc.nextLine();
		System.out.println("전화번호 입력 :");
		String phoneNum = sc.nextLine();
		System.out.println("주소 입력 :");
		String addr = sc.nextLine();

		do {
			/* 세팅하기 */
//			MemberDTO md = new MemberDTO();
//			db.memberDB.get(i).setNo(no);
			db.memberDB.get(i).setId(id);
			db.memberDB.get(i).setPwd(pwd);
			db.memberDB.get(i).setPhoneNum(phoneNum);
			db.memberDB.get(i).setAddr(addr);

//			db.memberDB.add(md);

			System.out.println("계속 진행 하시겠습니까?");
			String yn = sc.nextLine();

			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else {
				break;
			}
		} while (true);
		
		for (int i1 = 0; i1 < db.memberDB.size(); i1++) {
			System.out.println("회원 번호 : " + db.memberDB.get(i1).getNo()); // 해당 데이터 출력
			System.out.println("회원 번호 : " + db.memberDB.get(i1).getId()); // 해당 데이터 출력
			System.out.println("회원 번호 : " + db.memberDB.get(i1).getPwd()); // 해당 데이터 출력
			System.out.println("회원 번호 : " + db.memberDB.get(i1).getName()); // 해당 데이터 출력
			System.out.println("회원 번호 : " + db.memberDB.get(i1).getPhoneNum()); // 해당 데이터 출력
			System.out.println("회원 번호 : " + db.memberDB.get(i1).getAddr()); // 해당 데이터 출력

		}
	}// signUpStart
}// SignUpManager
