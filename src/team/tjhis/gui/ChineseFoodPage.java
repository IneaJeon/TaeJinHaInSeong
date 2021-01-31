package team.tjhis.gui;

import java.awt.Color;

import javax.swing.JPanel;

public class ChineseFoodPage extends JPanel {

	private MainFrame mf;
	private JPanel cfPage;
	
	public ChineseFoodPage(){}
	
	public ChineseFoodPage(MainFrame mf) {

		this.mf = mf;
		this.cfPage = this;
		
		this.setBounds(0, 160/2, 1440/2, 830/2);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
	}
}
