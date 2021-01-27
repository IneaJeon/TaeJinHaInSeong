package team.tjhis.order;

import java.util.Scanner;

public class ChineseFood extends Food {

	// 기본 생성자
	public ChineseFood() {
		super();
	}
	
	public void orderChineseFood() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("__________강남반점__________");
		System.out.println();
		System.out.println("[ 1. 짜장면 ]");
		System.out.println("[ 2. 짬뽕 ]");
		System.out.println("[ 3. 탕수육 ]");
		System.out.println("[ 9. 돌아가기 ]");
		System.out.println("__________________________");
		System.out.println();
		System.out.print("메뉴를 선택해 주세요 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		
			case 1 : break;
			case 2 : break;
			case 3 : break;
			case 9 : break;
			default :
			
		}
	
	
	
	}
}
