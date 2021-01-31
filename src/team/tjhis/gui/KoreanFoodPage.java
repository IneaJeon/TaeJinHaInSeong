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
		
		/* y는 160 추가로 빼줄 것 */ 
		this.setBounds(0, 160/2, 1440/2, 830/2);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		Image restaurant = new ImageIcon("images/koreanFood.PNG").getImage().getScaledInstance(1274/2, 634/2, 0);
		
		JLabel label = new JLabel(new ImageIcon(restaurant));
		label.setBounds(82/2, (210-160)/2, 1274/2, 634/2);
		
		JButton choice1 = new JButton("담기");
		choice1.setBounds((508-82)/2, (493-50)/2, 249/2, 50/2);

		JButton choice2 = new JButton("담기");
		choice2.setBounds((790-82)/2, (493-50)/2, 249/2, 50/2);
		
		JButton choice3 = new JButton("담기");
		choice3.setBounds((1084-82)/2, (493-50)/2, 249/2, 50/2);

		JButton goCart = new JButton("장바구니로 이동");
			goCart.setBounds(590/2, (894-160)/2, 249/2, 50/2);

			
			this.addMouseListener(new MyMouseAdapter());

			koreanFoodPage.add(label);
			
			koreanFoodPage.add(goCart);
			label.add(choice1);
			label.add(choice2);
			label.add(choice3);

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
