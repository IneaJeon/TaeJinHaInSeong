package team.tjhis.member;

import java.util.Scanner;

public class MyDataAmend {

   public void amend(MemberDB db) {
      
      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.println("===== 회원정보수정 =====");
         System.out.println("1. 비밀번호 수정");
         System.out.println("2. 휴대폰번호 수정");
         System.out.println("3. 주소 수정");
         System.out.print("원하시는 메뉴의 번호를 입력해주세요 : ");
         int num = sc.nextInt();

//         for (int i = 0; i < db.aList.size(); i++) {      // 피드백필요....
//            switch (num) {
//            case 1:
//               System.out.println("현재 비밀번호를 입력해주세요 : ");
//               String pwd = sc.nextLine();
//               if(pwd.equals(db.aList.get(i).getPwd())) {
//                  System.out.print("변경할 비밀번호를 입력해주세요 : ");
//                  String changePwd = sc.nextLine();
//                  db.aList.get(i).setPwd(pwd);
//                  System.out.println("비밀번호가 " + changePwd + "로 변경되었습니다. ");
//                  break;
//               } else {
//                  System.out.println("현재 비밀번호를 잘못 입력하셨습니다.");
//               } break;
//            case 2:
//               System.out.print("변경할 휴대폰번호를 입력해주세요 : ");
//               String changePhoneNum = sc.nextLine();
//               System.out.println("휴대폰번호가 " + changePhoneNum + "로 변경되었습니다. ");
//               db.aList.get(i).setPhoneNum(changePhoneNum);
//               break;
//            case 3:
//               System.out.print("변경할 주소를 입력해주세요 : ");
//               String changeAddr = sc.nextLine();
//               System.out.println("주소가 " + changeAddr + "로 변경되었습니다. ");
//               db.aList.get(i).setAddr(changeAddr);
//               break;
//            default:
//               System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요.");
//               break;
//            }
//         }
      }
   }
}