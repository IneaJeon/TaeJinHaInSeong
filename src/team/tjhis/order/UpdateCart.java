package team.tjhis.order;

import java.util.List;

public class UpdateCart {
	
	public List<Food> plusMenu(List<Food> cartList, int index){
		cartList.get(index).setCount(cartList.get(index).getCount() + 1);
		
		return cartList;
		
	}
	
	public List<Food> minusMenu(List<Food> cartList, int index){
		
		int curCount = cartList.get(index).getCount();
		
		if(curCount > 1) {
			cartList.get(index).setCount(curCount - 1);
			
		}else {
			System.out.println("최소 주문수량은 1개입니다.");
		}
	
		return cartList;
		
	}
	
	public List<Food> deleteMenu(List<Food> cartList, int index){
		cartList.get(index).setCount(0);
		
		return cartList;
		
	}

}
