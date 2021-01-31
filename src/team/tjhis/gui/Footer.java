package team.tjhis.gui;

import java.awt.Color;

import javax.swing.JPanel;

public class Footer extends JPanel {

	private MainFrame mf;
	private JPanel footer;
	
	public Footer() {}
	public Footer(MainFrame mf) {
		this.mf = mf;
		this.footer = this;
		
		this.setBounds(0, 990/2, 1440/2, 110/2);
		this.setBackground(new Color(0, 122, 251));
		
		mf.add(footer);
	}
}
