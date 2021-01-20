package team.tjhis.member;

import java.util.Scanner;

public class MyDataAmend {

	public void amend() {
		
		Scanner sc = new Scanner(System.in);
		
		MemberDTO memberDto = new MemberDTO();
		
		while(true) {
		System.out.println("===== 회원정보수정 =====");
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 휴대폰번호 수정");
		System.out.println("9. 회원탈퇴");
		System.out.print("원하시는 메뉴의 번호를 입력해주세요 : ");
		int num = sc.nextInt();
		
//		switch (num) {
//			case 1:
//				System.out.print("새로 설정할 비밀번호를 입력해주세요 : ");
//				String pwd = sc.nextLine();
//				System.out.println("비밀번호가 " + pwd + "로 변경되었습니다. ");
//				memberDto.setPwd(pwd);
//				break;
//			case 2:
//				System.out.print("새로 설정할 휴대폰번호를 입력해주세요 : ");
//				String phoneNum = sc.nextLine();
//				System.out.println("휴대폰번호가 " + phoneNum + "로 변경되었습니다. ");
//				memberDto.setPhoneNum(phoneNum);
//				break;
//			case 9:
//				System.out.println("정말로 탈퇴 하시겠습니까? [y/n] : ");
//				int check = sc.next().charAt(0);
//				if (check == 'y') {
//					System.out.println("탈퇴가 완료되었습니다. 그 동안 감사했습니다.");
//				} else {
//					System.out.println("메뉴 선택으로 돌아갑니다.");
//				}
//				return;
//			default:
//				System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요.");
//			}
		}
		
	}
	
}
