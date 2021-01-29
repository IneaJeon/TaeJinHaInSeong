package team.tjhis.order;

import java.util.ArrayList;
import java.util.Scanner;

public class JapaneseFood /* extends JPanel */ {

	ArrayList<Food> foodList = new ArrayList<>();

	public void orderJapaneseFood(ArrayList<Food> foodList) {

		Scanner sc = new Scanner(System.in);

		char confirm;
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;

		while (true) {

			System.out.println();
			System.out.println("======= 김태완 스시 =======");
//			System.out.println(new Food(1, "연어초밥 10ps", 12000, 500, "노르웨이"));
//			System.out.println(new Food(2, "싱싱회덮밥", 7000, 450, "국내산"));
//			System.out.println(new Food(3, "캘리포니아 롤", 13000, 800, "국내산"));
			System.out.println("9. 음식 카테고리로 돌아가기");
			System.out.print("메뉴를 선택해주세요 : ");

			int choice = sc.nextInt();

			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.println("연어초밥을 장바구니에 추가하시겠습니까? [y/n]: ");
				confirm = sc.next().charAt(0);

				if (confirm == 'y' | confirm == 'Y') {

					System.out.println("장바구니에 추가되었습니다.");
//					foodList.add(new Food("연어초밥", 12000)); 
//					foodList.get(0).setCount(countOne += 1);
					break;
				} else {
					break;
				}

			case 2:
				System.out.println("싱싱회덮밥을 장바구니에 추가하시겠습니까? [y/n]: ");
				confirm = sc.next().charAt(0);

				if (confirm == 'y' | confirm == 'Y') {

					System.out.println("장바구니에 추가되었습니다.");
//					foodList.add(new Food("싱싱회덮밥", 7000));
//					foodList.get(1).setCount(countTwo += 1);
					break;
				} else {
					break;
				}

			case 3:
				System.out.println("캘리포니아롤을 장바구니에 추가하시겠습니까? [y/n]: ");
				confirm = sc.next().charAt(0);

				if (confirm == 'y' | confirm == 'Y') {

					System.out.println("장바구니에 추가되었습니다.");
//					foodList.add(new Food("캘리포니아롤", 12000)); 
//					foodList.get(2).setCount(countThree += 1);
					break;
				} else {
					break;
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
