package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchoolFoodPage extends JPanel{

	private MainFrame mf;
	private JPanel sfp;
	private int index = 0;
	
	public SchoolFoodPage() {}
	public SchoolFoodPage(MainFrame mf) {
		
		this.mf = mf;
		this.sfp = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.WHITE);
		String[] name = new String[] {"떡볶이", "모듬튀김", "순대", ""};
		Image sf = new ImageIcon("images/SchoolFood.png").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel sfLabel = new JLabel(new ImageIcon(sf));
		sfLabel.setBounds(0, 0, 1440, 790);
		this.add(sfLabel);
		
		JButton[] buttons = new JButton[4];
		for(int i = 0 ; i < buttons.length ; i++) {
			
			buttons[i] = new JButton(name[i]);
			buttons[i].setOpaque(false);
			this.add(buttons[i]);
			
		}
		
		buttons[0].setBounds(568, 462, 150, 50);
		buttons[1].setBounds(850, 462, 150, 50);
		buttons[2].setBounds(1144, 462, 150, 50);
		buttons[3].setBounds(835, 672, 200, 50);
		
				
		
		for(int i = 0 ; i < buttons.length - 1 ; i++) {
			
			index = i;
			
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					PopUpPage.successPopUp(mf, buttons[index].getText() + "을(를) 장바구니에 담았습니다");
					
					
				}
				
			});
			
		}		
		
	}
	
}
