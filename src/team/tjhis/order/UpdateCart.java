package team.tjhis.order;

import javax.swing.JPanel;

import team.tjhis.gui.CartPage;
import team.tjhis.gui.ChangePage;
import team.tjhis.gui.MainFrame;
import team.tjhis.gui.PopUpPage;

public class UpdateCart {
	
	/* 수량 추가 */
	public void plusMenu(MainFrame mf, JPanel cartPage, int count){
		count++;
		ChangePage.changePanel(mf, cartPage, new CartPage(mf, count));
		
		
	}
	
	/* 수량 감소 */
	public void minusMenu(MainFrame mf, JPanel cartPage, int count){
		count--;
		ChangePage.changePanel(mf, cartPage, new CartPage(mf, count));
		
		
	}
	
	/* 장바구니에서 삭제 */
	public void deleteMenu(MainFrame mf, JPanel cartPage){
		PopUpPage.popUp(mf, "images/UpdateCart.png");
		
		
	}
	
	
	
//	public void plusMenu(List<Food> cartList, int index){
//		cartList.get(index).setCount(cartList.get(index).getCount() + 1);
//		
//	}
//	
//	public void minusMenu(List<Food> cartList, int index){
//		
//		int curCount = cartList.get(index).getCount();
//		
//		if(curCount > 1) {
//			cartList.get(index).setCount(curCount - 1);
//			
//		}else {
//			System.out.println("최소 주문수량은 1개입니다.");
//		}
//		
//	}
//	
//	public void deleteMenu(List<Food> cartList, int index){
//		cartList.get(index).setCount(0);
//		
//	}

}
