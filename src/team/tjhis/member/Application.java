package team.tjhis.member;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 로그인 시 반환받은 고유넘버를 저장할 int변수
		int no = 0;
		// MemberDB 인스턴스
		MemberDB db = new MemberDB();
		// MemberManager 인스턴스
		MemberManager memberManager = new MemberManager();
		
		// 반복문으로 프로그램 종료 될때까지 어떤 함수를 실행 해야할지 선택하는 알고리즘 설계
		// 입력하면 해당하는 메소드를 MemberManager 인스턴스에서 골라 작성
		// 선택 int변수 1개
		int choose = 0;
		while(choose != 9) {
			System.out.println("======== 회원 관리 프로그램 ========");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 내 정보 조회");
			System.out.println("4. 내 정보 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.println("6. 아이디 찾기");
			System.out.println("7. 패스워드 찾기");
			System.out.println("8. 데이터베이스 확인(admin)");
			System.out.println("9. 프로그램 종료");
			System.out.print("원하시는 항목을 선택해 주세요 : ");
			choose = sc.nextInt();
			switch(choose) {
			case 1: // 1. 회원가입
//				memberManager.signUp(db);
				break;
			case 2: // 2. 로그인
//				no = memberManager.login(db); // 로그인에 성공하면 로그인된 회원의 고유넘버를 리턴값으로 넘겨받음
				break;
			case 3: // 3. 개인정보 조회 <- 따로 클래스나 메소드로 구현하지 않고 메인에서 구현(반환받은 int값 활용)
				if(no == 0) { // 로그인에 성공하여 고유번호를 리턴받으면 0이 아니고 0이면 로그인X
					System.out.println("로그인이 되어있지 않습니다.");
					System.out.println("먼저 로그인을 시도해 주세요.");
					continue;
				}
				for(int i = 0 ; db.memberDB[i] != null ; i++) {
					if(db.memberDB[i].getNo() == no) {
						System.out.println(db.memberDB[i]);
						break;
					}
				}
				break;
			case 4: // 4. 개인정보 수정
				if(no == 0) {
					System.out.println("로그인이 되어있지 않습니다.");
					System.out.println("먼저 로그인을 시도해 주세요.");
					continue;
				}
//				memberManager.amend(db);
				break;
			case 5: // 5. 회원 탈퇴
				if(no == 0) {
					System.out.println("로그인이 되어있지 않습니다.");
					System.out.println("먼저 로그인을 시도해 주세요.");
					continue;
				}
				memberManager.withdraw(db, no);
				break;
			case 6: // 6. 아이디 찾기
//				memberManager.findId(db);
				break;
			case 7: // 7. 비밀번호 찾기
				memberManager.findPwd(db);
				break;
			case 8: // 8. 데이터베이스에 들어있는 회원 목록 조회(admin) 실행 시 테스트용도
				for(int i = 0 ; db.memberDB[i] != null ; i++) {
					if(db.memberDB[i].getNo() != 0) {
						System.out.println(db.memberDB[i]);
						break;
					}
				}
			case 9: // 9. 프로그램 종료
				System.out.println("프로그램을 종료합니다!");
			default: // default. 잘못된값 입력 안내, 재입력 안내
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("다시 입력해 주세요.");
			}	
			
		}
		

	}

}
