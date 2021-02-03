package team.tjhis.member;


import java.util.Scanner;

public class UpdateProfile {

//	public void updateProfile(MemberDB db) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("===== 회원정보수정 =====");
//		System.out.println("1. 비밀번호 수정");
//		System.out.println("2. 휴대폰번호 수정");
//		System.out.println("3. 주소 수정");
//		System.out.println("9. 이전 메뉴로 돌아가기");
//		System.out.print("원하시는 메뉴의 번호를 입력해주세요 : ");
//		int num = sc.nextInt();
//		
//		sc.nextLine();
//
//		int index = 0;
//
//		
//		for (int i = 0; i < db.memberDB.size(); i++) {
//			if(db.getLogNo() == db.memberDB.get(i).getNo()) {
//				index = i;
//				break;
//			}
//		}
//			switch (num) {
//			case 1:
//				System.out.print("현재 비밀번호를 입력해주세요 : ");
//				String pwd = sc.nextLine();
//				if (pwd.equals(db.memberDB.get(index).getPwd())) {
//					System.out.print("변경할 비밀번호를 입력해주세요 : ");
//					String changePwd = sc.nextLine();
//					System.out.print("변경할 비밀번호를 한번 더 입력해주세요 : ");
//					String changePwdConfirm = sc.nextLine();
//					
//						if(changePwd.equals(changePwdConfirm)) {
//							db.memberDB.get(index).setPwd(changePwd);
//							System.out.println("비밀번호가 " + changePwd + "로 변경되었습니다. ");
//							return;
//						} else {
//							System.out.println("변경할 비밀번호가 일치하지 않습니다.");
//							break;
//						}
//				} else {
//					System.out.println("현재 비밀번호를 잘못 입력하셨습니다.");
//					break;
//				}
//			case 2:
//				System.out.print("변경할 휴대폰번호를 입력해주세요 : ");
//				String changePhoneNum = sc.nextLine();
//				db.memberDB.get(index).setPhoneNum(changePhoneNum);
//				System.out.println("휴대폰번호가 " + changePhoneNum + "로 변경되었습니다. ");
//				break;
//			case 3:
//				System.out.print("변경할 주소를 입력해주세요 : ");
//				String changeAddr = sc.nextLine();
//				db.memberDB.get(index).setAddr(changeAddr);
//				System.out.println("주소가 " + changeAddr + "로 변경되었습니다. ");
//				break;
//			case 9:
//				System.out.println("이전 메뉴로 돌아갑니다.");
//				return;
//			default:
//				System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요.");
//				break;
//			
//		}
//	}
}

