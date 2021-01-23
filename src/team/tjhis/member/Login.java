package team.tjhis.member;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	public void login(String id, String pwd) {
		

		Scanner sc = new Scanner(System.in);
		ArrayList<String> memberDB = new ArrayList<>();
		MemberDTO memberDto = new MemberDTO();
		
		System.out.println("로그인");

		while(true)  {
			
			int saw = sc.nextInt();	//스캐너 값 받기
			
			/*saw == 1 아이디 입력 받기*/
			if(saw == 1) {
				System.out.print("아이디 입력 하세요 : ");
				id = sc.nextLine();
				for(int i = 0; i < memberDB.size(); i ++) {
					if(id.equals(memberDB.get(i))) {
						System.out.println("중복된 값입니다.");
						continue;
					}
				}
				memberDB.add(id);
			/*saw == 2 아이디 확인*/
			}else if(saw == 2){
				System.out.print("아이디 입력 하세요 : ");
				id = sc.nextLine();
				if(memberDB.contains(id)) {					//아이디 존재 여부 확인
					System.out.println("존재하는 아이디 입니다.");	
				}
			/*saw == 3 존재하는 아이디가 있을 경우 다시 아디디 받아 id 존재여부 확인 후 존재하지 않는다면 출력 */
			/*memberDB.remove(i); 통해 해당 인덱스 삭제 하려고 했으나 보류 */
			}else if(saw == 3) {
				System.out.print("아이디 입력 하세요 : ");
				id = sc.nextLine();
				if(memberDB.contains(id)) {
					for(int i = 0; i< memberDB.size(); i++) {
						if(memberDB.get(i).equals(id)) {
//							memberDB.remove(i);
							break;
						}
					}
				}else {
					System.out.println("존재하지 않는 ID입니다.");
				}
			}else {
				break;
			}
			System.out.println(memberDB);

		}//while
	}//login
}//Login