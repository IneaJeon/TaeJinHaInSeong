package team.tjhis.member;

import java.util.Scanner;

public class MyPageManager {

	public void myPage(MemberDB db, int no) {
	
		Scanner sc = new Scanner(System.in);
		
		int choose = 0;
		while(choose != 9) {
			System.out.println("======== 회원 관리 프로그램 ========");
			System.out.println("1. 개인정보 수정");
			System.out.println("2. 회원 탈퇴");
			System.out.println("9. 프로그램 종료");
			System.out.print("원하시는 항목을 선택해 주세요 : ");
			choose = sc.nextInt();
			switch(choose) {
			case 1:
				MyDataAmend myDataAmend = new MyDataAmend();
				myDataAmend.amend(db);
				break;
			case 2:
				MemberWithdraw withdraw = new MemberWithdraw();
				withdraw.withdraw(db, no);
				break;
			case 9: // 9. 프로그램 종료
				System.out.println("프로그램을 종료합니다!");
				return;
			default: // default. 잘못된값 입력 안내, 재입력 안내
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("다시 입력해 주세요.");
			}
		}
	}
	
}
