package team.tjhis.gui;
	
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KoreanFoodPage extends JPanel{
		
	private MainFrame mf;
	private JPanel koreanFoodPage;
	
	public KoreanFoodPage() {}
	
	public KoreanFoodPage(MainFrame mf) { 
		
		this.mf = mf;
		this.koreanFoodPage = this;		// this 대신에 koreanFoodPage로 부를 수 있도록 써준 것.

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.WHITE);
		
		Image restaurant = new ImageIcon("images/koreanFood.png").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel label = new JLabel(new ImageIcon(restaurant));
		label.setBounds(0, 0, 1440, 790);
		
		/* 돼지 김치찌개에 담기 버튼(투명으로 처리) */
		JButton btn1 = new JButton();
		btn1.setSize(140, 50);
		btn1.setLocation(575, 464);
		btn1.setOpaque(false);

		/* 해물 된장찌개 담기 버튼(투명으로 처리) */
		JButton btn2 = new JButton();
		btn2.setSize(140, 50);
		btn2.setLocation(855, 464);
		btn2.setOpaque(false);

		/* 해물 순두부찌개 담기 버튼(투명으로 처리) */
		JButton btn3 = new JButton();
		btn3.setSize(140, 50);
		btn3.setLocation(1150, 464);
		btn3.setOpaque(false);

		/* 장바구니 가기 버튼(투명으로 처리) */
		JButton cartListButton = new JButton();
		cartListButton.setSize(190, 50);
		cartListButton.setLocation(840, 674);
		cartListButton.setOpaque(false);

		koreanFoodPage.add(label);
		koreanFoodPage.add(cartListButton);
		
		koreanFoodPage.add(btn1);
		koreanFoodPage.add(btn2);
		koreanFoodPage.add(btn3); 

		mf.add(koreanFoodPage);
	
		btn1.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/UnableToOrder.png");
	
			}
	
		});
	
		btn2.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/UnableToOrder.png");

			}
	
		});
	
		btn3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/UnableToOrder.png");
	
			}
	
		});
	
		cartListButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				PopUpPage.popUp(mf, "images/emptyCart.png");
	
				
			}
	
		});
	
			
	
		}
	
	
	}
