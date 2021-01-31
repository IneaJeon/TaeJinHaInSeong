package team.tjhis.gui;

import javax.swing.JPanel;

public class ChangePage {

	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		
		mf.remove(op);
		mf.add(np);
		mf.repaint();
		
	}
	
	public static void returnMainPage(MainFrame mf, JPanel op) {
		
		mf.remove(op);
		mf.add(new MainPage(mf));
		mf.repaint();
		
	}
	
}
