package team.tjhis.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderManager/* extends JFrame */ {

	List<Food> cartList = new ArrayList<>();

	public void order() {

		Scanner sc = new Scanner(System.in);

		KoreanFood koreanFood = new KoreanFood();
		SchoolFood schoolFood = new SchoolFood();
		JapaneseFood japaneseFood = new JapaneseFood();
		ChineseFood chineseFood = new ChineseFood();
		FastFood fastFood = new FastFood();
		CartManager cartManager = new CartManager();

		while (true) {
			System.out.println();
			System.out.println("====== 주문하기 ======");
			System.out.println("1. 한식");
			System.out.println("2. 분식");
			System.out.println("3. 일식");
			System.out.println("4. 중식");
			System.out.println("5. 패스트푸드");
			System.out.println("9. 주문하기 종료");
			int choice = sc.nextInt();

			sc.nextLine();

			switch (choice) {
			case 1:
//			koreanFood.orderKoreanFood(cartList, cartManager);
				break;
			case 2:
//			schoolFood.orderSchoolFood(cartList, cartManager);
				break;
			case 3:
				japaneseFood.orderJapaneseFood(cartList, cartManager);
				break;
			case 4:
			chineseFood.orderChineseFood(cartList, cartManager);
				break;
			case 5:
//			fastFood.orderFastFood(cartList, cartManager); 
				break;
			case 9:
				System.out.println("주문하기 종료");
				return;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}
	}

}
