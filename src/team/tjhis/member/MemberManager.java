package team.tjhis.member;

import java.util.Scanner;

public class MemberManager {
	
	Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	
	public void signUp() {
		
		SignUp signUp = new SignUp(); 
		
	}

	public void login() {
		
		Login login = new Login();
		
	} 

	public void amend() { 
		
		MyDataAmend amend = new MyDataAmend();
		
	}

	public void withdraw(MemberDB db, int no) {
		
		while(true) {
			
			System.out.println();
			System.out.print("정말로 탈퇴하시겠습니까?(y/n) : ");
			char answer = sc.next().charAt(0);
			System.out.println();
			
			if(answer == 'Y' || answer == 'y') {
				
				MemberWithdraw withdraw = new MemberWithdraw();
				withdraw.withdraw(db, no);
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

	public void findId() {
		
		FindId findId = new FindId();
		
		
		
	}
	
	public void findPwd(MemberDB db) {
		
		FindPwd findPwd = new FindPwd();
		
		findPwd.findPwd(db);
	}
	
	
	
}
