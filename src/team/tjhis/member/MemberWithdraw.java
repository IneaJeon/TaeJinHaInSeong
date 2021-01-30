package team.tjhis.member;

import java.util.Scanner;

public class MemberWithdraw {

	// 회원탈퇴 메소드
	public boolean withdraw(MemberDB db) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println();
			System.out.print("정말로 탈퇴하시겠습니까?(y/n) : ");
			char answer = sc.next().charAt(0);
			System.out.println(); 
			
			if(answer == 'Y' || answer == 'y') {	// 탈퇴 요청한 경우
				
				for(int i = 0 ; i < db.memberDB.size(); i++) {	// 회원번호 저장된 인덱스 찾기 위한 반복문
					if(db.memberDB.get(i).getNo() == db.getLogNo()) {	// 회원번호와 일치하는 회원번호 가진 인덱스인 경우
						db.memberDB.remove(i);	// 해당 인덱스에 저장된 인스턴스 삭제
						break; 
					}
				}
				
				db.setLogNo(0);		// 로그인 되어 있는 회원의 번호를 0으로 변경 (아무도 로그인 하지 않은 상태로 돌림)
				
				System.out.println("탈퇴가 완료되었습니다.");
				System.out.println("그동안 감사했습니다.");
				System.out.println();
				return true;
			
			}else if (answer == 'N' || answer == 'n'){	// 탈퇴 취소한 경우
				
				System.out.println("회원 탈퇴를 취소하셨습니다.");
				System.out.println("마이페이지로 돌아갑니다.");
				System.out.println();
				return false;
				
			}else {		// 예외 처리
				
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		
		}
		
	}	

}
