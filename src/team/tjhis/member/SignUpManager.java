package team.tjhis.member;

import java.util.Scanner;

public class SignUpManager {
	
	public void signUp(MemberDB db) {

		Scanner sc = new Scanner(System.in);
		SignUp signUp = new SignUp();
		
		while(true) {
			
			System.out.println("__________ 회원가입 __________");
			System.out.println();
			System.out.println("1. 회원가입");
			System.out.println("2. 메인페이지로 돌아가기");
			System.out.println();
			System.out.print("원하시는 항목을 선택해 주세요 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(choice) {
			
				case 1 : signUp.signUpStart(db); return;
				
				case 2 : return;
				
				default : 
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
					System.out.println();
			}
		}
		
	}

}
