package team.tjhis.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolFood {
	
	public void orderSchoolFood(List<Food> cartList) {
		
		CartManager cm = new CartManager();
		Scanner sc = new Scanner(System.in);
		
		List<Food> sf = new ArrayList<>();
		
		sf.add(new Food(1, "떡볶이", 3500, 352, "호주산"));
		sf.add(new Food(2, "찰순대", 4000, 513, "국내산"));
		sf.add(new Food(3, "모듬튀김", 4500, 380, "중국산"));
		
		System.out.println("_______________________________");
		System.out.println("[ MENU ]");
		
		for(Food food : sf) {
			System.out.println(food);
			cartList.add(food);
		}
			
		System.out.println("[ 9. 장바구니 가기 ]");
		System.out.println("[ 0. 이전 페이지로 돌아가기 ]");
		System.out.println("______________________________");
			
		char answer = ' ';
		int choice = 0;
		
		while(true) {
				
			System.out.print("메뉴를 선택해 주세요 : ");

			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
				case 1 :
					System.out.print("떡볶이를 장바구니에 담으시겠습니까? (y/n) : ");
					answer = sc.nextLine().charAt(0);
					
					if(answer == 'y' || answer == 'Y') {
						System.out.println("떡볶이를 장바구니에 담았습니다.");
						cartList.get(0).setCount(cartList.get(0).getCount() + 1);
						
					}else if(answer == 'n' || answer == 'N') {
						System.out.println("취소되었습니다.");
						
					}
					
					break;
					
				case 2 : 
					System.out.print("찰순대를 장바구니에 담으시겠습니까? (y/n) : ");
					answer = sc.nextLine().charAt(0);
					
					if(answer == 'y' || answer == 'Y') {
						System.out.println("찰순대를 장바구니에 담았습니다.");
						cartList.get(1).setCount(cartList.get(1).getCount() + 1);
						
					}else if(answer == 'n' || answer == 'N') {
						System.out.println("취소되었습니다.");
						
					}
					
					break;
					
				case 3 : 
					System.out.print("모듬튀김을 장바구니에 담으시겠습니까? (y/n) : ");
					answer = sc.nextLine().charAt(0);
					
					if(answer == 'y' || answer == 'Y') {
						System.out.println("모듬튀김을 장바구니에 담았습니다.");
						cartList.get(2).setCount(cartList.get(2).getCount() + 1);
						
						
					}else if(answer == 'n' || answer == 'N') {
						System.out.println("취소되었습니다.");
						
					}
					break;
					
				case 9 : 
					cm.cart(cartList);
					break;
				
				case 0 : 
					System.out.print("장바구니에 담긴 음식이 모두 삭제됩니다. 그래도 돌아가시겠습니까? (y/n) : ");
					answer = sc.nextLine().charAt(0);
				
					if(answer == 'y' || answer == 'Y') {
						cartList.clear();
						return;
					}
					break;
					
				default : 
					System.out.println("메뉴를 잘못 선택하셨습니다.");
				
			}
		
		}
	
	}
	
}
