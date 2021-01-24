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
		
		System.out.println("__________ 마이 페이지 화면 __________");
		System.out.println("[ 1. 회원정보수정 ]");
		System.out.println("[ 2. 탈퇴하기 ] ");
		System.out.println("[ 3. 메인 화면으로 이동 ]");
		System.out.println();
		System.out.print("원하시는 항목을 선택해 주세요 : ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		
		
		
		
		
		
	}
	
	
}

	
