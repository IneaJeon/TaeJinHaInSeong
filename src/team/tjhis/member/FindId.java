package team.tjhis.member;

import java.util.Scanner;

public class FindId {

   public void findId(MemberDB db) {

      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.println("===== ID 찾기 =====");

         System.out.print("이름을 입력해주세요 : ");
         String name = sc.nextLine();

         System.out.print("휴대폰번호를 입력해주세요 : ");
         String phoneNum = sc.nextLine();

			for (int i = 0; i < db.memberDB.size(); i++) {

				if (db.memberDB.get(i) == null) {
					System.out.println("일치하는 회원의 정보가 없습니다.");
					break;
				} else {
					
					if (name.equals(db.memberDB.get(i).getName())
							&& phoneNum.equals(db.memberDB.get(i).getPhoneNum())) {
						System.out.println(name + "회원님의 ID는 " + db.memberDB.get(i).getId() + "입니다.");
					}
					return;
				}
         }
      }
   }

}