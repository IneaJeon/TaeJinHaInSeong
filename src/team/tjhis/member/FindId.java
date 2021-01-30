package team.tjhis.member;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class FindId {

	public void findId(MemberDB db) {
			
//		
//		if (db.memberDB.size() == 0) {
//			System.out.println("회원가입을 먼저 진행해주세요!"); 
//			return;
//		}
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("===== ID 찾기 =====");
//		System.out.print("이름을 입력해주세요 : ");
//		String name = sc.nextLine();
//		System.out.print("휴대폰번호를 입력해주세요 : ");
//		String phoneNum = sc.nextLine();
//
//
//		for (int i = 0; i < db.memberDB.size(); i++) {
//			if (name.equals(db.memberDB.get(i).getName()) && phoneNum.equals(db.memberDB.get(i).getPhoneNum())) {
//				System.out.println(name + "회원님의 ID는 " + db.memberDB.get(i).getId() + "입니다.");
//				return;
//			} else {
//				System.out.println("일치하는 회원의 정보가 없습니다.");
//				return;
//			}
//		}
//		
		
		Scanner sc = new Scanner(System.in);

		String dbFile = "src/team/tjhis/member/members.txt";

		if (!new File(dbFile).exists()) {
			System.out.println("회원가입을 먼저 진행해주세요!");
			return;
		}

		System.out.println();
		System.out.println("===== ID 찾기 =====");
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("휴대폰 번호를 입력해주세요 : ");
		String phoneNum = sc.nextLine();

		ObjectInputStream objIn = null;

		try {
			objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));

			while (true) {
				MemberDTO dto = (MemberDTO) objIn.readObject();
				if (name.equals(dto.getName()) && phoneNum.equals(dto.getName())) {
					System.out.println(name + "회원님의 ID는 " + dto.getId() + "입니다.");
					return;
				}
			}
		} catch (EOFException e) {
			System.out.println("일치하는 회원의 정보가 없습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


	

