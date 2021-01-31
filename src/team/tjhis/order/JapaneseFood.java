package team.tjhis.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JapaneseFood /* extends JPanel */ {

	List<Food> cartList = new ArrayList<>();

	public void orderJapaneseFood(List<Food> cartList, CartManager cartManager) {

		Scanner sc = new Scanner(System.in);

		char confirm;
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		
		Food menuOne = new Food(1, "연어초밥 10ps", 12000, 500, "노르웨이");
		Food menuTwo = new Food(2, "싱싱회덮밥", 7000, 450, "국내산");
		Food menuThree = new Food(3, "캘리포니아 롤", 13000, 800, "국내산");

		while (true) {

			System.out.println();
			System.out.println("======= 김태완 스시 =======");
			System.out.println(menuOne);
			System.out.println();
			System.out.println(menuTwo);
			System.out.println();
			System.out.println(menuThree);
			System.out.println();
			System.out.println("4. 장바구니로 이동하기");
			System.out.println();
			System.out.println("9. 음식 카테고리로 돌아가기");
			System.out.println();
			System.out.print("메뉴를 선택해주세요 : ");

			int choice = sc.nextInt();

			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.println("연어초밥을 장바구니에 추가하시겠습니까? [y/n]: ");
				confirm = sc.next().charAt(0);

				if (confirm == 'y' | confirm == 'Y') {

					System.out.println("장바구니에 추가되었습니다.");
					cartList.add(menuOne); 
					cartList.get(0).setCount(countOne += 1);
					break;
				} else {
					break;
				}

			case 2:
				System.out.println("싱싱회덮밥을 장바구니에 추가하시겠습니까? [y/n]: ");
				confirm = sc.next().charAt(0);

				if (confirm == 'y' | confirm == 'Y') {

					System.out.println("장바구니에 추가되었습니다.");
					cartList.add(menuTwo);
					cartList.get(1).setCount(countTwo += 1);
					break;
				} else {
					break;
				}

			case 3:
				System.out.println("캘리포니아롤을 장바구니에 추가하시겠습니까? [y/n]: ");
				confirm = sc.next().charAt(0);

				if (confirm == 'y' | confirm == 'Y') {

					System.out.println("장바구니에 추가되었습니다.");
					cartList.add(menuThree); 
					cartList.get(2).setCount(countThree += 1);
					break;
				} else {
					break;
				}
				
			case 4: 
				System.out.println("장바구니로 이동하시겠습니까? [y/n] : ");
				confirm = sc.next().charAt(0);
				if(confirm == 'y' | confirm == 'Y') {
					cartManager.cart(cartList);
				}

			case 9:
				System.out.println("메뉴 카테고리로 돌아갑니다.");
				return;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
