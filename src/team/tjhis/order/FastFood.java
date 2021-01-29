package team.tjhis.order;

import java.util.ArrayList;
import java.util.Scanner;

public class FastFood extends Food {
	
	ArrayList foodList = new ArrayList();
	
	/*기본생성자*/
	public FastFood() {
	}
	
	/*매개변수 생성자*/
	public FastFood(String foodName, int price, int calorie, String countryOfOrigin) {
		super(foodName, price, calorie, countryOfOrigin);
	}
	
	public void oderFastFood() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하시는 메뉴를 선택 하세요 : ");
		System.out.println("1번 패밀리팩 2번 올스타팩 3번 징거버거 세트");
		String choice = sc.nextLine();
		
		int price, calorie = 0;
		String countryOfOrigin = "";
		
		for(int i = 0 ; i < foodList.size() ; i++) {
			System.out.println((i + 1) + ". " + foodList.get(i));
		}

		switch(choice) {
		case "패밀리팩" : 
			price = 25400;
			calorie = 1517;
			countryOfOrigin = "korea";
			break;
		case "올스타팩" : 
			price = 22400;
			calorie = 1117;
			countryOfOrigin = "korea";
			break;
		case "징거버거 세트" : 
			price = 7900;
			calorie = 800;
			countryOfOrigin = "korea";
			break;
		default :
			System.out.println("준비된 상품이 없습니다.");
			return;
		}
		
		System.out.println(choice + "을 주문 하셨습니다.");		
	}

}//Food

