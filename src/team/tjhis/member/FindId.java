package team.tjhis.member;

import java.util.Scanner;

public class FindId {

	public void findId() {
		
		Scanner sc = new Scanner(System.in); 
		
		MemberDTO memberDto = new MemberDTO();
		
		System.out.println("===== ID 찾기 =====");
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰번호를 입력해주세요 : ");
		String phoneNum = sc.nextLine();
		
		if(name.equals(memberDto.getName()) && phoneNum.equals(memberDto.getPhoneNum())) {
			System.out.println(name + "회원님의 ID는 " + memberDto.getId() + "입니다.");
		} else {
			System.out.println("일치하는 회원의 정보가 없습니다.");
		}
		
	}
	
}
