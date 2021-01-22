package team.tjhis.member;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	public void login(String id, String pwd) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		MemberDTO memberDto = new MemberDTO();
		
		System.out.println("로그인");

		while(true)  {
			
			int saw = sc.nextInt();
			
			/*아이디 입력*/
			if(saw == 1) {
				System.out.print("아이디 입력 하세요 : ");
				id = sc.nextLine();
				arr.add(id);
			}else if(saw == 2){
				System.out.print("아이디 입력 하세요 : ");
				id = sc.nextLine();
				if(arr.contains(id)) {
					System.out.println("존재하는 아이디 입니다.");
				}
			}else if(saw == 3) {
				System.out.print("아이디 입력 하세요 : ");
				id = sc.nextLine();
				if(arr.contains(id)) {
					for(int i = 0; i< arr.size(); i++) {
						if(arr.get(i).equals(id)) {
							arr.remove(i);
							break;
						}
					}
				}else {
					System.out.println("존재하지 않는 ID입니다.");
				}
			}else {
				break;
			}
			System.out.println(arr);

		}//while
	}//login
}//Login