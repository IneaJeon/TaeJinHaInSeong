package team.tjhis.order;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolFood extends Food {
	
	private ArrayList<Food> foodList = new ArrayList<>();

	public SchoolFood() {}

	public SchoolFood(String foodName, int price, int calorie, String countryOfOrigin) {
//		super(foodName, price, calorie, countryOfOrigin);
	}

	public void orderSchoolFood(FoodDB foodDB, Cart cart ) {
		
		foodList.clear(); // 메소드 호출하면 foodList안의 요소들을 제거하고 시작
		int choice;
		Scanner sc = new Scanner(System.in);
//		for(int i = 0 ; i < foodDB.getDb().size() ; i++) {
//			if(foodDB.getDb().get(i) instanceof SchoolFood) { // 자료형이 SchoolFood인 음식들을 데이터베이스에서 찾아서
//				foodList.add(foodDB.getDb().get(i)); // foodList에 저장한다.
//			}
//		}
		
		System.out.println("__________ 음식 리스트 __________");
		for(int i = 0 ; i < foodList.size() ; i++) {
			System.out.println((i + 1) + ". " + foodList.get(i)); // foodList에 저장해놓은 값으로 메뉴 출력
		}
		System.out.println("0. 카테고리 선택 페이지로 돌아가기");
		
		choice = sc.nextInt(); // 번호 선택
		sc.nextLine(); // 버퍼 제거
		if(choice == 0) { // 0번 선택시 되돌아가기
			return;
		} else if(choice > 0 && choice <= foodList.size()) { // 1 ~ 메뉴 마지막번호 선택시
//			cart.getCart().add(foodList.get(choice - 1)); // 카트에 해당 음식 담기
			System.out.println(foodList.get(choice - 1).getFoodName() + "을(를) 장바구니에 담았습니다."); // 담은 음식 이름 출력
		} else {
			System.out.println("잘못 입력 하셨습니다.");
			System.out.println("다시 입력해 주세요.");
		}
		
	}
	
}
