package team.tjhis.gui;
	
import java.awt.Color;
import java.awt.Image;
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
		this.koreanFoodPage = this;
		
		/* y는 120 추가로 빼줄 것 */ 
		this.setBounds(0, 120, 1440, 790);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		Image restaurant = new ImageIcon("images/koreanFood.PNG").getImage().getScaledInstance(1274, 634, 0);
		
		JLabel label = new JLabel(new ImageIcon(restaurant));
		label.setBounds(82, 54, 1274, 634);
		
		JButton btn1 = new JButton("담기");
		btn1.setSize(150, 50);
		btn1.setLocation(559-82, 380);
		btn1.setBackground(new Color(0, 122, 251));
		btn1.setForeground(Color.white);

		JButton btn2 = new JButton("담기");
		btn2.setSize(150, 50);
		btn2.setLocation(841, 571);
		btn2.setBackground(new Color(0, 122, 251));
		btn2.setForeground(Color.white);

		JButton btn3 = new JButton("담기");
		btn3.setSize(150, 50);
		btn3.setLocation(1135, 571);
		btn3.setBackground(new Color(0, 122, 251));
		btn3.setForeground(Color.white);

		JButton cartListButton = new JButton("장바구니로 이동");
		cartListButton.setSize(200, 50);
		cartListButton.setLocation(815, 781);
		cartListButton.setBackground(new Color(0, 122, 251));
		cartListButton.setForeground(Color.white);
			
			this.addMouseListener(new MyMouseAdapter());

			koreanFoodPage.add(label);
			
			koreanFoodPage.add(cartListButton);
			label.add(btn1);
			label.add(btn2);
			label.add(btn3);

			mf.add(koreanFoodPage);
		}
		
	private class MyMouseAdapter extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
//			ChangePage.changePage(mf, koreanFoodPage, new CartPage(mf));
//		}
		
	}
		

	}


}
