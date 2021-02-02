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
	private JButton back;
	
	private int totalPrice = 0;		// 총 주문금액 넣을 변수
	private boolean flag = true;
	private int choice = 0;
	private char answer = ' ';
	private int cnt = 0;
	private int[] foodNo = new int[3];
	private int index = 0;
	
	UpdateCart updateCart = new UpdateCart();
	
	public CartPage() {}

	public CartPage(MainFrame mf) {

		this.mf = mf;
		this.cartPage = this;
		
		this.setBounds(0, 120, 1440, 790);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
//		public void paintComponent(Graphics g) {
//			Image cart = new ImageIcon("images/cartLayout.PNG").getImage()/*.getScaledInstance(1440/2, 830/2, 0)*/;
//			g.drawImage(cart, 0, 0, 1440/2, 830/2, null);
//		}
		

/* 레이아웃 */
		Image cart = new ImageIcon("images/cart.PNG").getImage().getScaledInstance(1440, 790, 0);
		JLabel layout = new JLabel(new ImageIcon(cart));
		layout.setBounds(0, 0, 1440, 790);
		
/* 라벨 */
//		Image cartTitle = new ImageIcon("images/cartTitle.JPG").getImage().getScaledInstance(1440, 207, 0);
//		JLabel top = new JLabel(new ImageIcon(cartTitle));
//		top.setBounds(0, 0, 1440, 207);
//		
//		Image cartBottom = new ImageIcon("images/cartBottom.JPG").getImage().getScaledInstance(1440, 170, 0);
//		JLabel bottom = new JLabel(new ImageIcon(cartBottom));
//		bottom.setBounds(0, 622, 1440, 170);
		
		JPanel cartList = new JPanel();
		cartList.setLayout(new GridLayout(1, 3));
		cartList.setBounds(265, 207, 910, 415);
		cartList.setBackground(Color.BLACK);

		
		JLabel list1 = new JLabel();
		list1.setBackground(Color.WHITE);		

		JLabel list2 = new JLabel();
		list2.setBackground(Color.BLUE);		
		
		JLabel list3 = new JLabel();
		list3.setBackground(Color.WHITE);		
		
		
		
/* 버튼 */		
//		JButton backBtn = new JButton("더 담으러 가기");
//		backBtn.setBounds(484/2, (303-160)/2, 250/2, 32/2);
//		layout.add(backBtn);
//		
//		JButton orderBtn = new JButton("주문하기");
//		orderBtn.setBounds(620/2, (864-160)/2, 200/2, 50/2);
//		layout.add(orderBtn);
//
//		JButton minusBtn1 = new JButton("-");
//		minusBtn1.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(minusBtn1);
//
//		JButton minusBtn2 = new JButton("-");
//		minusBtn2.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(minusBtn2);
//		
//		JButton minusBtn3 = new JButton("-");
//		minusBtn3.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(minusBtn3);
//
//		JButton plusBtn1 = new JButton("+");
//		plusBtn1.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(plusBtn1);
//		
//		JButton plusBtn2 = new JButton("+");
//		plusBtn2.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(plusBtn2);
//		
//		JButton plusBtn3 = new JButton("+");
//		plusBtn3.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(plusBtn3);
//		
//		JButton deleteBtn1 = new JButton("X");
//		deleteBtn1.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(deleteBtn1);
//		
//		JButton deleteBtn2 = new JButton("X");
//		deleteBtn2.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(deleteBtn2);
//		
//		JButton deleteBtn3 = new JButton("X");
//		deleteBtn3.setBounds(570/2, 730/2, 300/2, 32/2);
//		layout.add(deleteBtn3);
/* 버튼 이벤트 처리 */
//		
//		/* [주문하기] 버튼 누른 경우 */
//		orderBtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				PopUpPage.successPopUp(mf, "주문이 완료되었습니다.");	
//			}			
//		});
//		
//		
//		/* [더 담으러 가기] 버튼 누른 경우 */
//		backBtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				ChangePanel.changePanel(mf, cartPage, np);
//			}
//		});
		
		
//		cartPage.add(top);
//		cartPage.add(bottom);
//		cartPage.add(cartList);
//		cartList.add(list1);
//		cartList.add(list2);
//		cartList.add(list3);
		
		cartPage.add(layout);
		mf.add(cartPage);

		
	}
//
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == back) {
//			ChangePage.changePanel(mf, cartPage, new ChineseFoodPage(mf));	
//		}
//	}//actionPerformed
	
	
	
}//class
