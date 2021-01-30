package team.tjhis.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChineseFood {

	public List<Food> orderChineseFood(List<Food> cartList, CartManager cartManager) {
		
		Scanner sc = new Scanner(System.in);
		
		// 중국음식 메뉴 목록 담을 리스트 생성
		List<Food> cf = new ArrayList<>();
		
		// 메뉴 목록 어레이리스트에 추가
//		cf.add(new Food(1, "짜장면", 6000, 864, "국내산"));
//		cf.add(new Food(2, "짬뽕", 8000, 788, "국내산"));
//		cf.add(new Food(3, "탕수육", 15000, 450, "국내산"));

		printMenu(cf);	// 메뉴 출력
		
		// 장바구니 목록에 메뉴 목록 미리 담아두기
		for(Food food : cf) {
			cartList.add(food);	
		}

		int choice = 0;	// 선택 메뉴 저장
		int index = 0;	// cartList의 인덱스
		String name = "";
		char answer = ' ';
		boolean flag = true;
		
		while(true) {
			
			System.out.print("메뉴를 선택해 주세요 : ");
			
			choice = sc.nextInt();
			sc.nextLine();	// 버퍼 제거
			index = choice - 1;	// 인덱스 계산(메뉴 번호는 1부터 시작, index는 0부터 시작)
			
		/* 음식을 선택한 경우 */
			if(0 < choice && choice <= cartList.size())	{ 
				
				name = cartList.get(index).getFoodName();	// 선택한 음식의 이름 name에 저장
				
				System.out.print(name + "을 장바구니에 담으시겠습니까?(y/n) : ");
				answer = sc.nextLine().charAt(0);
				
				if(answer == 'Y' || answer == 'y') {
				
					// 선택한 음식 인스턴스의 count변수에 저장된 값 1 증가시키기
					cartList.get(index).setCount(cartList.get(index).getCount() + 1);
					System.out.println(name + "을 장바구니에 담았습니다.");
					System.out.println();
					flag = false;
				
				}else if(answer == 'N' || answer == 'n') {
					
					System.out.println("취소되었습니다.");
					System.out.println();
				}	// 버튼 2개 구현 및 버튼 클릭 시에만 실행 예정이라 else는 작성 x
		
				
		/* 장바구니로 이동을 선택한 경우 */
			}else if(choice == 9) {
				cartList = cartManager.cart(cartList);
				if(cartList.size() == 0) return cartList;	// 주문 완료된 경우
				printMenu(cf);	// 더 담을 경우
			
//		/* 이전 페이지로 돌아가기를 선택한 경우(추후 구현) */
//			}else if(choice == 0) {
//				if(flag) {
//					System.out.println("이전 페이지로 돌아갑니다.");
//					System.out.println();
//					return cartList;
//				}
//			
//				System.out.print("장바구니에 담긴 음식이 모두 삭제됩니다. 그래도 돌아가시겠습니까?(y/n) : ");
//				answer = sc.nextLine().charAt(0);
//				
//				if(answer == 'y' || answer == 'y') {						
//					cartList.clear();
//					System.out.println("이전 페이지로 돌아갑니다.");
//					System.out.println();
//					return cartList;
//					
//				}else if(answer == 'N' || answer == 'n') {
//					System.out.println("취소되었습니다.");
//					System.out.println();
//				}
				
		/* 예외 처리 */
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해 주세요.");
			}
	
		}
		
	}
	
	public void printMenu(List<Food> cf) {
		
		System.out.println();
		System.out.println("__________강남반점__________");
		System.out.println();
		System.out.println("[ MENU ]");
		System.out.println();
		
		for(Food food : cf) {
			System.out.println(food);
		}
		
		System.out.println();
		System.out.println("9. 장바구니로 이동");
		System.out.println("0. 이전 페이지로 돌아가기");
		System.out.println("__________________________");
		System.out.println();
	}
}
