package team.tjhis.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KoreanFood{

	public List<Food> orderKoreanFood(List<Food> cartList) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Food> kf = new ArrayList<>();
		
//		kf.add(new Food(1, "돼지 김치찌개", 8000, 465, "국내산"));
//		kf.add(new Food(2, "해물 된장찌개", 8000, 183, "국내산"));
//		kf.add(new Food(3, "해물 순두부찌개", 8000, 302, "국내산"));
		
		System.out.println("__________ 1인가득밥상 __________");
		System.out.println("[ MENU ]");
		
		for(Food food : kf) {
			System.out.println(food);
			cartList.add(food);
		}
			
		System.out.println("[ 9. 장바구니 가기 ]");
//		System.out.println("[ 0. 이전 페이지로 돌아가기 ]");
		System.out.println("______________________________");
			
		char answer = ' ';
		int choice = 0;
		int[] count = new int[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			count[i] = 1;
		}
		
		while(true) {
				
			System.out.print("메뉴를 선택해 주세요 : ");

			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
				case 1 :
					System.out.print("돼지 김치찌개를 장바구니에 담으시겠습니까? (y/n) : ");
					answer = sc.nextLine().charAt(0);
					
					if(answer == 'y' || answer == 'Y') {
						System.out.println("돼지 김치찌개를 장바구니에 담았습니다.");
						cartList.get(0).setCount(count[0]++);
						
					}else if(answer == 'n' || answer == 'N') {
						System.out.println("취소되었습니다.");
						
					}
					
					break;
					
				case 2 : 
					System.out.print("해물 된장찌개를 장바구니에 담으시겠습니까? (y/n) : ");
					answer = sc.nextLine().charAt(0);
					
					if(answer == 'y' || answer == 'Y') {
						System.out.println("해물 된장찌개를 장바구니에 담았습니다.");
						cartList.get(1).setCount(count[1]++);
						
					}else if(answer == 'n' || answer == 'N') {
						System.out.println("취소되었습니다.");
						
					}
					
					break;
					
				case 3 : 
					System.out.print("해물 순두부찌개를 장바구니에 담으시겠습니까? (y/n) : ");
					answer = sc.nextLine().charAt(0);
					
					if(answer == 'y' || answer == 'Y') {
						System.out.println("해물 순두부찌개를 장바구니에 담았습니다.");
						cartList.get(2).setCount(count[2]++);
						
					}else if(answer == 'n' || answer == 'N') {
						System.out.println("취소되었습니다.");
						
					}
					break;
					
				case 9 : 
//					cartList = cartManager.cart(cartList);
					break;
				
//				case 0 : 
//					System.out.print("장바구니에 담긴 음식이 모두 삭제됩니다. 그래도 돌아가시겠습니까? (y/n) : ");
//					char answer = sc.nextLine().charAt(0);
//				
//					if(answer == 'y' || answer == 'Y') {
//						cartList.clear();
//						return cartList;
//					
//					}else {
//						break;
//					}
					
				default : 
					System.out.println("메뉴를 잘못 선택하셨습니다.");
					break;
				
			}
		
		}
		
		
	}

}
