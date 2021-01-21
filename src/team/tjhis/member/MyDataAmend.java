package team.tjhis.member;

import java.util.Scanner;

public class MyDataAmend {

   public void amend(MemberDB db) {
      
      Scanner sc = new Scanner(System.in); 
      
      while(true) {
      System.out.println("===== 회원정보수정 =====");
      System.out.println("1. 비밀번호 수정");
      System.out.println("2. 휴대폰번호 수정");
      System.out.println("3. 주소 수정");
      System.out.println("9. 회원탈퇴");
      System.out.print("원하시는 메뉴의 번호를 입력해주세요 : ");
      int num = sc.nextInt();
      
      // 반복문써서 db.memberDB[i].~~~ 이렇게 다 바꾸는게 맞는지 헷갈리네요...
      
		for (int i = 0; i < db.memberDB.length; i++) {
			switch (num) {
			case 1:
				System.out.print("변경할 비밀번호를 입력해주세요 : ");
				String pwd = sc.nextLine();
				System.out.println("비밀번호가 " + pwd + "로 변경되었습니다. ");
				db.memberDB[i].setPwd(pwd);
				break;
			case 2:
				System.out.print("변경할 휴대폰번호를 입력해주세요 : ");
				String phoneNum = sc.nextLine();
				System.out.println("휴대폰번호가 " + phoneNum + "로 변경되었습니다. ");
				db.memberDB[i].setPhoneNum(phoneNum);
				break;
			case 3:
				System.out.print("변경할 주소를 입력해주세요 : ");
				String addr = sc.nextLine();
				System.out.println("주소가 " + addr + "로 변경되었습니다. ");
				db.memberDB[i].setAddr(addr);
				break;
			case 9: // 회원탈퇴를 여기서 해야하는건지 잘 모르겠어요 담당클래스로 넘겨주는건지...
//              MemberWithdraw.withdraw(?????????);      // 피드백필요.....
				System.out.println("정말로 탈퇴 하시겠습니까? [y/n] : ");
				int check = sc.next().charAt(0);
				if (check == 'y') {
//                  memberDto.setNo(0);               // 피드백필요...
					db.memberDB[i].setId(null);
					db.memberDB[i].setPwd(null);
					db.memberDB[i].setName(null);
					db.memberDB[i].setPhoneNum(null);
					db.memberDB[i].setAddr(null);
					System.out.println("탈퇴가 완료되었습니다. 그 동안 감사했습니다.");
				} else {
					System.out.println("메뉴 선택으로 돌아갑니다.");
				}
				break;
			default:
				System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
      
   }
   
}