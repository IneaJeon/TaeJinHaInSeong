package team.tjhis.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import team.tjhis.order.UpdateCart;

public class CartPage extends JPanel /* implements ActionListener */ {

	private MainFrame mf;
	private JPanel cartPage;
	
	private int totalPrice;		// 총 주문금액 넣을 변수

	UpdateCart updateCart = new UpdateCart();
	
	
	/* 기본생성자 */
	public CartPage() {}

	/* MainFrame 인스턴스를 매개변수로 가지는 생성자 */
	public CartPage(MainFrame mf, int count) {

		this.mf = mf;
		this.cartPage = this;
		
		this.setBounds(0, 120, 1440, 790);
		this.setLayout(null);
		this.setBackground(Color.WHITE);


/* 라벨 */
		Image cart = new ImageIcon("images/cart.PNG").getImage().getScaledInstance(1440, 790, 0);
		JLabel cartList = new JLabel(new ImageIcon(cart));
		cartList.setBounds(0, 0, 1440, 790);
		
		if(count == 1) {
			
			Image minus = new ImageIcon("images/cart-gray.PNG").getImage().getScaledInstance(20, 22, 0);
			JLabel grayMinus = new JLabel(new ImageIcon(minus));
			grayMinus.setBounds(973, 286, 20, 22);
			cartList.add(grayMinus);
			
			JButton minusBtn1 = new JButton("-");
			minusBtn1.setBounds(973, 286, 20, 22);
		}

		
/* 버튼 */		
		JButton minusBtn = new JButton("-");
		minusBtn.setBounds(973, 286, 20, 22);
		minusBtn.setOpaque(false);

		JButton plusBtn = new JButton("+");
		plusBtn.setBounds(1056, 286, 20, 22);
		plusBtn.setOpaque(false);

		JButton orderBtn = new JButton("주문하기");
		orderBtn.setBounds(620, 690, 200, 50);
		orderBtn.setOpaque(false);
		
		JButton deleteBtn = new JButton("X");
		deleteBtn.setBounds(1145, 263, 30, 30);
		deleteBtn.setOpaque(false);

/* 버튼 이벤트 처리 */
		
		/* [주문하기] 버튼 누른 경우 */
		orderBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				PopUpPage.successPopUp(mf, "주문이 완료되었습니다.");	
			}			
		});
		
		cartPage.add(cartList);
		cartPage.add(minusBtn);
		cartPage.add(plusBtn);
		cartPage.add(deleteBtn);
		cartPage.add(orderBtn);
		mf.add(cartPage);

		
	}//생성자

	
}//class
