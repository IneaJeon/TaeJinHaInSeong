package team.tjhis.gui;

import java.awt.Color;

import javax.swing.JPanel;

public class Header extends JPanel {

	private MainFrame mf;
	private JPanel header;
	
	public Header() {}
	public Header(MainFrame mf) {
		this.mf = mf;
		this.header = this;
		
		this.setBounds(0, 0, 1440/2, 160/2);
		this.setLayout(null);
		this.setBackground(new Color(0, 122, 251));
		
		mf.add(header);
	}
}
