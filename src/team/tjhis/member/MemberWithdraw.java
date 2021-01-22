package team.tjhis.member;

import java.util.Scanner;

public class MemberWithdraw {


	// 회원탈퇴 메소드
	public void withdraw(MemberDB db, int no) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println();
			System.out.print("정말로 탈퇴하시겠습니까?(y/n) : ");
			char answer = sc.next().charAt(0);
			System.out.println();
			
			if(answer == 'Y' || answer == 'y') {
				
				db.memberDB[no-1] = null;
				System.out.println("탈퇴가 완료되었습니다.");
				System.out.println("그동안 감사했습니다.");
				System.out.println();
				return;
			
			}else if (answer == 'N' || answer == 'n'){
				
				System.out.println("회원 탈퇴를 취소하셨습니다.");
				System.out.println("메인 화면으로 돌아갑니다.");
				System.out.println();
				return;
				
			}else {
				
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		
		}
		
	}	

}
