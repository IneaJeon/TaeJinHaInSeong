package team.tjhis.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FastFood {

	public void oderFastFood(List<Food> cartList) {

		List<Food> ff = new ArrayList<>();

		ff.add(new Food(1, "패밀리팩", 25400, 1517, "국내산"));
		ff.add(new Food(2, "올스타팩", 22400, 1117, "국내산"));
		ff.add(new Food(3, "징거버거세트", 7900, 800, "국내산"));

		Scanner sc = new Scanner(System.in);

		System.out.println("정직한 음식이 만드는 행복한 세상! KFC");
		System.out.println("1. 메뉴선택");
		System.out.println("1번 패밀리팩 \n가격 : 25400원, 칼로리 1517, 원산지 돼지고기(국내산)");
		System.out.println("2번 올스타팩 \n가격 22400원, 칼로리 1117, 원산지 돼지고기(국내산)");
		System.out.println("3번 징거버거세트 \n가격 7900원, 칼로리 800, 원산지 돼지고기(국내산)");

		/* 메뉴 */
		for (Food food : ff) {
			System.out.println(food);
			cartList.add(food);
		}

		int choice = 0;
		int index = 0;

		while (true) {

			System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
			choice = sc.nextInt();
			char answer = ' ';

			switch (choice) {

			case 1:
				System.out.println("패밀리팩을 선택 하셨습니다. 장바구니에 담으시겠습니까?");
				answer = sc.nextLine().charAt(0);

				if (answer == 'y' || answer == 'Y') {
					System.out.println("패밀리팩을 장바구니에 담았습니다.");
					cartList.get(0).setCount(cartList.get(1).getCount() + 1);

				} else if (answer == 'n' || answer == 'N') {
					System.out.println("취소되었습니다.");
				}
				break;
			case 2:
				System.out.println("올스타팩을 선택 하셨습니다. 장바구니에 담으시겠습니까?");
				answer = sc.nextLine().charAt(0);

				if (answer == 'y' || answer == 'Y') {
					System.out.println("올스타팩을 장바구니에 담았습니다.");
					cartList.get(1).setCount(cartList.get(1).getCount() + 1);

				} else if (answer == 'n' || answer == 'N') {
					System.out.println("취소되었습니다.");
				}
				break;
			case 3:
				System.out.println("징거버거세트를 선택 하셨습니다. 장바구니에 담으시겠습니까?");
				answer = sc.nextLine().charAt(0);

				if (answer == 'y' || answer == 'Y') {
					System.out.println("올스타팩을 장바구니에 담았습니다.");
					cartList.get(2).setCount(cartList.get(2).getCount() + 1);

				} else if (answer == 'n' || answer == 'N') {
					System.out.println("취소되었습니다.");

				}
				break;
			case 9:
//				cartManager.cart(cartList);
				System.out.println("이용해 주셔서 감사합니다."); // cartList
				break;

			default:
				System.out.println("잘못 입력 하셨습니다. 다시 선택해 주세요");
				break;
			}
		}
	}// oderFastFood
}// Food
