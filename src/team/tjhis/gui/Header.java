package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header extends JPanel {

	private MainFrame mf;
	private JPanel header;
	
	public Header() {}
	public Header(MainFrame mf) {
		this.mf = mf;
		this.header = this;
		
		Image headerImage = new ImageIcon("images/header.PNG").getImage().getScaledInstance(1440/2, 160/2, 0);
		
		JLabel hlabel = new JLabel(new ImageIcon(headerImage));
		hlabel.setBounds(0, 0, 1440/2, 160/2);
		
		this.setBounds(0, 0, 1440/2, 160/2);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		header.add(hlabel);
		mf.add(header);
	}
}
