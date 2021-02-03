package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FastFoodPage extends JPanel {

	private MainFrame mf;
	private JPanel fastFoodPage;

	public FastFoodPage() {}

	public FastFoodPage(MainFrame mf) {

		this.mf = mf;
		this.fastFoodPage = this;
		
		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.WHITE);

		Image ff = new ImageIcon("images/fastfood.png").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel label = new JLabel(new ImageIcon(ff));
		label.setBounds(0, 0, 1440, 643);
		
		/*담기1*/
		JButton btn1 = new JButton();
		btn1.setSize(140, 50);
		btn1.setLocation(450, 500);
		btn1.setBackground(new Color(0, 122, 251));
		btn1.setForeground(Color.white);
		btn1.setOpaque(false);

		/*담기2*/
		JButton btn2 = new JButton();
		btn2.setSize(140, 50);
		btn2.setLocation(800, 500);
		btn2.setBackground(new Color(0, 122, 251));
		btn2.setForeground(Color.white);
		btn2.setOpaque(false);

		/*담기3*/
		JButton btn3 = new JButton();
		btn3.setSize(140, 50);
		btn3.setLocation(1180, 500);
		btn3.setBackground(new Color(0, 122, 251));
		btn3.setForeground(Color.white);
		btn3.setOpaque(false);

		/*장바구니 이동*/
		JButton cartButton = new JButton();
		cartButton.setSize(190, 80);
		cartButton.setLocation(780, 580);
		cartButton.setBackground(new Color(0, 122, 251));
		cartButton.setForeground(Color.white);
		cartButton.setOpaque(false);
		
		this.add(label);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(cartButton);
		
		this.addMouseListener(new MyMouseAdapter());
		

		fastFoodPage.add(label);
		mf.add(fastFoodPage);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private class MyMouseAdapter extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			ChangePage.changePanel(mf, fastFoodPage, new CartPage());
		}
	}

}
