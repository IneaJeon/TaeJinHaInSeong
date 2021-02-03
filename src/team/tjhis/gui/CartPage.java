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


/* 레이아웃 */
		Image cart = new ImageIcon("images/cart.PNG").getImage().getScaledInstance(1440, 790, 0);
		JLabel cartLabel = new JLabel(new ImageIcon(cart));
		cartLabel.setBounds(0, 0, 1440, 790);

		
/* 라벨 */
		JLabel cntLabel = new JLabel(count + "");
		cntLabel.setBounds(1010, 286, 29, 22);

		JLabel priceLabel = new JLabel(count*8000 + "");
		priceLabel.setBounds(1010, 246, 50, 22);
		
		JLabel totalPriceLabel = new JLabel(count*8000 + "");
		totalPriceLabel.setBounds(1100, 630, 50, 22);
		
		
/* 주문수량이 1인 경우 [-]버튼 색상 변경 및 이벤트 처리 */
		if(count == 1) {
			
			Image minus = new ImageIcon("images/cart-gray.PNG").getImage().getScaledInstance(20, 22, 0);
			JLabel grayMinus = new JLabel(new ImageIcon(minus));
			grayMinus.setBounds(973, 286, 20, 22);
			cartLabel.add(grayMinus);
			
			JButton minusBtn1 = new JButton("[-]");
			minusBtn1.setBounds(973, 286, 20, 22);
			cartLabel.add(minusBtn1);
			minusBtn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					PopUpPage.popUp(mf, "최소 주문 수량은 1개입니다.");
				}
			});
		}
		

/* 버튼 */		
		JButton minusBtn = new JButton("[-]");
		minusBtn.setBounds(973, 286, 20, 22);
		minusBtn.setOpaque(false);

		JButton plusBtn = new JButton("[+]");
		plusBtn.setBounds(1056, 286, 20, 22);
		plusBtn.setOpaque(false);

		JButton deleteBtn = new JButton("[X]");
		deleteBtn.setBounds(1145, 263, 30, 30);
		deleteBtn.setOpaque(false);

		JButton orderBtn = new JButton("[주문하기]");
		orderBtn.setBounds(620, 690, 200, 50);
		orderBtn.setOpaque(false);
		

/* 버튼 이벤트 처리 */
		
		/* [-] 버튼 누른 경우 */
		minusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				updateCart.minusMenu(mf, cartPage, count);
			}
		});
		
		/* [+] 버튼 누른 경우 */
		plusBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				updateCart.plusMenu(mf, cartPage, count);
			}
		});
		
		
		/* [X] 버튼 누른 경우 */
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				
				updateCart.deleteMenu(mf, cartPage);
			}
		});
		
		/* [주문하기] 버튼 누른 경우 */
		orderBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				PopUpPage.popUp(mf, "주문이 완료되었습니다.");	
				ChangePage.returnMainPage(mf, cartPage);				
			}			
		});
		
		cartPage.add(cartLabel);
		
		cartLabel.add(cntLabel);
		cartLabel.add(priceLabel);
		cartLabel.add(totalPriceLabel);
		
		cartPage.add(minusBtn);
		cartPage.add(plusBtn);
		cartPage.add(deleteBtn);
		cartPage.add(orderBtn);
		
		mf.add(cartPage);

		
	}//생성자

	
}//class
