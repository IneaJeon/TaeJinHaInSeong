package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChineseFoodPage extends JPanel {

	private MainFrame mf;
	private JPanel cfPage;
	
	public ChineseFoodPage(){}
	
	public ChineseFoodPage(MainFrame mf) {

		this.mf = mf;
		this.cfPage = this;
		
		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.WHITE);

		Image restaurant = new ImageIcon("images/chineseFood.png").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel chineseFood = new JLabel(new ImageIcon(restaurant));
		chineseFood.setBounds(0, 0, 1440, 790);
		
		JButton menuBtn1 = new JButton();
		menuBtn1.setSize(140, 50);
		menuBtn1.setLocation(575, 464);
		menuBtn1.setOpaque(false);

		JButton btn2 = new JButton();
		btn2.setSize(140, 50);
		btn2.setLocation(855, 464);
		btn2.setOpaque(false);

		JButton btn3 = new JButton();
		btn3.setSize(140, 50);
		btn3.setLocation(1150, 464);
		btn3.setOpaque(false);

		JButton goCart = new JButton();
		goCart.setSize(190, 50);
		goCart.setLocation(840, 674);
		goCart.setOpaque(false);		
		

		cfPage.add(chineseFood);
		cfPage.add(goCart);
		
		cfPage.add(menuBtn1);
		cfPage.add(btn2);
		cfPage.add(btn3); 

		mf.add(cfPage);
	
		menuBtn1.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/addCart.png");
				CartPage.count++;
			}
	
		});
	
		btn2.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/onlyJjajang.png");
			}
	
		});
	
		btn3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/onlyJjajang.png");
	
			}
	
		});
	
		goCart.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(CartPage.count == 0) {
					PopUpPage.popUp(mf, "images/emptyCart.png");
					
				}else {					
					ChangePage.changePanel(mf, cfPage, new CartPage(mf));
				}
				
			}
	
		});
	
			
	
	}
	
}

