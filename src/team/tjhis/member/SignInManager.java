package team.tjhis.member;

import java.util.Scanner;

public class SignInManager {
	
	public int signIn(MemberDB db) {
		
		int no = 0;

		Scanner sc = new Scanner(System.in);
		
		int choose = 0;
		while(choose != 9) {
			System.out.println("======== Sign In 프로그램 ========");
			System.out.println("1. 로그인");
			System.out.println("2. 아이디 찾기");
			System.out.println("3. 비밀번호 찾기");
			System.out.println("9. 프로그램 종료");
			System.out.print("원하시는 항목을 선택해 주세요 : ");
			choose = sc.nextInt();
			switch(choose) {
			case 1: // 1. 로그인
				Login login = new Login();
//				no = login.login(db); // 고유넘버를 리턴값으로 넘겨받음 실패하면 0 리턴
				break;		
			case 2: // 2. 아이디 찾기
				FindId findId = new FindId();
				findId.findId(db);
				break;
			case 3: // 3. 비밀번호 찾기
				FindPwd findPwd = new FindPwd();
				findPwd.findPwd(db);
				break;
			case 9: // 9. 프로그램 종료
				System.out.println("프로그램을 종료합니다!");
				return no;
			default: // default. 잘못된값 입력 안내, 재입력 안내
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("다시 입력해 주세요.");
			}
		}
		return no;
	}
	
}
