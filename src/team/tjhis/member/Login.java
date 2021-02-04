package team.tjhis.member;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Login {
	
//	public boolean login(MemberDB db) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("아이디 입력: ");
//		String id = sc.nextLine();
//		System.out.print("비밀번호 입력 : ");
//		String pwd = sc.nextLine();
//
//		for (int i = 0; i < db.memberDB.size(); i++) {
//			if (db.memberDB.get(i).getId().equals(id) && db.memberDB.get(i).getPwd().equals(pwd)) {
//				System.out.println("로그인 성공");
//				
//				db.setLogNo(db.memberDB.get(i).getNo());
//				
//				return true;
//			}
//		}
//		System.out.println("회원정보가 없습니다.");
//		return false;
//	}// login

	public boolean login(String id, String pwd) {
		
		boolean isSuccess = false;
		
		MemberDB.input();

		/* 회원 정보를 파일로 저장하기 위한 출력 */
			
		for(int i = 0 ; i < MemberDB.memberDB.size() ; i++) {
			
			if(MemberDB.memberDB.get(i).getId().equals(id) && MemberDB.memberDB.get(i).getPwd().equals(pwd)) {
				
				MemberDB.logNo = MemberDB.memberDB.get(i).getNo();
				isSuccess = true;
				break;
				
			} else {
				
				isSuccess = false;
				
			}
			
		}
		
		MemberDB.output();
		return isSuccess;


  }// login
}// Login
