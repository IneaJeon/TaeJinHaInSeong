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
		
		this.setBounds(0, 120, 1440, 790);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
	}
}
