package team.tjhis.member;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {

		/* navi */
		System.out.println("Welcome to 저기요!");
		System.out.println("step1. 아이디입력 \nstep2. 비밀번호 입력 \nstep3. 이름입력  \nstep4. 주소입력");
		System.out.println();
		
		String[] list = {"win","홍길동", "서울시 서초구"};
		int[] num = {123, 01234};

		Scanner sc = new Scanner(System.in);

		/**/
		Member m = new Member();

		while (true) {
			System.out.print("id를 입력하세요 : ");
			m.id = sc.nextLine();
			System.out.print("비밀번호를 입력하세요 : ");
			m.pwd = sc.nextInt();
			System.out.println("이름을 입력하세요 : ");
			m.name = sc.nextLine();
			System.out.println("주소를 입력하세요 : ");
			m.adress = sc.nextLine();			
			System.out.println("주소를 입력하세요 : ");
			m.phone = sc.nextInt();
			
			if(!list[0].equals(m.id)) {
				System.out.println("아이디가 다시");
			}else if(!list[1].equals(m.pwd)) {
				System.out.println("비번 다시");
			}else if(!list[2].equals(m.name)) {
				System.out.println("이름 다시");
			}else if(num[0] != m.pwd) {
				System.out.println("전화번호 다시");
			}else {
				System.out.println("회원가입 성공");
			}

		} 
		
		}//main
	
	}//SignUp


class Member {
	String id, name, adress;
	int pwd, phone;

}