package team.tjhis.gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public static final String PATH = "src/team/tjhis/memberDB.txt";

	public MainFrame() {
		
		this.setBounds(0, 160/2, 1440/2, 830/2);
		this.setLayout(null);
		
		this.add(new MainPage(this)); // 첫 화면(메인 페이지)를 붙인다
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	
}
