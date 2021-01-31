package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Footer extends JPanel {

	private MainFrame mf;
	private JPanel footer;
	
	public Footer() {}
	public Footer(MainFrame mf) {
		this.mf = mf;
		this.footer = this;
		
		Image footerImage = new ImageIcon("images/footer.PNG").getImage().getScaledInstance(1440, 110, 0);
		
		JLabel flabel = new JLabel(new ImageIcon(footerImage));
		flabel.setBounds(0, 990, 1440, 110);
		
		this.setBounds(0, 990, 1440, 110);
		this.setBackground(Color.WHITE);
		
		footer.add(flabel);
		
		mf.add(footer);
	}
}
