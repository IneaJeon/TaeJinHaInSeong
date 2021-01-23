package team.tjhis.member;

import java.util.Scanner;

public class FindPwd {

	// 비밀번호 찾기 메소드
	public void findPwd(MemberDB db) {
		if(db.memberDB.size() == 0) {
			System.out.println("회원 데이터베이스가 비어있습니다!");
			System.out.println("회원가입을 먼저 진행해주세요.");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("핸드폰 번호 : ");
		String phoneNum = sc.nextLine();
		for(int i = 0 ; i < db.memberDB.size() ; i++) { // 인덱스를 1씩 증가시키며 해당 인덱스 안의 인스턴스 필드멤버들이 입력한 값과 일치하는 인스턴스가 존재하면 if안의 내용 실행
			if(db.memberDB.get(i).getName().equals(name) && db.memberDB.get(i).getId().equals(id) && db.memberDB.get(i).getPhoneNum().equals(phoneNum)) {
				System.out.println("찾으시는 비밀번호는 '" + db.memberDB.get(i).getPwd() + "' 입니다.");
				return;
			}
		}
		// 일치하는 인스턴스가 존재하지 않아 그대로 for문을 탈출했을때
		System.out.println("해당하는 회원의 정보가 존재하지 않습니다.");
		return;
		
	}
	
}
