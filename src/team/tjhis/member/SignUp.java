package team.tjhis.member;

import java.util.Scanner;

public class SignUp {

	public static int number = 6;
	
	public void signUpStart(String id, String pwd, String name, String phoneNum, String addr) {

		MemberDB.input();
		
		MemberDB.memberDB.add(new MemberDTO(number, id, pwd, name, phoneNum, addr));
		
		number += 1;
		 
		MemberDB.output();
		 
		System.out.println("회원가입 완료 됐습니다.");
		 
	}
		 
}
