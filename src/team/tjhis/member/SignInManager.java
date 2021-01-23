package team.tjhis.member;

import java.util.Scanner;

public class SignInManager {
	
	public int signIn(MemberDB db) {					// int 반환형은 추후 수정 예
		
		Scanner sc = new Scanner(System.in);
		Login login = new Login();						
		FindId findId = new FindId();					
		FindPwd findPwd = new FindPwd();				
		
		/* 객체의 무분별한 생성 막기위해 싱글톤 사용 */
//		Login login = Login.getInstance();				 
//		FindId findId = FindId.getInstance();			
//		FindPwd findPwd = FindPwd.getInstance();		

		while(true) {
			System.out.println("__________ 로그인 화면 __________");
			System.out.println();
			System.out.println("[ 1. 로그인 ]");
			System.out.println("[ 2. 아이디 찾기 ]");
			System.out.println("[ 3. 비밀번호 찾기 ]");
			System.out.println("[ 9. 메인 화면으로 이동 ]");		
			System.out.println();
			System.out.print("원하시는 항목을 선택해 주세요 : ");
			
			int choice = sc.nextInt();
			sc.nextLine();								// 버퍼에 남아있는 엔터 제거
			
			switch(choice) {
			
				case 1 :
					login.login(db);
					return 0;
//					boolean isSucceed = login.login(db);
//					
//					if(isSucceed) {
//						return 0;
//					}else {
//						continue;
//					}
					
									
				case 2 :
					findId.findId(db);					
					continue;							
					
				case 3 :
					findPwd.findPwd(db);
					continue;
					
				case 9 :
					return 0;
					
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요."); 
			}
			
			
		}
			
	}
	
	
	
	
	
	
}
	

