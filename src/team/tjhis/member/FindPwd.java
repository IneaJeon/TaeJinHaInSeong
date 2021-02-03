package team.tjhis.member;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class FindPwd {

	// 비밀번호 찾기 메소드
		public void findPwd(MemberDB db) {
			if(!new File("src/team/tjhis/member/members.txt").exists()) {
				System.out.println("회원 데이터베이스가 비어있습니다!");
				System.out.println("회원가입을 먼저 진행해주세요.");
				return;
			}
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("핸드폰 번호 : ");
			String phoneNum = sc.nextLine();
			
			ObjectInputStream objIn = null;
			MemberDTO temp = null;
			
			try {
				
				objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/team/tjhis/member/members.txt")));
				
				while(true) {
					
					temp = (MemberDTO)objIn.readObject();
					if(temp.getName().equals(name) && temp.getId().equals(id) && temp.getPhoneNum().equals(phoneNum)) {
						
						System.out.println("찾으시는 비밀번호는 [" + temp.getPwd() + "] 입니다.");
						break;
						
					}
					
				}
				
			} catch (EOFException e) {
				
				System.out.println("입력하신 정보와 일치하는 회원이 존재하지 않습니다!");
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				
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
			
		}
	
}
