package team.tjhis.member;

import java.util.Scanner;

public class MyPageManager {
	
	public void myPage(MemberDB db, int no) {
		
		Scanner sc = new Scanner(System.in);
//		MemberWithdraw withdraw = new MemberWithdraw();
		UpdateProfile updateProfile = new UpdateProfile();
		
		/* 객체의 무분별한 생성 막기위해 싱글톤 사용 */
//		MyDataAmend amend = MyDataAmend.getInstance();				 
		MemberWithdraw withdraw = MemberWithdraw.getInstance();
		
		while(true) {
			System.out.println();
			System.out.println("__________ 마이 페이지 화면 __________");
			System.out.println();
			System.out.println("[ 1. 회원정보수정 ]");
			System.out.println("[ 2. 탈퇴하기 ] ");
			System.out.println("[ 9. 메인 화면으로 이동 ]");
			System.out.println();
			System.out.print("원하시는 항목을 선택해 주세요 : ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1 : 
					updateProfile.updateProfile(db);
					continue;
					
				case 2 :
					boolean isComplete = withdraw.withdraw(db); 
					if(isComplete) {
						return;
					}else {
						continue;
					}
					
				case 9 :
					return;
					
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				
			}
			
		}
		
	}
	
}

	
