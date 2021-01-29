package team.tjhis.order;

import java.util.ArrayList;
import java.util.Scanner;

public class JapaneseFood extends Food {

	public JapaneseFood() {
		super();
	}

	public JapaneseFood(String foodName, int price, int calorie, String countryOfOrigin) {
		super(foodName, price, calorie, countryOfOrigin);
	}

	public void orderJapaneseFood(Cart cart) {

		Scanner sc = new Scanner(System.in);

		System.out.println("======= 김태완 스시 =======");
		System.out.println("1. 연어초밥 10ps");
		System.out.println("9. 카테고리로 돌아가기");
		int choice = sc.nextInt();

		sc.nextLine();
		
		String foodName = "";
		int price = 0;
		int calorie = 0;
		String countryOfOrigin = "";

		switch (choice) {
		case 1:
			System.out.println("연어초밥을 장비구니에 추가하시겠습니까? [y/n]: ");
			char confirm = sc.next().charAt(0);

			if (confirm == 'y') {

				System.out.println("가격은 12000원 입니다. 장바구니에 추가되었습니다.");
				foodName = "연어초밥10ps";
				price = 12000;
				calorie = 500;
				countryOfOrigin = "노르웨이";

//				cart.getCart().add(foodName);
//				cart.getCart().add(price);
//				cart.getCart().add(calorie);
//				cart.getCart().add(countryOfOrigin);
			}
			break;	
		case 9:
			System.out.println("메뉴 카테고리로 돌아갑니다.");
			return;
		default:
			System.out.println("번호를 잘못 입력하셨습니다.");
			break;
		}

	}

}
