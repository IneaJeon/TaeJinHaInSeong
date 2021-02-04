package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginHeader extends JPanel{

	private MainFrame mf;
	private JPanel header;
	
	public LoginHeader() {}
	public LoginHeader(MainFrame mf) {
		this.mf = mf;
		this.header = this;
		
		Image headerImage = new ImageIcon("images/loginHeader.PNG").getImage().getScaledInstance(1440, 120, 0);
		
		JLabel hlabel = new JLabel(new ImageIcon(headerImage));
		hlabel.setBounds(0, 0, 1440, 120);
		
		this.setBounds(0, 0, 1440, 120);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		JButton goMainPage = new JButton(); // 로고 버튼
		JButton goMyPage = new JButton(); // 마이페이지 버튼
		
		goMainPage.setBounds(656, 58, 107, 37);
		goMyPage.setBounds(1314, 65, 91, 25);
		
		goMainPage.setOpaque(false);
		goMyPage.setOpaque(false);
		
		header.add(hlabel);
		header.add(goMyPage);
		header.add(goMainPage);
		mf.add(header);
		
		goMainPage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.returnMainPage(mf, MainFrame.body);
				
			}
			
		});
		
		goMyPage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, MainFrame.body, new MyPage(mf));
				
			}
			
		});
		
	}
	
}
