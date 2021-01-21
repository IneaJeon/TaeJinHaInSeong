package team.tjhis.member;

import java.util.Scanner;

public class FindPwd {

	// 비밀번호 찾기 메소드
	public void findPwd(MemberDB db) {
		if(db.memberDB[0] == null) {
			System.out.println("회원 데이터베이스가 비어있습니다!");
			System.out.println("회원가입을 먼저 진행해주세요.");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		for(int i = 0 ; db.memberDB[i] != null ; i++) {
			if(db.memberDB[i].getName().equals(name) && db.memberDB[i].getId().equals(id)) {
				System.out.println("찾으시는 비밀번호는 '" + db.memberDB[i].getPwd() + "' 입니다.");
				return;
			}
		}
		System.out.println("해당하는 회원의 정보가 존재하지 않습니다.");
		return;
		
	}
	
}
