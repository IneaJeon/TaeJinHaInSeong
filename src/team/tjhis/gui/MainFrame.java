package team.tjhis.gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public MainFrame() {
		
		this.setBounds(0, 160/2, 1440/2, 830/2);
		this.setLayout(null);
		
		new MainPage(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	
}
