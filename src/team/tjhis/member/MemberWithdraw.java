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
			
			if(answer == 'Y' || answer == 'y') {	// 탈퇴 요청한 경우
				
				int wdNum = db.getWdNum();	// 인덱스 계산 위해 탈퇴한 회원 수 받아옴
				int index = no - 1 - wdNum;	// 해당하는 회원 번호가 저장된 인덱스 번호 계산
				
				db.memberDB.remove(index);	// 해당 인덱스에 저장된 인스턴스 삭제
				db.setWdNum(wdNum++);	// 탈퇴한 회원 수 1 증가
				
				System.out.println("탈퇴가 완료되었습니다.");
				System.out.println("그동안 감사했습니다.");
				System.out.println();
				return;
			
			}else if (answer == 'N' || answer == 'n'){	// 탈퇴 취소한 경우
				
				System.out.println("회원 탈퇴를 취소하셨습니다.");
				System.out.println("마이페이지로 돌아갑니다.");
				System.out.println();
				return;
				
			}else {		// 예외 처리
				
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		
		}
		
	}	

}
