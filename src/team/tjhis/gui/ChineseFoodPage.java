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
	private int count;
	
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
		
		JButton btn1 = new JButton();
		btn1.setSize(140, 50);
		btn1.setLocation(575, 464);
		btn1.setOpaque(false);

		JButton btn2 = new JButton();
		btn2.setSize(140, 50);
		btn2.setLocation(855, 464);
		btn2.setOpaque(false);

		JButton btn3 = new JButton();
		btn3.setSize(140, 50);
		btn3.setLocation(1150, 464);
		btn3.setOpaque(false);

		JButton cartListButton = new JButton();
		cartListButton.setSize(190, 50);
		cartListButton.setLocation(840, 674);
		cartListButton.setOpaque(false);		
		

		cfPage.add(chineseFood);
		cfPage.add(cartListButton);
		
		cfPage.add(btn1);
		cfPage.add(btn2);
		cfPage.add(btn3); 

		mf.add(cfPage);
	
		btn1.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/addCart.png");
				count++;
			}
	
		});
	
		btn2.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/unableToOrder.png");
			}
	
		});
	
		btn3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/unableToOrder.png");
	
			}
	
		});
	
		cartListButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, cfPage, new CartPage(mf, count));
				
			}
	
		});
	
			
	
	}
	
}

