package team.tjhis.order;

import java.util.List;
import java.util.Scanner;

public class CartManager {

	public List<Food> cart(List<Food> cartList){
		
		int totalPrice = 0;		// 총 주문금액 넣을 변수
		boolean flag = true;
		int choice = 0;
		char answer = ' ';
		int cnt = 0;
		int[] foodNo = new int[cartList.size()];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		UpdateCart updateCart = new UpdateCart();
		
		while(true) {
			
			System.out.println();
			System.out.println("__________ 장바구니 목록 __________");
			System.out.println();
			
			cnt = 0;
			totalPrice = 0;
			flag = true;
			// 주문 목록 출력
			for(Food food : cartList) {
				
				// 주문 수량이 0일 경우 출력하지 않음
				if(food.getCount() == 0)
					continue;
				
				System.out.println("이름 : " + food.getFoodName() + ", 수량 : " + food.getCount() + ", 가격 : " + food.getPrice()*food.getCount());
				totalPrice += food.getPrice()*food.getCount();
				foodNo[cnt++] = food.getFoodNo();
				flag = false;	// 장바구니에 담은 메뉴가 있을 경우 flag를 false로 변경
			}
			
			if(flag) {	// 장바구니가 비어 있는 경우
				System.out.println("장바구니에 담으신 메뉴가 없습니다.");
				System.out.println("________________________________");
				System.out.println();
				System.out.println("이전 페이지로 돌아갑니다.");
				System.out.println();
				return cartList;
			}
			
			System.out.println();
			System.out.println("총 주문금액 : " + totalPrice + "원");
			System.out.println("________________________________");
			System.out.println();
			System.out.println("[ 1. 더 담으러 가기 ]");
			int no = 2;
			for(int i = 0 ; i < cnt ; i++) {
				System.out.println("[ " + no++ + ". " + cartList.get(foodNo[i]-1).getFoodName() + " - ]");
				System.out.println("[ " + no++ + ". " + cartList.get(foodNo[i]-1).getFoodName() + " + ]");
				System.out.println("[ " + no++ + ". " + cartList.get(foodNo[i]-1).getFoodName() + " 삭제 ]");
			}
			System.out.println("[ 0. 주문하기 ]");

			System.out.println();
			System.out.print("원하시는 항목을 선택해 주세요 : ");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			if(2 <= choice && choice < no) {
				
				index = foodNo[(choice-2) / 3] - 1;
				
				switch(choice % 3) {			
//					case 0 : cartList = updateCart.plusMenu(cartList, index); break;
//					case 1 : cartList = updateCart.deleteMenu(cartList, index); break;
//					case 2 : cartList = updateCart.minusMenu(cartList, index);
				}
			}else {
				
				switch(choice) {
					case 1 : return cartList;
					
					case 0 : 
						System.out.print("장바구니에 담긴 음식을 주문하시겠습니까?(y/n) : ");
						answer = sc.nextLine().charAt(0);
						System.out.println();
						
						if(answer == 'Y' || answer == 'y') {
							System.out.println("주문이 완료되었습니다!");
							System.out.println("배달 예상 시간은 " + ((int)(Math.random() * 10) + 30) + "분입니다.");
							System.out.println();
							cartList.clear();
							return cartList;
						}else if(answer == 'N' || answer == 'n') {
							System.out.println("취소되었습니다.");
							break;
						}
						// gui로 구현 예정이므로 예외처리 x
						
					default : System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				}
			}

		
		}//while
	}
}
