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

	public void login(MemberDB db) {

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();

		/* 회원 정보를 파일로 저장하기 위한 출력 */
		ObjectInputStream objIn = null;
		MemberDTO mb = null;
		
		try {
			
			objIn = new ObjectInputStream(new BufferedInputStream
					(new FileInputStream("src/team/tjhis/member/Application.text")));
			
			while(true) {
				
				if(!mb.getId().equals(id) && !mb.getPwd().equals(pwd)) {
					System.out.println("아이디와 비밀번호가 올바르지 않습니다.");
				} else {
					System.out.println("로그인 성공");
				}break;
			}
					
		} catch (FileNotFoundException e) {
			
			System.out.println("파일을 찾을 수 업습니다.");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			if(objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}

  }// login
}// Login
