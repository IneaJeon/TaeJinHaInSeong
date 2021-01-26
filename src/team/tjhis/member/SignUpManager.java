package team.tjhis.member;

import java.util.Scanner;

public class SignUpManager {
	
	public static int number = 1;
	
	public void signUpStart(MemberDB db) {

		Scanner sc = new Scanner(System.in);

		System.out.println("회원가입");

		System.out.println("아이디 입력 :");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 :");
		String pwd = sc.nextLine();
		System.out.println("이름 입력 :");
		String name = sc.nextLine();
		System.out.println("전화번호 입력 :");
		String phoneNum = sc.nextLine();
		System.out.println("주소 입력 :");
		String addr = sc.nextLine();

		db.memberDB.add(new MemberDTO(number, id, pwd, name, phoneNum, addr));
		
		 number += 1;
		 
		 System.out.println("회원가입 완료 됐습니다.");
		
	}// signUpStart
}// SignUpManager
