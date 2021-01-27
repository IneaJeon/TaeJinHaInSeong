package team.tjhis.order;

import java.util.Scanner;

public class OrderManager {

	public void order() {

		Scanner sc = new Scanner(System.in);

		KoreanFood koreanFood = new KoreanFood();
		SchoolFood schoolFood = new SchoolFood();
		JapaneseFood japaneseFood = new JapaneseFood();
		ChineseFood chineseFood = new ChineseFood();
		FastFood fastFood = new FastFood();
		CartManager cartManager = new CartManager();

		System.out.println("====== 주문하기 ======");
		System.out.println("1. 한식");
		System.out.println("2. 분식");
		System.out.println("3. 일식");
		System.out.println("4. 중식");
		System.out.println("5. 패스트푸드");
		System.out.println("6. 장바구니");
		System.out.println("9. 주문하기 종료");
		int choice = sc.nextInt();

		sc.nextLine();

		switch (choice) {
		case 1:
			koreanFood.orderKoreanFood();
			break;
		case 2:
//			schoolFood.orderSchoolFood();
			break;
		case 3:
			japaneseFood.orderJapaneseFood();
			break;
		case 4:
//			chineseFood.orderChineseFood();
			break;
		case 5:
//			fastFood.orderFastFood();
			break;
		case 6:
//			cartManager.?????();
		case 9:
			System.out.println("주문하기 종료");
			return;
		default:
			System.out.println("번호를 잘못 입력하셨습니다.");
			break;
		}
	}

}
